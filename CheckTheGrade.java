import java.util.Scanner;

public class CheckTheGrade {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the grades:");
      String grades = input.nextLine();
      if (grades.equals("A")){
      System.out.println("Excellent!");
      }
      else if (grades.equals("B")){
         System.out.println("Good");

      } else if (grades.equals("C")){
         System.out.println("Poor");
      }

       else if (grades.equals("F")){
         System.out.println("Eregious");
      }
      else {
         System.out.println("Invald grade");
      }

      


   } 

   
}
