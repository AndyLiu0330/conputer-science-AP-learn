
/**
 * Write a description of class BiasedToss here.
 * 
 * @author (Eric Y. Chou) 
 * @version (V1, 11/14/2015)
 */
public class BiasedToss
{
      public static void main(String[] args){
      double randToss = Math.random(); 
      int die = 1; 
      if (randToss<=0.6) die=0; 
      System.out.println("Preset-else: "+die);
      
      int ide = (randToss<=0.6) ? 0: 1; 
      System.out.println("Conditional Expression: "+ ide); 
     
    } 
}
