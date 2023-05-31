
/**
 * Write a description of class Craps here.
 *  Play 1 million games of craps and print probability of winning.
 *
 *  Craps simulation of "pass bet"           
 *  True odds of winning = 244/495 = 0.4929292929...
 * 
 *  % java Craps
 *  Winning percentage = 0.493396
 *
 *  % java Craps
 *  Winning percentage = 0.492537
 *
 *  % java Craps
 *  Winning percentage = 0.492998
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Craps {

    // uniform random integer in [0, N) 
    public static int dieRoll(int N) {
        return (int) (Math.random() * N)+1;
    } 

    // return sum of two dice
    public static int sumOfTwoDice() {
        int x = dieRoll(6);
        int y = dieRoll(6);
        return x + y;
    }


   /**
    * Pass bet:
    *
    * Player rolls two dice. Let x be sum.
    *   - if x is 7 or 11 instant win
    *   - if x is 2, 3, or 12 instant loss
    *   - otherwise player repeatedly rolls two dice until sum is x or 7
    *        if sum is x then win
    *        if sum is 7 then lose
    */
    public static boolean winsPassBet() {
        int x = sumOfTwoDice();
        if (x == 7 || x == 11)           return true;
        if (x == 2 || x == 3 || x == 12) return false;

        while (true) {
            int y = sumOfTwoDice();
            if (y == 7) return false;
            if (y == x) return true;
        } 
    }



   /**
    *  Run simulation of pass bet N times  
    *  Output winning percentage.          
    */
    public static void main(String[] args) { 
        int N = 1000000;       // number of pass bets to simulate
        int wins = 0;          // number of pass bets won

        for (int i = 0; i < N; i++)
            if (winsPassBet()) wins++;

        System.out.println("Winning percentage = " + 1.0 * wins / N);
    }

}
