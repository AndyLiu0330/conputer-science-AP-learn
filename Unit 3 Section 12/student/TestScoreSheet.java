package student;

import java.io.IOException; 
import java.util.Arrays; 
/**
 * Write a description of class TestScoreSheet here.
 * 
 * @author (Eric Y. Chou) 
 * @version (12/23/2015)
 */
public class TestScoreSheet
{
    static ScoreSheet[] s = new ScoreSheet[12]; 
    
    public static void log(int i){
       System.out.println("Sheet "+i+" created. "); 
    }
    
    public static void main(String[] args){
      System.out.println("\f"); 
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
        s[0].loadAnswer("student\\Washington\\WH001\\math\\midTerm\\"+"MIDMA101"+"WH001"+".txt");
             System.out.println("Test1 Score: "+s[0].checkAnswer());
             System.out.println("Test1 Grade: "+s[0].getGrade()); 
             System.out.println("Test1 Score:>"+ScoreSheet.checkAnswer(s[0].getKey(), s[0].getAnswer()));
             System.out.println("Test1 Grade:>"+ScoreSheet.getGrade(s[0].getScore())); 
             System.out.println(); 
        s[1]  = new ScoreSheet(school+id[1]+mid1+mamid+id[1]+txt, Subject.midMathKey);
             System.out.println("Test1 Score: "+s[1].checkAnswer());

        s[2]  = new ScoreSheet(school+id[0]+mid1+mamid+id[0]+txt, Subject.midMathKey);
             System.out.println("Test1 Score: "+s[2].checkAnswer());
        s[3]  = new ScoreSheet(school+id[0]+fin1+mafin+id[0]+txt, Subject.finalMathKey);
             System.out.println("Test1 Score: "+s[3].checkAnswer());
        s[4]  = new ScoreSheet(school+id[1]+fin1+mafin+id[1]+txt, Subject.finalMathKey);
             System.out.println("Test1 Score: "+s[4].checkAnswer());
        s[5]  = new ScoreSheet(school+id[2]+fin1+mafin+id[2]+txt, Subject.finalMathKey);
             System.out.println("Test1 Score: "+s[5].checkAnswer());
        s[6]  = new ScoreSheet(school+id[0]+mid2+enmid+id[0]+txt, Subject.midEngKey);
             System.out.println("Test1 Score: "+s[6].checkAnswer());
        s[7]  = new ScoreSheet(school+id[1]+mid2+enmid+id[1]+txt, Subject.midEngKey);
             System.out.println("Test1 Score: "+s[7].checkAnswer());
        s[8]  = new ScoreSheet(school+id[2]+mid2+enmid+id[2]+txt, Subject.midEngKey);
             System.out.println("Test1 Score: "+s[8].checkAnswer());
        s[9]  = new ScoreSheet(school+id[0]+fin2+enfin+id[0]+txt, Subject.finalEngKey);
             System.out.println("Test1 Score: "+s[9].checkAnswer());
        s[10] = new ScoreSheet(school+id[1]+fin2+enfin+id[1]+txt, Subject.finalEngKey);
             System.out.println("Test1 Score: "+s[10].checkAnswer());
        s[11] = new ScoreSheet(school+id[2]+fin2+enfin+id[2]+txt, Subject.finalEngKey);
             System.out.println("Test1 Score: "+s[11].checkAnswer());
      }
      catch(IOException e){System.out.println("I/O Error !!!");}
    }
}
