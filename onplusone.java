
import java.util.Scanner; 
/**
 * Write a description of class OnePlusOne here.
 * 
 * @author (Eric Y. Chou) 
 * @version (V1.0 10/30/2015)
 */
public class onplusone 
{
    public static void main(String[] args)
        {
        Scanner input = new Scanner(System.in); 
        // Input ----------------------------------------------
        int a = 3;   // data from program itself
        int b = 5; 
        int c = Integer.parseInt(args[0]);  // data from command line
        int d = Integer.parseInt(args[1]);
        System.out.print("Enter an integer: "); // data fom console
        int e = input.nextInt(); 
        System.out.print("Enter an integer: "); 
        int f = input.nextInt(); 
        
        // Processing -----------------------------------------
        int sumA = a+b; 
        int sumB = c+d;
        int sumC = e+f; 
        
        // Output ---------------------------------------------
        System.out.println("From Program: " + a + " plus " + b + " is " + sumA); 
        System.out.println("From Command Line: " + c + " plus " + d + " is " + sumB); 
        System.out.println("From Console: " + e + " plus " + f + " is " + sumC);        
        input.close();
        }
}