import java.util.Scanner; 
/**
 * Write a description of class CoffeeShop here.
 * 
 * @author (Eric Y. Chou) 
 * @version (V1, 11/19/2015)
 */
public class CoffeeShop
{
  public static void main(String[] args){
       // flags
       boolean decided = false;   // flag whether the customer decided or not
       boolean ordered = false;   // flag whether the customer ordered or not
       boolean paid    = false;   // flag whether the customer paid or nog
       int choice = 0;            // choice of coffee
       double payment = 0.0;      // payment that the customer made
       double price = 0.0;        // price of the coffee
       String coffee = "";        // coffee's name
       String selection = "";     // decided input
       char sel = 'N'; 
       
       Scanner input = new Scanner(System.in); 
       System.out.println("Welcome to Virtual Coffee Shop ...\n"); 
       
       do {
           //reset flags, price and choice
           ordered = false; decided = false; price= 0.0; choice = 0;  coffee="";  
           
           // menu starts
           System.out.println("  CLASSIC FAVORITES         GRANDE");
           System.out.println("===================================");
           System.out.print("[1]  Caffe Latte               "); 
           System.out.printf("%4.2f%n", 3.75);
           System.out.print("[2]  Cappuccino                "); 
           System.out.printf("%4.2f%n", 3.65);
           System.out.print("[3]  Caramel Macchiato         "); 
           System.out.printf("%4.2f%n", 3.95);
           System.out.print("[4]  Caffe Macha               "); 
           System.out.printf("%4.2f%n", 3.95);
           System.out.print("[5]  Caffe Americano           ");            
           System.out.printf("%4.2f%n", 2.40);
           System.out.print("[6]  Cinnamon Dolce Latte      "); 
           System.out.printf("%4.2f%n", 4.75);
           System.out.print("[7]  Steamer                   "); 
           System.out.printf("%4.2f%n", 2.50);
           System.out.print("[8]  Drip Coffee               "); 
           System.out.printf("%4.2f%n", 1.95);       
           System.out.println("[0]  Need more time ...");
           
           // make selection for coffee
           System.out.print("Enter your choice: ");
           choice = Integer.parseInt(input.nextLine());
           
           switch (choice){
             case 1:  price = 3.75; ordered = true; coffee = "Caffe Latte"; break; 
             case 2:  price = 3.65; ordered = true; coffee = "Cappuccino"; break; 
             case 3:  price = 3.95; ordered = true; coffee = "Caramel Macchiato"; break; 
             case 4:  price = 3.95; ordered = true; coffee = "Caffe Macha"; break; 
             case 5:  price = 2.40; ordered = true; coffee = "Caffe Americano"; break; 
             case 6:  price = 4.75; ordered = true; coffee = "Cinnamon Docke Latte"; break; 
             case 7:  price = 2.50; ordered = true; coffee = "Steamer"; break; 
             case 8:  price = 1.95; ordered = true; coffee = "Drip Coffee"; break;  
             default: ordered = false; 
            }
           
            // Is customer firm about his choice? 
            System.out.print("Have you decided? "); 
            selection = input.nextLine(); 
            sel = selection.charAt(0); 
            if (sel == 'Y' || sel == 'y') decided = true; 
       } while( !decided); 
       
       if (ordered) {
              System.out.print("Your Choice: "+coffee);
              System.out.printf("  Price: %4.2f%n",price); 
              
              // check payment
              do {
                System.out.print("Enter your payment: ");
                payment = Double.parseDouble(input.nextLine()); 
                
                if (payment >= price) paid = true; else System.out.println("Your payment is not enough. Try again."); 
              } while (!paid);
              
              // enough payment, calculate change, all from Chapter 2
              // Calculate the amount of change that the customer should receive; 
                  double change = payment - price;
                  
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
		          System.out.println("Your change amount " + change+ " consists of"); // modified
		          System.out.println("    " + numberOfOneDollars + " dollars");
		          System.out.println("    " + numberOfQuarters + " quarters ");
		          System.out.println("    " + numberOfDimes + " dimes"); 
		          System.out.println("    " + numberOfNickels + " nickels");
		          System.out.println("    " + numberOfPennies + " pennies");
		      // Chapter 2: GetChange.java ends ...
		      System.out.println(); 
        }
        
     System.out.println("Thank you for your business.  Please come back soon."); 
     input.close();
    }
}
