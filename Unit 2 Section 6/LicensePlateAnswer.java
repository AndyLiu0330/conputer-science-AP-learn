
public class LicensePlateAnswer
{
  public static void main(String[] args){
   for (int i = 0; i<7; i++) {  // for twenty random plate generation
     String licensePlate = "7";
     
     char letter1 = (char)((int)(Math.random()*26)+'A');
     licensePlate += letter1; 
     char letter2 = (char)((int)(Math.random()*26)+'A');
     if (letter1 == letter2) letter2 = (char)((letter2-'A' + 1) % 26 + 'A'); 
     licensePlate += letter2; 
     char letter3 = (char)((int)(Math.random()*26)+'A');
     if (letter3 == letter1) letter3 = (char)((letter1-'A' + 1) % 26 + 'A');
     if (letter3 == letter2) letter3 = (char)((letter2-'A' + 1) % 26 + 'A');
     licensePlate += letter3; 
     //System.out.println(licensePlate); 
     
     char digit1 = (char)((int)(Math.random()*10)+'0');
     licensePlate += digit1; 
     char digit2 = (char)((int)(Math.random()*10)+'0');
     if (digit1 == digit2) digit2 = (char)((digit2-'0' + 1) % 10 + '0'); 
     licensePlate += digit2; 
     char digit3 = (char)((int)(Math.random()*10)+'0');
     if (digit3 == digit1) digit3 = (char)((digit1-'0' + 1) % 10 + '0');
     if (digit3 == digit2) digit3 = (char)((digit2-'0' + 1) % 10 + '0');
     licensePlate += digit3; 
     System.out.println(licensePlate); 
   }  //for twenty random plate generation
  }
  
}
