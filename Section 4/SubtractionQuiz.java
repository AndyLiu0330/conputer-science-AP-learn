import java.util.Scanner;
public class SubtractionQuiz {
   public static void main(String[] args){
    int a = (int) (Math.random() * 10);
    int b = (int) (Math.random() * 10);
    System.out.println("a is " + a);
    System.out.println("b is " + b);
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the answer of a subtrect by b : ");
    int c  = input.nextInt();
    if (c == a-b){
        System.out.println("The answer is correct");
    }
    else {
        System.out.println("Your answer is incorrect. " + (a-b) + " " + "is the right answer.");

    }
    input.close();

   } 
}
