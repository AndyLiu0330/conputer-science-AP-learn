public class CallByValue {
   public static void main (String[]  args ){
    int x = 1;
    System.out.println("Before the call x (x in main)is " + x );
    increase(x);
    System.out.println("after the call " + x );
   } 



   public static void increase(int n ){
    n++;
    System.out.println("n inside the method is " + n );
   }
}
