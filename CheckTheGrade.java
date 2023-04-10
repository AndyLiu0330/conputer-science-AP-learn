import java.util.Scanner;

public class CheckTheGrade {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Enter the grades:");
      String grades = input.nextLine();

      Scanner nameScanner = new Scanner(System.in);
      System.out.println("Enter your name:");
      String name = nameScanner.nextLine();

      if (grades.equals("A")) {
         System.out.println("Hi " + name + " .  " + " your grade is " + "Excellent!");
      } else if (grades.equals("B")) {

         System.out.println("Hi " + name + " . " + " your grade is " + "Good");
      } else if (grades.equals("C")) {
         System.out.println("Hi " + name + " . " + " your grade is " + "Poor");
      }

      else if (grades.equals("F")) {
         System.out.println("Hi " + name + " . " + " your grade is " + "Eregious");
      } else {
         System.out.println("Invald grade");
      }

      input.close();
      nameScanner.close();

   }

}
