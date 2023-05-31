public class PrintNumber {
   public static void main(String[] args ){
    System.out.println("The first 50 prime numbers are \n");
    printPrimeNumbers(50);
   } 

   public static void printPrimeNumbers(int numbersofPrime){
    final int Numbersline = 10;
    int count = 0;
    int number = 2;

    while (count < numbersofPrime){
        if (isPrime(number)){
            count ++;
            if (count % Numbersline == 0){
                System.out.printf("%-5s\n", number);
            }
            else 
                System.out.printf("%-5s", number);

        }

    number ++;
    }
   }
   public static boolean isPrime(int number){
    for (int diviaor = 2; diviaor <= number / 2; diviaor ++){

        if (number % diviaor == 0){
            return false;
        }
    }
       return true;
}
}
