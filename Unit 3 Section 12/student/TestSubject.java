package student;

import java.io.IOException; 

/**
 * Write a description of class TestSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestSubject
{
   final static char A = 'A'; 
   final static char B = 'B';
   final static char C = 'C'; 
   final static char D = 'D';
   final static char E = 'E'; 
   final static char F = 'F'; 
   final static char N = 'N'; 
   final static char S = ' ';
   
   static Subject mathWH000 = new Subject("Math");
   static Subject mathWH001 = new Subject("Math");
   static Subject mathWH002 = new Subject("Math");
   
   static ScoreSheet[] s = new ScoreSheet[6]; 
   
   public static void loadSheets(){
       String school = "student\\Washington\\"; 
       String mid1 = "\\math\\midTerm\\"; 
       String mid2 = "\\english\\midTerm\\";
       //String fin0 = "student\\Washington\\";
       String fin1 = "\\math\\final\\";
       String fin2 = "\\english\\final\\";
       String txt  = ".txt"; 
       
       String mamid  = "MIDMA101";  // math midterm
       String mafin  = "FINMA101";  // math final 
       String enmid  = "MIDEN502";  // eng midterm
       String enfin  = "FINEN502";  // eng final   
       String[] id   = new String[26]; // for testing purpose;
       for (int i=0; i<26; i++) {id[i] = "WH"+String.format("%03d", i);  }
       
      try {
        s[0]  = new ScoreSheet(school+id[0]+mid1+mamid+id[0]+txt, Subject.midMathKey);       
              //System.out.println("Test1 Score: "+s[0].checkAnswer());
        s[1]  = new ScoreSheet(school+id[1]+mid1+mamid+id[1]+txt, Subject.midMathKey);
             //System.out.println("Test1 Score: "+s[1].checkAnswer()); 
        s[2]  = new ScoreSheet(school+id[2]+mid1+mamid+id[2]+txt, Subject.midMathKey);
             //System.out.println("Test1 Score: "+s[2].checkAnswer());
        s[3]  = new ScoreSheet(school+id[0]+fin1+mafin+id[0]+txt, Subject.finalMathKey);
             //System.out.println("Test1 Score: "+s[3].checkAnswer());
        s[4]  = new ScoreSheet(school+id[1]+fin1+mafin+id[1]+txt, Subject.finalMathKey);
             //System.out.println("Test1 Score: "+s[4].checkAnswer());
        s[5]  = new ScoreSheet(school+id[2]+fin1+mafin+id[2]+txt, Subject.finalMathKey);
             //System.out.println("Test1 Score: "+s[5].checkAnswer());
      }
      catch(IOException e){System.out.println("I/O Error !!!");}        
    }
    
   public static void linkSheets(){
      mathWH000. updateSubjectSemester1(s[0], s[3]);
      //mathWH000.addExam("midTerm", s[0],  0, N, 0.4);  
      //mathWH000.addExam("final",   s[3],  0, N, 0.6); 
      //mathWH000.updateExamScore("midTerm");
      //mathWH000.updateExamScore("final");
      //mathWH000.updateScore(); 
      System.out.println("WH000 math score: "+mathWH000.getScore()+" grade: "+ mathWH000.getGrade()); 
      
      mathWH001.addExam("midTerm", s[1],  0, N, 0.4);  
      mathWH001.addExam("final",   s[4],  0, N, 0.6);  
      mathWH001.updateExamScore("midTerm");
      mathWH001.updateExamScore("final");
      mathWH001.updateScore();       
      System.out.println("WH001 score: "+mathWH001.getScore()+" grade: "+ mathWH001.getGrade()); 
            
      mathWH002.addExam("midTerm", s[2],  0, N, 0.4);  
      mathWH002.addExam("final",   s[5],  0, N, 0.6);  
      mathWH002.updateExamScore("midTerm");
      mathWH002.updateExamScore("final");
      mathWH002.updateScore();       
      System.out.println("WH002 score: "+mathWH002.getScore()+" grade: "+ mathWH002.getGrade());       
    }

   public static void main(String[] args){
      System.out.println("\f"); 
      loadSheets();    
      linkSheets(); 
    }
}
