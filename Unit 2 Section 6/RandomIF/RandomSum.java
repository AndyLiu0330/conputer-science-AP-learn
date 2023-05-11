
/**
 * Write a description of class RandomSum here.
 * 
 * @author (Eric Y. Chou) 
 * @version (V1, 11/14/2015)
 */
public class RandomSum
{
  public static void main(String[] args){
      int die1 = (int) (Math.random()*6) + 1; 
      int die2 = (int) (Math.random()*6) + 1; 
      int sum = die1 + die2; 
      System.out.println("Die 1: "+die1+ " + Die2: "+ die2+ " = "+sum); 
 
    }
}
