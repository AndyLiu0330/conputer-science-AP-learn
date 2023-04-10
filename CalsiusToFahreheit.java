import java.util.Scanner;  



public class CalsiusToFahreheit {




   public static void main(String[] args){
    Scanner input = new Scanner(System.in);


    System.out.print("Enter a degree in Calcus:");
    double  calsius = input.nextDouble();

    double fahrenheit = calsius * 9.0 / 5.0 + 32.0;
    System.out.println("Calsius " + calsius + " is " + fahrenheit + " in fahrenhit");
    input.close();  
   } 
   public void CtoF(){

    Scanner input = new Scanner(System.in);


    System.out.print("Enter a degree in Calcus:");
    double  calsius = input.nextDouble();

    double fahrenheit = calsius * 9.0 / 5.0 + 32.0;
    System.out.println("Calsius " + calsius + " is " + fahrenheit + " in fahrenhit");
    input.close();  
   }
}

