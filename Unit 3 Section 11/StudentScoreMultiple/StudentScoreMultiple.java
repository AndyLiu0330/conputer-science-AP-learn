import java.io.File; 
import java.io.IOException; 
import java.io.PrintWriter; 
import java.util.Scanner; 
/**
 * Write a description of class StudentScoreMultiple here.
 * 
 * @author (Eric Y. Chou) 
 * @version (12/05/2015)
 */
public class StudentScoreMultiple
{
    // setup for answer keys
    final static int MATH_QUESTION_NUM = 30; 
    final static int ENG_QUESTION_NUM = 25; 
    final static char A = 'A'; 
    final static char B = 'B';
    final static char C = 'C'; 
    final static char D = 'D';
    final static char E = 'E'; 
    final static char F = 'F'; 
    final static char S = ' ';
    
    final static char[] mathKey = {A, B, A, C, D, E, E, A, B, C, 
                            C, C, E, B, D, D, D, C, A, C, 
                            B, D, E, A, C, C, C, A, B, E}; 

    final static char[] engKey = {D, E, C, B, D, A, C, E, E, E, 
                           A, B, E, C, D, B, D, A, A, D, 
                           B, E, A, C, D};                         
    
    public static char randomAnswer(){
         int i = (int) (Math.random()*5);
         if (i==0)      return A; 
         else if (i==1) return B; 
         else if (i==2) return C; 
         else if (i==3) return D; 
         else           return E; 
    }
    
    public static void createAnswerSheet(File oFile, String names, String studentID) throws IOException {
         PrintWriter out = new PrintWriter(oFile); 
         out.println(names+" "+studentID);
         double bias = Math.random()*0.5 + 0.4; // random bias value ranging from 0.4 to 0.9 
         for (int i=0; i<MATH_QUESTION_NUM; i++){
             if (Math.random()<bias) out.print(mathKey[i]+" ");  else out.print(randomAnswer()+" ");
            }
         out.println();
         bias = Math.random()*0.5 + 0.42;  // random bias vaue ranging from 0.42 to 0.92
         for (int i=0; i<ENG_QUESTION_NUM; i++){
              if (Math.random()<bias) out.print(engKey[i]+" ");  else out.print(randomAnswer()+" ");
            }
         out.close(); 
    }
    
    public static void resetAnswerSheet(char[][] answerSheet){
      for (int j=0; j<MATH_QUESTION_NUM; j++) answerSheet[0][j] = S; 
      for (int j=0; j<ENG_QUESTION_NUM;  j++) answerSheet[1][j] = S; 
    } 
          
    public static int checkAnswer(char[] key, char[] answer){
        double sum = 0;  
        //System.out.println(key.toString); 
        for (int i=0; i<key.length; i++){
          if (key[i] == answer[i]) sum += 1.0; 
        }
       
        int score = (int) Math.round(sum/key.length*100); 
        return score; 
    }
    
    public static void printHeader(){
        System.out.println("                                    Washington High School        "); 
        System.out.println("                               Semester Class Score Report Card "); 
        System.out.println("========================================================================================================"); 
    }
    
   public static char getGrade(int score){
      char grade = ' '; 
        if (score>=90 && score<=100){grade = 'A';}
        else if (score>=80 && score<=100)  {grade = 'B';}
        else if (score>=70 && score<=100)  {grade = 'C';}
        else if (score>=60 && score<=100)  {grade = 'D';}
        else if (score<60 && score>= 0){grade = 'F';}
        else { grade = 'N';}
      return grade; 
    } 
    
