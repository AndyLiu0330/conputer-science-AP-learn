import java.util.Scanner; 
/**
 * Write a description of class SumAvgMaxMinAnswer here.
 * 
 * @author (Your name) 
 * @version (version, date)
 */
public class SumAvgMaxMin
{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in); 
       boolean done = false; 
       String token = ""; 
       int num; 
       int count = 0; 
       double sum = 0.0; 
       double average = 0.0; 
       int max = Integer.MIN_VALUE; 
       int min = Integer.MAX_VALUE; 
       
       System.out.println("Program to find sum, avarage, maximum, and minimum starts ..."); 
   
       while (!done){
           System.out.print("Enter an integer: ");
           token = input.nextLine(); 
           // accumulate sum
           num = Integer.parseInt(token);  
           sum += num; 
           // set new maximum 
           // put your code here
           
           // end of your code
           
           // set new mimimum
           // put your code here
           
           // end of your code
           
           count++; 
           System.out.print("Do you want to quit (Y/N)? ");    
           String answer = input.nextLine(); 
           if (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y'){
              done = true;
            }
        }
        
        // calculate average
        // put you code here
        
        // end of your code
       
        // print out part
        System.out.println("Results for while loop ..."); 
        // print out sum: 
        System.out.printf("Sum:     %15.3f %n", sum);
        // print out average: 
        System.out.printf("Avarage: %15.3f%n", average); 
        // print out maximum
        System.out.printf("Maximum: %15d%n", max);
        // print out minimum
        System.out.printf("Minimum: %15d%n", min); 
       
       // reset data for do-while-loop
       done = false; 
       token = ""; 
       num = 0; 
       count = 0; 
       sum = 0.0; 
       average = 0.0; 
       max = Integer.MIN_VALUE; 
       min = Integer.MAX_VALUE; 
       
       System.out.println("\n\n\n");
       System.out.println("do while loop starts here ..."); 
       // your do-while-loop part
       // put your own code here
       
while (!done); 
        
        // calculate average and print out like while-loop
        // put you code here
 
        
        
        
        
        
        
        
        
        
        
        // end of your code
       // program ends
    }
}

