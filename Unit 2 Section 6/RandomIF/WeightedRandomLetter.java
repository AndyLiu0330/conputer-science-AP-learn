
/**
 * Write a description of class WeightedRandomLetter here.
 * 
 * @author (Eric Y. Chou) 
 * @version (V1, 11/14/2015)
 */
public class WeightedRandomLetter
{
     public static void main(String[] args){
      int region = (int) (Math.random()* 3);  
      char dLetter = (char) (Math.random()*10); 
      char aLetter = (char) (Math.random()*26); 
      if (region == 0) aLetter = (char) (dLetter + '0'); 
      else if (region == 1) aLetter += 'A';
      else aLetter += 'a'; 
      System.out.println(aLetter); 
    }  
}
