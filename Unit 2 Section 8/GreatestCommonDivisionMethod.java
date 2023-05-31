import java.util.Scanner;

public class GreatestCommonDivisionMethod {
    public static int god(int n1, int n2) {
        int god = 1;
        int k = 2;
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                god = k;
                k++;

            }

        }
        return god;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer:");
        int n1 = input.nextInt();
        System.out.print("Enter second integer:");
        int n2 = input.nextInt();

        System.out.println("The greatest common divisor for" + n1 + " and " + n2 + " is " + god(n1, n2));
    }
}