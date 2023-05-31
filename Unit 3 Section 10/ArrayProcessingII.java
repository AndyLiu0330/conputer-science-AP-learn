
/**
 * Write a description of class ArrayProcessingII here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayProcessingII
{   
    // for even number list test:
    public static double[] list = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
    // for odd number list test: 
    // public static double[] list = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0};
    public static void printArray(double[] myList){
        for (int i = 0; i < myList.length; i++) {
            System.out.printf("%8.2f ", myList[i]);
        }
        System.out.println(); 
    }
    public static void traversalUpward(){       
        System.out.println("\nTraversal Upward Program"); 
        int[] num = {1, 2, 3, 4, 5}; 
        for (int i=0; i<num.length; i++){
           System.out.println("Iteration "+i+" : "+num[i]); 
        }
    }
    
    public static void traversalDownward(){
        System.out.println("\nTraversal Downward Program"); 
        int[] num = {1, 2, 3, 4, 5}; 
        for (int i=num.length-1; i>=0; i--){
           System.out.println("Iteration "+i+" : "+num[i]); 
        }
    }
    
    public static void traversalTwoWay(){       
        System.out.println("\nTraversal Two-way Program"); 
        int[] num = {1, 2, 3, 4, 5}; 
        for (int i=0, j=num.length-1; i<num.length; i++){
           System.out.println("Iteration i="+i+": "+num[i]);
           System.out.println("Iteration j="+j+": "+num[j]); 
           System.out.println(); 
           j--; 
        }
    }
    
    public static void traversalStepSize(int stepSize){
         System.out.println("\nTraversal with Step Size"); 
         int[] num = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
         
         for (int i=0; i< num.length; i+= stepSize){
              System.out.println("Iteration " + i + ": " + num[i]);
            }
    }
     
    public static void reverseOfInteger(){
      int x = 34567; 
      int y = x; 
      int reverseX = 0; 
      while (x != 0){
         int d = x % 10; 
         reverseX = reverseX * 10 + d; 
         x = x /10; 
      }
      
      System.out.println("Reverse Digits of " + y + " is " + reverseX); 
    }
    
    public static void reverseOfString(){
        String x = "ABCDE"; 
        String y = x; 
        String reverseX = ""; 
        while (x.length() != 0){
           reverseX += x.charAt(x.length()-1);
           x = x.substring(0, x.length()-1); 
        }
        System.out.println("Reverse String of " + y + " is " + reverseX); 
    }
    
    public static void reverse(double[] myList){ // same array reverse
        double tmp = 0.0; 
        for (int i=0; i<(myList.length/2); i++){
           tmp = myList[i];
           myList[i] = myList[myList.length-1-i];
           myList[myList.length-1-i] = tmp; 
        }
    }
    
    public static void main(String[] args){
         traversalUpward(); 
         traversalDownward(); 
         traversalTwoWay(); 
         traversalStepSize(2); 
         System.out.println(); 
         reverseOfInteger(); 
         reverseOfString();
         System.out.println("\nReverse of An Array:");
         System.out.print("list before reverse: ");
         printArray(list);  
         reverse(list); 
         System.out.print("list  after reverse: ");
         printArray(list); System.out.println();      
    }
   
}
