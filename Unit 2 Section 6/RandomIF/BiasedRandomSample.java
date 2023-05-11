
/**
 * Write a description of class BiasedRandomSample here.
 * 
 * @author (Eric Y. Chou) 
 * @version (V1, 11/14/2015)
 */
public class BiasedRandomSample
{
  public static void main(String[] args){
    // If you use a SPAN 2.0, BASELINE value of 3.0, the value 
    // should be between 3.0 <= z < 5.0 and 4.0 has the highest probability. 
    
    final double SPAN = 2.0; 
    final double BASELINE = 3.0; 
    // Projection from random number 
    // generator to CDF y = g(x),  y will have the 
    // probability distribution function of f(x) (PDF)

    double x = Math.random(); 
    double y = 0.0; 

    if ( x>= 0 && x < 0.5) y = Math.pow(x/2.0, 0.5);
    else y = 1.0-Math.pow((1-x)/2, 0.5); 
    
    double z = y * SPAN + BASELINE; 
    
    System.out.println("X: "+x); 
    System.out.println("Y: "+y); 
    System.out.println("A Random Value: "+z); 
    
    // Mean Value Test
    // Run more times will show the mean value is approaching BASELINE + SPAN/2
    int times = 10000; 
    double sum =0.0; 
    double mean = 0.0; 
    for (int i = 0; i<times; i++){
        x = Math.random(); 
        if ( x>= 0 && x < 0.5) y = Math.pow(x/2.0, 0.5);
        else y = 1.0-Math.pow((1-x)/2, 0.5); 
        z = y * SPAN + BASELINE; 
        sum += z; 
    }
    mean = sum/times; 
    System.out.println("Mean value after "+times+" simulations: "+ mean); 
  }
}
