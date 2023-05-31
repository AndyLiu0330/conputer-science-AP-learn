import java.util.Scanner;
import java.util.Random;
public class AnalyzingNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter number of Items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter numbers : ");
        for (int i =0; i< n; i++){
            numbers[1] = input.nextDouble();
            sum += numbers[1];

        }
        double average = sum / n;

        int count = 0;
        for (int i= 0; i<n; i++){
            if (numbers[1] > average){
                count++;
            }

        }
        System.out.println("Average is " + average);
        System.out.println("Number of elements avove the average is "+ count);
        double max = numbers[0];
        for (int i = 1; i<numbers.length;i ++){
            if(numbers[i] > max) max = numbers[i];


        }
        System.out.println(max + " is the max of the arry.");
        
        for (int i = 0; i < numbers.length; i ++){
            int index = (int) (Math.random()*numbers.length);
            double temp = numbers[i];
            numbers[i] = numbers[index];
            numbers [index] = temp;



        }   
        input.close();
        
    

    }
}