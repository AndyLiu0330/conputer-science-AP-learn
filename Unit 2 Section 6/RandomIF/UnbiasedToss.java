
/**
 * Write a description of class UnbiasedToss here.
 * 
 * @author (Eric Y. Chou) 
 * @version (V1, 11/14/2015)
 */
public class UnbiasedToss
{
    public static void main(String[] args){
      double randToss = Math.random(); 
      int die = 1; 
      if (randToss<=0.5) die=0; 
      System.out.println("Preset-else: "+die);
      
      int ide = (randToss<=0.5) ? 0: 1; 
      System.out.println("Conditional Expression: "+ ide); 
     
    }
}
