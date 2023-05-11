
/**
 * Write a description of class UnweightedRandomLetter here.
 * 
 * @author (Eric Y. Chou) 
 * @version (V1, 11/14/2015)
 */
public class UnweightedRandomLetter
{
    public static void main(String[] args){
      char aLetter = (char) (Math.random()* 62);  
      if (aLetter <= 9) aLetter += '0';                                    // 0 to 9
      else if (aLetter <= 35) aLetter = (char)(aLetter - (char) 10 + 'A'); // 10 - 35
      else aLetter = (char) (aLetter - (char) 36 + 'a');                   // 36 - 61

      System.out.println(aLetter); 
    }
}
