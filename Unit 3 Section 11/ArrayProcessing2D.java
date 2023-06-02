
/**
 * Write a description of class ArrayProcessing2D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayProcessing2D
{ static int[][] matrix = { {2, 4, 5, 6, 3},
                     {6, 7, 9, 1, 3},
                     {4, 2, 1, 6, 7},
                     {7, 5, 4, 3, 6},
                     {4, 3, 4, 6, 2}};
                     
   public static void main(String[] args){
      // print 2D-array
      System.out.println("Matrix Print Out:"); 
       for (int row = 0; row < matrix.length; row++) {
         for (int column = 0; column < matrix[row].length; column++) {
             System.out.print(matrix[row][column] + " ");
         }
         System.out.println();
       } 
       System.out.println(); 
       // summing all elements
       int total = 0;
       for (int row = 0; row < matrix.length; row++) {
         for (int column = 0; column < matrix[row].length; column++) {
           total += matrix[row][column];
         }
       }
       System.out.println("Sum of all elements: "+total); 
       // sum of columns 
       System.out.println(); 
       for (int column = 0; column < matrix[0].length; column++) {
          total = 0;
          for (int row = 0; row < matrix.length; row++)
               total += matrix[row][column];
          System.out.println("Sum for column " + column + " is " + total);
       }
       System.out.println(); 
       
       // sum of rows 
       for (int row = 0; row < matrix.length; row++) {
          total = 0;
          for (int column = 0; column < matrix[row].length; column++)
               total += matrix[row][column];
          System.out.println("Sum for row " + row + " is " + total);
       }
       System.out.println(); 
    // Row has maximum sum
    int sum = 0; 
    int maxSum = Integer.MIN_VALUE; int maxRow = 0; 
    for (int i=0; i<matrix.length; i++){
      sum = 0; 
      for (int j=0; j<matrix[i].length; j++){
           sum += matrix[i][j];
        }
      if (sum > maxSum) {maxSum = sum; maxRow = i; }
    }
    
    System.out.println("Row: "+maxRow+ " has the largest sum="+maxSum); 
       
    // finding smallest index for the largest element. 
    System.out.print("Smallest indeice of the largest element: "); 
    int maxi=0; int maxj =0;  int max = matrix[0][0];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
              if (max < matrix[i][j]) {
               maxi = i; maxj = j; max = matrix[i][j]; 
             }
        }
     }
    System.out.println("matrix["+ maxi + ", "+maxj+"] = "+max); 
    // Random Shuffling
    for (int i = 0; i < matrix.length; i++) {
       for (int j = 0; j < matrix[i].length; j++) {
         int i1 = (int)(Math.random() * matrix.length);
         int j1 = (int)(Math.random() * matrix[i].length);
         // Swap matrix[i][j] with matrix[i1][j1]
         int temp = matrix[i][j];
         matrix[i][j] = matrix[i1][j1]; 
         matrix[i1][j1] = temp;
       }
    }
      // print 2D-array
       System.out.println("Matrix Print Out After Shuffling:"); 
       for (int row = 0; row < matrix.length; row++) {
         for (int column = 0; column < matrix[row].length; column++) {
             System.out.print(matrix[row][column] + " ");
         }
         System.out.println();
       } 
    }
}
