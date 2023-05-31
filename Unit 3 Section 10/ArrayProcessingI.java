import java.util.Scanner; 
/**
 * Write a description of class ArrayProcessingI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayProcessingI
{   
    static double[] myList = new double[5];  
    public static void ap1_Initialize(){
           Scanner input = new Scanner(System.in); 
          
           System.out.print("Enter " + myList.length + " values: ");
            
           for (int i = 0; i < myList.length; i++) 
              myList[i] = input.nextDouble();

              input.close();
    }
    
    public static void ap2_random(){
           for (int i = 0; i < myList.length; i++) {
              myList[i] = Math.random() * 100;
           }
    }
    
    public static void ap3_printArray(){
        for (int i = 0; i < myList.length; i++) {
            System.out.printf("%8.2f ", myList[i]);
        }
    }
    
    public static double ap4_sum(){
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
        total += myList[i];
        }
        return total; 
    }
    
    public static double ap5_max(){
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
          if (myList[i] > max) max = myList[i];
        }
        return max; 
    }
    
    public static void ap6_randomShuffle(){
        for (int i = 0; i < myList.length; i++) {
           // Generate an index j randomly
           int index = (int)(Math.random()* myList.length);
 
           // Swap myList[i] with myList[index]
           double temp = myList[i];
             myList[i] = myList[index]; 
             myList[index] = temp;
        }
    }
    public static void ap7_leftShifting(){
       double temp = myList[0]; // Retain the first element

       // Shift elements left
       for (int i = 1; i < myList.length; i++) {
          myList[i - 1] = myList[i];
       }

       // Move the first element to fill in the last position
       myList[myList.length - 1] = temp;
    }
    
    public static void ap8_rightShifting(){
        double temp = myList[myList.length-1]; // Retain the last element

        // Shift elements left
        for (int i = myList.length-2; i >=0; i--) {
            myList[i + 1] = myList[i];
        }

        // Move the last element to fill in the first position
        myList[0] = temp;
    }
    
    public static void main(String[] args){
        // demo example 1 and example 3: 
        ap1_Initialize(); 
        System.out.print("Array After Initialization: "); 
        ap3_printArray(); 
        System.out.println(); 
        
        // demo example 2
        ap2_random(); 
        System.out.print("Array After Random Input: "); 
        ap3_printArray(); 
        System.out.println(); 
        
        // demo exmple 4: 
        System.out.printf("Sum of myList: %10.4f %n", ap4_sum()); 
        // demo exmple 5: 
        System.out.printf("max of myList: %10.4f %n", ap5_max()); 
        // demo exmple 6: 
        System.out.print("After Random Shuffle: ");
        ap6_randomShuffle(); 
        ap3_printArray(); 
        System.out.println(); 
        // demo example 7: 
        System.out.print("After Left Shifting: ");
        ap7_leftShifting(); 
        ap3_printArray(); 
        System.out.println(); 
        
        // demo example 8: 
        System.out.print("After Right Shifting: ");
        ap8_rightShifting(); 
        ap3_printArray(); 
        System.out.println(); 
        

        
    }

}
