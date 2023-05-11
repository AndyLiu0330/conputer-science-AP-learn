
/**
 * Write a description of class RandomSamples here.
 * 
 * @author (Eric Y. Chou) 
 * @version (V1, 11/14/2015)
 */
public class RandomSamples
{
   public static void main(String[] args){
       final int COUNT = 10; 
       final int STEPS = 2; 
       final int BASELINE = 11; 
       int r = (int) (Math.random()*COUNT) * STEPS +BASELINE; 
       System.out.println("Random Sample: "+r); 
    }
}
