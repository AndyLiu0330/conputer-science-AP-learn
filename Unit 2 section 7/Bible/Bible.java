import java.io.*; 
import java.util.Scanner; 
public class Bible
{
     public static void main(String[] args) throws Exception {
      File bible = new File("Bible\\b.txt");
      Scanner input = new Scanner(bible);
      int wc = 0; 
      
      while (input.hasNext()){
          for (int i=1; i<=9; i++) if (wc == 86000*i) System.out.println((i*10)+"% done !");  
          String aa=input.next(); 
          wc++; 
        }
        
      System.out.println("Bible has "+wc+" words."); 
      input.close(); 
    }
    
}
