import java.util.Scanner;
import java.util.Random;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Difficulty level for Addition (0-2):");
        final int a = input.nextInt();
        int Range = 0;
        int Baseline = 0;

        if (a == 0) {
            Range = 10;
            Baseline = 0;
        } else if (a == 1) {
            Range = 100;
            Baseline = 0;

        } else if (a == 2) {
            Range = 199;
            Baseline = -Range / 2;
        }
        long seed = System.currentTimeMillis();
        Random rinput = new Random(seed);
        int number1 = rinput.nextInt(Range) + Baseline;
        int number2 = rinput.nextInt(Range) + Baseline;

        System.out.print("What is " + number1 + " + " + number2 + " ?  ");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {

            System.out.println("wrong answer. Try again. ");
            System.out.print("What is " + number1 + " + " + number2 + " ?  ");
            answer = input.nextInt();

        }
        System.out.println("You got it !");
        input.close();
    }
}
