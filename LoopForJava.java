public class LoopForJava {
    public static void main(String[] args) {
        for (int i = 1; i <= 6 ; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print("+");
            }
            for(int j = 1 ; j <= 6 - i; j++){
                System.out.print("*");
            }
            for(int n = 7; n<=7 +  i ; n++){
                System.out.print("!");
            }

            for(int n = 7; n<= 13 - i  ; n++){
                System.out.print("$");
            }
            System.out.println();
        }
        int numScore = 0;
        if (numScore == 0)
            throw new ArithmeticException("Cannot divide by zero");
        
            


    }
}
