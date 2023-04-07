import java.util.Scanner;
public class ComputeArea {

   

   public static void main (String[]args){
   final double Pi =  3.14149;  
    double radius ; //dlcare rakdius
    double area;
    double perimeter;
    Scanner input = new Scanner (System.in);
    System.out.print("Enter the radius: ");
    radius = input.nextDouble(); 

    area = radius*radius* Pi ;
    perimeter = Pi *2*radius;
    System.out.println("The area for the circle of radius"+ radius + " is " + area);

    System.out.println("The perimeter for the circle of radius"+ radius + " is " + perimeter );
   }
}
