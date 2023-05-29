import java.util.Scanner; 
import java.util.Random; 
/**
 * Write a description of class StudentGPAMethod here.
 * 
 * @author (Eric Y. Chou) 
 * @version (V1, 11/16/2015)
 */
public class StudentGPAMethod
{
    public static int getScore(boolean mode, Scanner input, Random rinput){
      int score = 0; 
         if (mode)
             score = rinput.nextInt(101); 
         else {         
             System.out.print("Enter Math Score (0-99): ");
             score = input.nextInt(); 
         }
      return score; 
    }
    
    public static int getScale(int score){
      int scale = 0; 
        if (score>=90 && score<=100){scale=4;}
        else if (score>=80 && score<=100)  {scale=3;}
        else if (score>=70 && score<=100)  {scale=2;}
        else if (score>=60 && score<=100)  {scale=1;}
        else if (score<60 && score>= 0){scale=0;}
        else { scale=0;}    
      return scale; 
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
    
    public static void printScore(String subject, int score){
        System.out.printf("%-18s", subject+" Score: "); 
        System.out.printf("%-2d ", score); 
    }
    
    public static void printGrade(String subject, char grade){
        System.out.printf("%-18s", subject+" Grade: "); 
        System.out.printf("%-2c ", grade);     
    }
    
    public static void printHeader(String name, String ssn, String dob, String address){
        System.out.println("                     Washington High School        "); 
        System.out.println("                   Semester Score Report Card "); 

        System.out.printf("Name: %-30s ", name);
        System.out.printf("SSN: XXX-XX-%-4s  ", ssn.substring(7));
        System.out.printf("DOB: %-10s%n", dob); 
        System.out.printf("Address: %-80s%n", address);
        
        System.out.println("========================================================================"); 
    }
    
    public static void main(String[] args){
        final boolean SIMULATION_MODE = true; 
        // Define the Scanner input stream 
        Scanner input = new Scanner(System.in);
        long seed=System.currentTimeMillis();
        //long seed = 3; 
        Random  rinput = new Random(seed); 
          
        // Ask user to enter name, social security number (SSN), date of birth (DOB), 
        // address, 
        // math, eng, phy, chem, pe, ushistory score in number grade 0 to 5 in integer grade. 
        // Notice: make sure full name can be entered and there is no feed-through problem. 
        System.out.print("Enter Student's Name (First, Last): ");
        String name = input.nextLine(); 
        
        // Calculate the GPA for the student
        System.out.print("Enter Student's SSN (XXX-XX-XXXX): ");
        String ssn = input.nextLine(); 
        System.out.print("Enter Student's Date of Birth (MM/DD/YYYY): ");
        String dob = input.nextLine(); 
        System.out.print("Enter Student's Address: ");
        String address = input.nextLine();     

        int math    = getScore(SIMULATION_MODE, input, rinput); 
        int english = getScore(SIMULATION_MODE, input, rinput); 
        int physics = getScore(SIMULATION_MODE, input, rinput); 
        int chem    = getScore(SIMULATION_MODE, input, rinput); 
        int pe      = getScore(SIMULATION_MODE, input, rinput); 
        int us      = getScore(SIMULATION_MODE, input, rinput);         
           
        int mathScore = getScale(math); 
        int englishScore = getScale(english); 
        int physicsScore = getScale(physics); 
        int chemScore = getScale(chem); 
        int peScore = getScale(pe);
        int usScore = getScale(us);
        
        char mathGrade = getGrade(math); 
        char englishGrade = getGrade(english); 
        char physicsGrade = getGrade(physics); 
        char chemGrade = getGrade(chem); 
        char peGrade = getGrade(pe); 
        char usGrade = getGrade(us); 
                
        double gpa = (mathScore + englishScore + physicsScore + chemScore + peScore + usScore) /6.0; 
        
        // print out student semeter report
        printHeader(name, ssn, dob, address); 
        
        printScore("Math", math);
        printScore("English", english); 
        printScore("Physics", physics);
        System.out.println(); 
        
        printGrade("Math", mathGrade); 
        printGrade("English", englishGrade);
        printGrade("Physics", physicsGrade); 
        System.out.println(); 
        
        printScore("Chem.", chem); 
        printScore("P.E.", pe);
        printScore("U.S.Hist.", us); 
        System.out.println(); 
        
        printGrade("Chem.", chemGrade); 
        printGrade("P.E.", peGrade);
        printGrade("U.S.Hist.", usGrade); 
        System.out.println(); 
        
        // 4. print out the GPA 
        System.out.printf("Student's GPA: %-8.2f", gpa); 
    }
}
