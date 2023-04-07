

import java.util.Scanner; 

public class CalculateBoolen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        boolean isGreater = 5 > 3;
        System.out.println(isGreater);
        boolean b = 5 < 3;
        boolean result = b && (12 - 111 / 30 > 0);
        System.out.println(result);
        // 三元运算符

         System.out.print("Enter an integer: "); // data fom console
        int n = input.nextInt(); 
        int x = n >= 0 ? n : -n;
        System.out.println(x);
        input.close();
        


    }

}
/*
 * 比较运算符：>，>=，<，<=，==，!=
 * 与运算 &&
 * 或运算 ||
 * 非运算 !
 */
