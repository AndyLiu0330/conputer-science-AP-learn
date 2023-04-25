import java.util.Scanner;
public class SSN

{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in); 
       
       System.out.print("Enter Social Security Number (123-45-6789 format): "); 
       String ssn = input.nextLine(); 
       
       System.out.println("All social security numbers: "+ssn.substring(0,3)+ssn.substring(4,6)+ssn.substring(7, 11));
       System.out.println("Digit 0: "+ssn.charAt(0));
       System.out.println("Digit 1: "+ssn.charAt(1));
       System.out.println("Digit 2: "+ssn.charAt(2));
       System.out.println("Digit 3: "+ssn.charAt(4));
       System.out.println("Digit 4: "+ssn.charAt(5));
       System.out.println("Digit 5: "+ssn.charAt(7));
       System.out.println("Digit 6: "+ssn.charAt(8));
       System.out.println("Digit 7: "+ssn.charAt(9));
       System.out.println("Digit 8: "+ssn.charAt(10));
       input.close();
    } 
}
