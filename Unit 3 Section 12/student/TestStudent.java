package student;

import java.io.File; 
import java.io.PrintWriter; 
import java.io.IOException; 
import java.util.Scanner; 
import java.util.Arrays; 
/**
 * Write a description of class TestStudent here.
 * 
 * @author (Eric Y. Chou) 
 * @version (12/24/2015)
 */
public class TestStudent
{
   static String[] name; 
   static String[] id;
   static String[] address; 
   static String[] birthday; 
   
   static Student[] s; 
   static int classSize = 0; 
   static String[] courses = {"Math", "English"};  // can be changed if properly handled
   
   // =======================================================================================================
   static Subject[] ma; 
   static Subject[] en; 
   static ScoreSheet[] mms; 
   static ScoreSheet[] mfs; 
   static ScoreSheet[] ems; 
   static ScoreSheet[] efs; 
   
   public static void printHeader(){
        System.out.println("                        Washington High School        "); 
        System.out.println("                   Semester Class Score Report Card "); 
        System.out.println("============================================================================="); 
   }
   
   public static void loadSheets(int len){
       String school = "student\\Washington\\"; 
       String mid1 = "\\math\\midTerm\\"; 
       String mid2 = "\\english\\midTerm\\";
       String fin1 = "\\math\\final\\";
       String fin2 = "\\english\\final\\";
       String txt  = ".txt"; 
       
       String mamid  = "MIDMA101";  // math midterm
       String mafin  = "FINMA101";  // math final 
       String enmid  = "MIDEN502";  // eng midterm
       String enfin  = "FINEN502";  // eng final   
       id   = new String[len]; // for testing purpose;
       for (int i=0; i<len; i++) {id[i] = "WH"+String.format("%03d", i);  }
       mms = new ScoreSheet[len]; 
       mfs = new ScoreSheet[len];
       ems = new ScoreSheet[len];
       efs = new ScoreSheet[len];
       
      try {
          for (int i=0; i<len; i++) {
                mms[i] = new ScoreSheet(school+id[i]+mid1+mamid+id[i]+txt, Subject.midMathKey);   
                mfs[i] = new ScoreSheet(school+id[i]+fin1+mafin+id[i]+txt, Subject.finalMathKey);
                ems[i] = new ScoreSheet(school+id[i]+mid2+enmid+id[i]+txt, Subject.midEngKey);
                efs[i] = new ScoreSheet(school+id[i]+fin2+enfin+id[i]+txt, Subject.finalEngKey);
            }
      }
      catch(IOException e){System.out.println("I/O Error !!!");}        
    }
    
   public static void linkSheets(int len){
      ma = new Subject[len];
      en = new Subject[len]; 
      for (int i=0; i<len; i++){ 
          ma[i] = new Subject("Math"); 
          en[i] = new Subject("English"); 
          ma[i].updateSubjectSemester1(mms[i], mfs[i]);
          en[i].updateSubjectSemester1(ems[i], efs[i]); 
          System.out.println("  Math: "+ma[i].getScore()+" grade: "+ ma[i].getGrade()); 
          System.out.println("  Eng : "+en[i].getScore()+" grade: "+ en[i].getGrade()); 
        }   
    }
   // =======================================================================================================
   
   public static void main(String[] args) throws IOException {
        File ifile = new File("student\\nameslong.txt");
        Scanner input = new Scanner(ifile); 
        
        classSize = 0; 
        String[] t = new String[4];
        
        while (input.hasNext()){
            t[0] = input.nextLine(); 
            t[1] = input.nextLine();
            t[2] = input.nextLine(); 
            classSize++;
        }
        
        input.close(); 
        
        name     = new String[classSize];
        id       = new String[classSize];
        address  = new String[classSize];
        birthday = new String[classSize]; 
        s        = new Student[classSize]; 
        
        input = new Scanner(ifile); 
        int x=0;         
        while (input.hasNext()){
            t[0] = input.nextLine(); 
            t[1] = input.nextLine(); 
            t[2] = input.nextLine(); 
            name[x]     = t[0];
            address[x]  = t[1];
            birthday[x] = t[2]; 
            id[x]      = "WH" + String.format("%03d", x);
            s[x] = new Student(name[x], id[x], address[x], birthday[x], courses);
            x++;
        }
        
        input.close(); 
        
        loadSheets(classSize);
        linkSheets(classSize); 
        
        System.out.println("\f"); 
        //System.out.println(s[i]); 
        printHeader(); 
        for (int i=0; i<classSize; i++) {
            s[i].getSubjectList().set(0, ma[i]); //.set(0, ma[i]);
            s[i].getSubjectList().set(1, en[i]); 
            System.out.println(s[i].toString());
            //s[i].toScreen(); 
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
            for (int j = 0; j<classSize; j++){
                if (grades.charAt(i) == s[j].getSubjectList().get(0).getGrade()) gcountMath[i]++; 
                if (grades.charAt(i) == s[j].getSubjectList().get(1).getGrade())  gcountEng[i]++; 
            }
           
            System.out.printf("%-30s", "Grade "+grades.charAt(i)+": "); 
            System.out.printf("%15d     ", gcountMath[i]);
            System.out.printf("%15d     %n", gcountEng[i]);
          }
        
    }
}
