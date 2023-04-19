
import java.util.Scanner;
/**
 * This program is for you to try what you have learned from this chapter. 
 * 
 * @author (Eric Y. Chou)
 * @return (V1, 11/07/2015) 
 * 
 */
public class GetChangeAnswer {
	  public static void main(String[] args) {   
		    // Create a Scanner
		    Scanner input = new Scanner(System.in);

		    // Receive the amount 
		    System.out.print("Enter the cost the customer has to pay: ");
		    double cost = input.nextDouble();
            System.out.print("Enter the amount the customer pays: ");
            double amtPaid = input.nextDouble(); 
            
            // Calculate the amount of change that the customer should receive; 
            double change = amtPaid - cost;
            
            // Take two significant digits by shifting left 2 digits 
            // (preparing for rounding-off the change to the 100th digit.)
            // put the result to remainingAmount;  This one I give you.            
		    int remainingAmount = (int)(change * 100);

		    // Find the number of one dollars by shifting right two digits and take only whole number
		    int numberOfOneDollars = remainingAmount / 100;
		    // update the remainingAmount to total cents the customer should receive
		    remainingAmount %= 100 ;

		    // Find the number of quarters in the remaining amount
		    int numberOfQuarters = remainingAmount / 25  ;
		    // update the remainingAmount to the cents that have not received by the customer. 
		    remainingAmount %= 25  ;

		    // Find the number of dimes in the remaining amount
		    int numberOfDimes =  remainingAmount / 10;
		    // update the remainingAmount to the cents that have not received by the customer.
		    remainingAmount %= 10 ;

		    // Find the number of nickels in the remaining amount
		    int numberOfNickels = remainingAmount / 5  ;
		    // update the remainingAmount to the cents that should be the pennies that customer should receive.
		    remainingAmount %= 5 ;

		    // Find the number of pennies in the remaining amount.  This one I give you. 
		    int numberOfPennies = remainingAmount;

		    // Display results (Study this part by yourself)
		    System.out.println("Your amount " + change+ " consists of"); 
		    System.out.println("    " + numberOfOneDollars + " dollars");
		    System.out.println("    " + numberOfQuarters + " quarters ");
		    System.out.println("    " + numberOfDimes + " dimes"); 
		    System.out.println("    " + numberOfNickels + " nickels");
		    System.out.println("    " + numberOfPennies + " pennies");
			input.close();
		  }
		}
