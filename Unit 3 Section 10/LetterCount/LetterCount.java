import java.io.File; 
import java.io.IOException; 
import java.util.Scanner; 
/**
 * Write a description of class LetterCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LetterCount
{
    public static void main(String[] args) throws IOException{
        
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  
        final String filename = "usdeclaration.txt"; 
        File iFile = new File(filename);
        Scanner input = new Scanner(iFile);
        String text = ""; 
        
        int[] letterCount = new int[alphabet.length()];
        
        while (input.hasNext()){
           text += input.nextLine(); 
        }
        
        text = text.toUpperCase(); 
        
        for (int i=0; i<text.length(); i++){
           char ch = text.charAt(i); 
           
           if (  !((ch >= 'A' && ch <= 'Z') || ch == ' ') )
           text = text.replace("" + ch, ""); 
        }
        //System.out.println(text); 
        
        for (int i=0; i<text.length(); i++){
             for (int j=0; j<alphabet.length(); j++) if (text.charAt(i) == alphabet.charAt(j)) letterCount[j]++; 
        }
        
        System.out.println("Letter Counts in file "+filename+" is: ");
        for (int i=0; i<alphabet.length(); i++){
           System.out.println("Letter "+alphabet.charAt(i)+" has occurred "+letterCount[i]+" times. ");
        }
        
        input.close(); 
    }
}
