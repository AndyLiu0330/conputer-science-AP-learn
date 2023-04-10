import java.util.Scanner;

public class FahrenheitToCalsius {
   public void FtoC() {

      Scanner input = new Scanner(System.in);

      System.out.print("Enter a degree in Fahrenheit:");
      double Fahrenheit = input.nextDouble();

      double calsius = (5.0 / 9) * (Fahrenheit - 32);
      System.out.println("Fahrenheit" + Fahrenheit + " is " + calsius + "in calsius");
      input.close();

   }
}
