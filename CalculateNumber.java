public class CalculateNumber {
   public static void main(String[] args){
    int i = (100 + 200) * (99 -88);
    int n = 7*(5 +(i-9));
    System.out.println(i);
    System.out.println(n);
        long x = 2147483640;
        long y = 15;
        long sum = x + y;
       y-- ;
      //   System.out.println("It is number ++ :"+  y);
        System.out.println(sum); // -214748364o1
        short s = 1234;
        int a = 123456;
        int b = s + a; // s自动转型为int
       System.out.println(b);
      int r = 100;
      r = r * (r + 1);
      int sumR = r / 2;
      System.out.println("Sum of R " + sumR);
   } 
}
