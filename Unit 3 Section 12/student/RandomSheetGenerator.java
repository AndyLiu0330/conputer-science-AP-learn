package student;

import java.util.Scanner; 
import java.io.File; 
import java.io.PrintWriter; 
import java.io.IOException; 
/**
 * Write a description of class RandomSheetGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomSheetGenerator
{   
   final static char A = 'A'; 
   final static char B = 'B';
   final static char C = 'C'; 
   final static char D = 'D';
   final static char E = 'E'; 
   final static char F = 'F'; 
   final static char N = 'N'; 
   final static char S = ' ';
   
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
                                      
    public static char randomAnswer(){
         int i = (int) (Math.random()*5);
         if (i==0)      return A; 
         else if (i==1) return B; 
         else if (i==2) return C; 
         else if (i==3) return D; 
         else           return E; 
    }
    
    public static void createAnswerSheet(File oFile, String names, String studentID, String testCode, char[] key, double base, double range) throws IOException {
         PrintWriter out = new PrintWriter(oFile); 
         out.println(names+" "+studentID+" "+testCode);
         double bias = Math.random()*range + base; // random bias value ranging from 0.4 to 0.9 (with base=0.4, range=0.5 
         for (int i=0; i<key.length; i++){
             if (Math.random()<bias) out.print(key[i]+" ");  else out.print(randomAnswer()+" ");
            }
         out.println();
         out.close(); 
         //System.out.println("I am here 2 !!!"); 
    }
                                              
   public static void main(String[] args)throws IOException {
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
       //System.out.println(lines); 
       // declaration of the data structures for the class
       String[] names   = new String[lines];
       String[] studentID = new String[lines];  
       
       input = new Scanner(new File("names.txt")); 
       int count = 0; 
       while (input.hasNext()){
           names[count] = input.nextLine(); 
           count++; 
        }
       input.close(); 
       try{
          for (int i=0; i<lines; i++){
              String idNumber = String.format("%03d", i);
              studentID[i] = "WH" + idNumber; 

              createAnswerSheet(new File(school+studentID[i]+mid1+mamid+studentID[i]+txt),    names[i], studentID[i], mamid, Subject.midMathKey,   0.4, 0.5); 
              createAnswerSheet(new File(school+studentID[i]+fin1+mafin+studentID[i]+txt),    names[i], studentID[i], mafin, Subject.finalMathKey, 0.4, 0.5); 
              createAnswerSheet(new File(school+studentID[i]+mid2+enmid+studentID[i]+txt),    names[i], studentID[i], enmid, Subject.midEngKey,    0.4, 0.5); 
              createAnswerSheet(new File(school+studentID[i]+fin2+enfin+studentID[i]+txt),    names[i], studentID[i], enfin, Subject.finalEngKey,  0.4, 0.5);         
          }
       }
       catch(IOException e){System.out.println("I/O Error !!!"); }
    }
}