   public static void main(String[] args) throws IOException {
       
      // read in names.txt file to determine how many student in the class
      File ifile = new File("names.txt"); 
      Scanner input = new Scanner(ifile); 
      int lines = 0; 
      String token = "";       
      
      while (input.hasNext()){
           token = input.nextLine(); 
           lines ++; 
        }
      input.close(); 
      
      ifile = new File("names.txt"); 
      input = new Scanner(ifile);
      
      // declaration of the data structures for the class
      String[] names   = new String[lines]; 
      int[] mathScore  = new int[lines];
      int[] engScore   = new int[lines];
      char[] mathGrade = new char[lines];
      char[] engGrade  = new char[lines]; 
      // new data 
      String[] studentID = new String[lines];            // student ID
      char[]   mathAnswer = new char[MATH_QUESTION_NUM]; // math answer row
      char[]   engAnswer  = new char[ENG_QUESTION_NUM];  // english answer row
      char[][] answerSheet = { mathAnswer, engAnswer };  // ragged array for the answer sheet for math and english
      
      // Generation of all random created student answer sheet files 
      // In real world, these answer sheet file should be created by the answer sheet scanner
      int count = 0; 
      while (input.hasNext()){
           names[count] = input.nextLine(); 
           count++; 
        }
      input.close(); 
      
      for (int i=0; i<lines; i++){
            String idNumber = String.format("%03d", i);
            studentID[i] = "WH" + idNumber; 
            //System.out.println("Student ID: "+studentID[i]);
            File oFile = new File(studentID[i]+".txt");
            createAnswerSheet(oFile, names[i], studentID[i]); 
        }
      // end of generation of random virtual answer sheets
      
      
      // print class score report
      printHeader();   // print class score report
      for (int i=0; i<lines; i++){          // In each iteration, print one student's report card
           // new
           resetAnswerSheet(answerSheet);   // reset the answer sheet to get ready to read in a student's answers
           ifile = new File(studentID[i]+".txt");
           input = new Scanner(ifile); 
           names[i]     = input.next(); studentID[i] = input.next();  // dummy reading of names and ID
           for (int j=0; j<MATH_QUESTION_NUM; j++){                   // read in one student's math answer row
               answerSheet[0][j] = input.next().charAt(0); 
            }
            
           for(int j=0; j<ENG_QUESTION_NUM; j++){                    // read in one student's english answer row
               answerSheet[1][j] = input.next().charAt(0); 
            }

           mathScore[i] = checkAnswer(mathKey, answerSheet[0]);  // use the answer row to determine a student's math score
           engScore[i]  = checkAnswer(engKey,  answerSheet[1]);  // use eng answer row to determine a student's english score
           // end new
           
           mathGrade[i] = getGrade(mathScore[i]);    // get math letter grade for the student
           engGrade[i]  = getGrade(engScore[i]);     // get math letter grade for the student
           
           // print out one record
           System.out.printf("ID: %-7s  ", studentID[i]); 
           System.out.printf("Name: %-12s   ", names[i]);
           System.out.printf("Math Score: %3d  ", mathScore[i]); 
           System.out.printf("Math Grade: %2c  ", mathGrade[i]); 
           System.out.printf("English Score: %3d  ", engScore[i]); 
           System.out.printf("English Grade: %2c  %n", engGrade[i]); 
           input.close(); 
       }    
 
      // same as StudentScore.java: print class grade distribution information.   
      String grades = "ABCDF"; 
      int[] gcountMath  = new int[5];
      int[] gcountEng   = new int[5];
      
      System.out.println(); 
      System.out.printf("%-30s", "Grade Distribution: ");
      System.out.printf("%20s", "Math Grade");
      System.out.printf("%20s %n", "English Grade"); 
      for (int i = 0; i<grades.length(); i++){
           gcountMath[i] = 0;
           gcountEng[i]  = 0; 
           for (int j = 0; j<lines; j++){
               if (grades.charAt(i) == mathGrade[j]) gcountMath[i]++; 
               if (grades.charAt(i) == engGrade[j])  gcountEng[i]++; 
           }
           
           System.out.printf("%-30s", "Grade "+grades.charAt(i)+": "); 
           System.out.printf("%15d     ", gcountMath[i]);
           System.out.printf("%15d     %n", gcountEng[i]);
        }
        
      input.close(); 
    }
}
