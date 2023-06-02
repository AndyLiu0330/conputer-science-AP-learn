package student;

import java.util.ArrayList; 
/**
 * Write a description of class Subject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Subject
{
    final static char A = 'A'; 
    final static char B = 'B';
    final static char C = 'C'; 
    final static char D = 'D';
    final static char E = 'E'; 
    final static char F = 'F'; 
    final static char N = 'N'; 
    final static char S = ' ';
    
    private String course="Course Name";
    private int score  = 0;
    private char grade = N; 
    private boolean ready= false; 
    
    private ArrayList<ScoreSheet>    exams = new ArrayList<ScoreSheet>();  
    private ArrayList<String>    examNames = new ArrayList<String>(); 
    private ArrayList<Integer>   examScore = new ArrayList<Integer>(); 
    private ArrayList<Character> examGrade = new ArrayList<Character>(); 
    private ArrayList<Double>    examWeight= new ArrayList<Double>(); 
    
    final static char[] midMathKey = {A, B, A, C, D, E, E, A, B, C,   // mid-term key for Math subject
                                     C, C, E, B, D, D, D, C, A, C, 
                                     B, D, E, A, C, C, C, A, B, E}; 
                                     
    final static char[] midEngKey = {D, E, C, B, D, A, C, E, E, E,    // mid-term key for English subject
                                    A, B, E, C, D, B, D, A, A, D, 
                                    B, E, A, C, D};   
                                    
    final static char[] finalMathKey = {B, C, A, E, C, D, B, A, C, D,   // final key for Math subject
                                       A, A, E, E, C, C, B, B, D, A, 
                                       E, A, E, A, B, B, B, D, D, C, 
                                       A, E, C, C, D, A, B, B, A, D}; 
                                       
    final static char[] finalEngKey = {C, E, A, A, B, C, D, A, A, B,    // final key for English subject
                                      C, C, B, A, D, D, D, D, B, A, 
                                      C, C, B, B, A, D, D, A, E, C};   
    
    public Subject(String course){
     this.course = course; 
    }
    
    public void addExam(String examName, ScoreSheet ss, int score, char grade, double weight){
        exams.add(ss); 
        examNames.add(examName); 
        examScore.add(score);
        examGrade.add(grade); 
        examWeight.add(weight); 
    }
    
    public void updateScoreSheet(String examName, ScoreSheet ss){
      boolean found = false; 
      for (int i=0; i<examNames.size() && !found; i++){
          if (examNames.get(i).equals(examName)){
              exams.set(i, ss); 
              found = true; 
            }
        }
      
      if(!found){
           System.out.println("Wrong exam name..."); 
        }
    }
    
    public void updateExamScore(String examName){
          boolean found = false; 
      for (int i=0; i<examNames.size() && !found; i++){
          if (examNames.get(i).equals(examName)){
              if (exams.get(i).isReady()) { 
                    examScore.set(i, exams.get(i).checkAnswer());
                    //int a =  exams.get(i).checkAnswer();    // for debugging
                    //System.out.println(i+" "+a);            // for debugging
                }    
              else System.out.println("Score Sheet is not ready for exam: "+examNames.get(i)); 
              found = true; 
            }
        }
      
      if(!found){
           System.out.println("Wrong exam name..."); 
        }    
    }
    
    public void updateScore(){
      double score1 = 0; 
      boolean ready=true; 
      for (int i=0; i< exams.size(); i++){
            if (!exams.get(i).isReady()){
              ready = false; 
            return; 
            }
        }
      //System.out.println("I am here. "); 
      if (ready) { 
          for (int i=0; i< exams.size(); i++)
               score1 += examWeight.get(i) * exams.get(i).getScore(); 
               //System.out.println(score1); 
               score1 = (score1<= 100.0) ? score1 : 100.0; 
               score1 = (score>= 0.0)    ? score1 : 0.0; 
               //System.out.println(score1); 
          this.setScore((int) Math.round(score1));   
          //System.out.println(this.score); 
          this.grade = updateGrade(this.score);   
          //System.out.println(this.grade); 
        }
    }
    
    public void setScore(int score){
         this.score = score; 
    }
    
    public void setGrade(char grade){
         this.grade = grade; 
    }
    
    public int getScore(){
      return score; 
    }
    
    public char getGrade(){
      return grade; 
    }
    
    public String getCourse(){
       return course; 
    }
    public char updateGrade(int score){
      char grade = ' '; 
        if (score>=90 && score<=100){grade = 'A';}
        else if (score>=80 && score<=100)  {grade = 'B';}
        else if (score>=70 && score<=100)  {grade = 'C';}
        else if (score>=60 && score<=100)  {grade = 'D';}
        else if (score<60 && score>= 0){grade = 'F';}
        else { grade = 'N';}
      return grade; 
    } 
    
    public void updateSubjectSemester1(ScoreSheet mid, ScoreSheet fin){ // semester exam format 1
        addExam("midTerm", mid,  0, N, 0.4);  
        addExam("final",   fin,  0, N, 0.6); 
        updateExamScore("midTerm");
        updateExamScore("final");
        updateScore(); 
    }
}
