import java.util.Scanner; 
/**
 * Write a description of class LotteryAnswer here.
 * 
 * @author (Eric Y. Chou) 
 * @version (V1, 11/19/2015)
 */
public class LotteryAnswer
{
   public static void main(String[] args){
      final boolean DEBUG_MODE = true; // turn on the debug mode to show lottery number
      boolean done = false;            // done flag: no more play
      char ch = 'N';                   // player's decision to continue to play or not
      boolean play = false;            // continue to play flag
      int sum  = 0; 
      int game = 0; 
      String lottery = "";             // lottery number in a string. 
      String guess = ""; 
      Scanner input = new Scanner(System.in); 
 
      do{
          // create a lottery code of 4 numbers from 0 to 9 for each digit. 
          lottery = "";  sum = 0; 
          lottery += (char) ((Math.random()*10)+'0');
          lottery += (char) ((Math.random()*10)+'0');
          lottery += (char) ((Math.random()*10)+'0');
          lottery += (char) ((Math.random()*10)+'0');
         
          if (DEBUG_MODE) System.out.println("Lottery: " + lottery);
          
          // Lottery Game Starts ...
          System.out.println("Welcome to Virtual Casino...");        
          
          // Display play Menu here
          System.out.println("What type of game you want to play ($1/play)? ");
          System.out.println("[1] All matched (All four numbers must match to win. ($50 return)"); 
          System.out.println("[2] All matched pairs (front pair MMXX, middle pair XMMX, and end pair XXMM, M: matched, X:missed) $5 return/pair"); 
          System.out.println("[3] All individual matched numbers $2/matched number");
          
          System.out.print("Enter the game you want to play: "); 
          game = Integer.parseInt(input.nextLine());
          System.out.print("\nEnter your lottery guess (4 digits 1234, leading 0s OK!): "); 
          guess = input.nextLine(); 
          if (game>3 || game<1 || guess.length()!=4) System.out.println("Your game code is worng,  or your lottery guess has wrong format."); 
          else{ 
                if (game==1){
                  if (guess.equals(lottery)) {sum += 50;  
                    System.out.println("You won the all matched Grand prize $50 !!!"); 
                  }
                }
                else if (game==2){
                  if (guess.substring(0,2).equals(lottery.substring(0,2))) {
                        sum +=5; 
                        System.out.println("You have front pair matched. Prize: $5."); 
                    }
                  if (guess.substring(1,3).equals(lottery.substring(1,3))) {
                      sum +=5;
                      System.out.println("You have middle pair matched. Prize: $5."); 
                    }
                  if (guess.substring(2,4).equals(lottery.substring(2,4))) {
                      sum += 5;
                      System.out.println("You have end pair matched. Prize: $5."); 
                    }
                }
                else if (game==3){
                  if (guess.charAt(0)== lottery.charAt(0)){sum+=2; System.out.println("You matched the first number. Prize $2."); }
                  if (guess.charAt(1)== lottery.charAt(1)){sum+=2; System.out.println("You matched the second number. Prize $2."); }
                  if (guess.charAt(2)== lottery.charAt(2)){sum+=2; System.out.println("You matched the third number. Prize $2."); }
                  if (guess.charAt(3)== lottery.charAt(3)){sum+=2; System.out.println("You matched the fourth number. Prize $2."); }
                }
                //else System.out.println("You enter a wrong game code !!!"); 
                
                System.out.println("Total prize you have earned: "+sum+"\n\n"); 
          }
          // Ask to continue or not ...
          System.out.print("Do you still want to play(Y/N): ");
          ch = input.nextLine().charAt(0); 
          play = (ch == 'Y' || ch == 'y');
          if (!play) done = true; else {done=false; }
          play = false; 
      } while (!done); 
   input.close(); 
    }
}
