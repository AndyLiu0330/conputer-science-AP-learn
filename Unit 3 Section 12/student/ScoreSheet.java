package student;

import java.io.File; 
import java.io.IOException; 
import java.io.PrintWriter; 
import java.util.Scanner; 
import java.util.Arrays; 
/**
 * Write a description of class ScoreSheet here.
 * 
 * @author (Eric Y. Chou) 
 * @version (12/13/2015)
 */
public class ScoreSheet
{
    final static char A = 'A'; 
    final static char B = 'B';
    final static char C = 'C'; 
    final static char D = 'D';
    final static char E = 'E'; 
    final static char F = 'F'; 
    final static char N = 'N'; 
    final static char S = ' ';

    String iFileName = ""; 
    String oFileName = ""; 
    
    private char[] key; 
    private char[] answer; 
    private int questions = 0; 
    private int score = -1; 
    private double weight; 
    private boolean ready = false; 
    
    /**
     * Constructor for Score Sheet: set key and answer arrays. 
     * 
     * @param iFileName scoresheet file. 
     */
    public ScoreSheet(String iFileName, char[] key) throws IOException {
        Scanner input = new Scanner(new File(iFileName)); 
        this.questions = key.length; 
        this.iFileName = iFileName; 
        this.key = key;
    
        String token = "";       
        String names     = input.next(); 
        String studentID = input.next();  
        String testCode  = input.nextLine(); 
        int q = 0;
        
        while (input.hasNext()){
           token = input.next();
           q++; 
        }
        input.close();
        
        //System.out.println(iFileName); 
        input = new Scanner(new File(iFileName)); 
        names     = input.next(); 
        studentID = input.next();  
        testCode  = input.nextLine(); 
        answer    = new char[q]; 
        
        // set up answer array
        int j=0; 
        while (input.hasNext()){                   // read in one student's math answer row
           token = input.next(); 
           //System.out.print(token+" "); 
           answer[j] = token.charAt(0); 
           j++;
        }    
        //System.out.println(); 
        
        if (key.length == answer.length) this.ready = true; 
        else {
               this.ready=false;  
               System.out.println("Error Answer Sheet ! Nay have wrong number of answers."); 
               System.out.println("Or, the answer key is not ready... (reload if necessary)"); 
            }
        System.out.println("Score Sheet "+iFileName+" loaded."); 
        score = checkAnswer(); 
        input.close(); 
    } 
    
    /**
     * set the key array
     * 
     * @param key char[] array of answer key
     * @return void none. 
     */
    public void setKey(char[] key){
        this.key = key;
    }
    
    /**
     * set the answer array
     */
    public void setAnswer(char[] answer){
        this.answer=answer; 
    }
    
    /** 
     * load the key array
     * @return void none.
     */
    public void loadKey(char[] key){
      this.key = key; 
    }
    
    /** 
     * load the answer array from score sheet file
     */
    public void loadAnswer(String iFileName) throws IOException {
      Scanner input = new Scanner(new File(iFileName)); 
      int q = 0; 
      String token = "";       
      String names     = input.next(); 
      String studentID = input.next();        
      String testCode  = input.nextLine(); 
        
      while (input.hasNext()){
           token = input.next(); 
           q ++; 
        }
      input.close();         
      
      input = new Scanner(new File(iFileName)); 
      names = input.next(); 
      studentID = input.next(); 
      testCode  = input.nextLine(); 
      answer    = new char[q]; 

      // set up answer array
      for (int j=0; j<q ; j++){                   // read in one student's math answer row
           answer[j] = input.next().charAt(0); 
      }    
      
      if (key.length == answer.length) this.ready = true; 
      else {
             this.ready=false;  
             System.out.println("Error Answer Sheet ! Nay have wrong number of answers."); 
             System.out.println("Or, the answer key is not ready... (reload if necessary)"); 
           }
      System.out.println("Answer Sheet "+iFileName+" loaded."); 
      score = checkAnswer(); 
      input.close(); 
    } 
    
    /**
     * provide score of a single test with external key and answer
     * Not for instance use. 
     * 
     * @param key answer key of a test
     * @param answer the answer provided by a student
     * @return int score of the test (-1) for not ready. 
     */
    public static int checkAnswer(char[] key, char[] answer){
        double sum = 0; 
        for (int i=0; i<key.length; i++){
          if (key[i] == answer[i]) sum += 1.0; 
        }
       
        int score = (int) Math.round(sum/key.length*100); 
        return score; 
    }
    
    /**
     * using the current key and answer in the scoresheet to provide score
     * 
     * @return score of the test. 
     */
    public int checkAnswer(){
        double sum = 0;  
        if (!ready) return -1; 
        //System.out.println(key.toString); 
        for (int i=0; i<key.length; i++){
          if (key[i] == answer[i]) sum += 1.0; 
        }
       
        int score = (int) Math.round(sum/key.length*100); 
        this.score = score;  // both setting the instance score and returning a score; 
        return score; 
    }
    
    /**
     * Get a score for an answer sheet. 
     * 
     * @return void none. 
     */
    public char[] getAnswer(){
      return this.answer; 
    }
    
    /**
     * Get the key array
     * @return void none.
     */
    public char[] getKey(){
      return this.key; 
    }
    
    
    /**
     * Get a score for an answer sheet. 
     * 
     * @return void none. 
     */
    public int getScore(){
        return this.score; 
    }
    
    public boolean isReady(){
       return ready; 
    }
    /**
     * provide the grade code for single test. 
     * Note for instance use. 
     * 
     * @param score of the test
     * @return char grade of a single test. 
     */
    public static char getGrade(int score){ 
      char grade = S; 
        if (score>=90 && score<=100){grade = A;}
        else if (score>=80 && score<=100)  {grade = B;}
        else if (score>=70 && score<=100)  {grade = C;}
        else if (score>=60 && score<=100)  {grade = D;}
        else if (score<60 && score>= 0){grade = F;}
        else { grade = N;}
      return grade; 
    } 
    
    /**
     * provide the grade code for a single test using current answer and key. 
     * 
     * @return char grade of a single test. 
     */
    public char getGrade(){ 
      char grade = S; 
      if (!ready) return N; 
        if (score>=90 && score<=100){grade = A;}
        else if (score>=80 && score<=100)  {grade = B;}
        else if (score>=70 && score<=100)  {grade = C;}
        else if (score>=60 && score<=100)  {grade = D;}
        else if (score<60 && score>= 0){grade = F;}
        else { grade = N;}
      return grade; 
    } 
    
    public String keyToString(){
        return Arrays.toString(key);
    }
    
    public String answerToString(){
        return Arrays.toString(answer);
    }
}
