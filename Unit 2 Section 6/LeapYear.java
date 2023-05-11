import java.util.Scanner; 
public class LeapYear
{
   public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a year: ");
        int year = input.nextInt(); 
        
        String leapMessage = ""; 
        String zodiac = ""; 
        
        boolean leap = (year % 400 == 0) || (year %4 == 0) && (year %100 != 0); 
        if (leap) leapMessage = "It is a leap year !"; 
        else      leapMessage = "It is not a leap year."; 
        int zodiacYear = 0; 
        if (year -1948 >=0) zodiacYear = (year - 1948) % 12;
        else zodiacYear = (12-(1948-year)%12) % 12;  
        // This can also handle year before 1948.  Think about why? 
        
        if (zodiacYear == 0) zodiac = "Rat"; 
        if (zodiacYear == 1) zodiac = "Ox"; 
        if (zodiacYear == 2) zodiac = "Tiger"; 
        if (zodiacYear == 3) zodiac = "Rabbit"; 
        if (zodiacYear == 4) zodiac = "Dragon"; 
        if (zodiacYear == 5) zodiac = "Snake"; 
        if (zodiacYear == 6) zodiac = "Horse"; 
        if (zodiacYear == 7) zodiac = "Sheep"; 
        if (zodiacYear == 8) zodiac = "Monkey"; 
        if (zodiacYear == 9) zodiac = "Rooster"; 
        if (zodiacYear ==10) zodiac = "Dog"; 
        if (zodiacYear ==11) zodiac = "Pig";
        
        String zodiacMessage = "It is also a "+zodiac+" year !"; 
        
        System.out.println(leapMessage);
        System.out.println(zodiacMessage);
        input.close();
    }
}
