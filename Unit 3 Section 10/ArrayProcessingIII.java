
/**
 * Write a description of class ArrayProcessingIII here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayProcessingIII
{
    // for even number list test:
    //public static double[] list = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
    // for odd number list test: 
     public static double[] list = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 7.0, 7.0, 8.0, 9.0, 10.0, 11.0};
    // for mode testing:
    //public static double[] list = {1.0, 3.0, 2.0, 5.0, 4.0, 4.0, 4.0, 4.0, 3.0, 2.0, 4.0, 9.0, 4.0, 3.0, 6.0, 7.0, 4.0, 3.0};
    
    public static void printArray(double[] myList){
        for (double e: myList) System.out.printf("%8.2f ", e);
        
        System.out.println(); 
    }
    public static void printIntArray(int[] myList){
        for (int e: myList) System.out.printf("%4d ", e);
        
        System.out.println(); 
    }
    
    public static double sum(double[] myList){
        double total = 0;
        for (double e: myList) total += e;
        
        return total; 
    }
    
    public static double avg(double[] myList){
        double avg1 = 0;
        avg1 = sum(myList)/myList.length; 
        return avg1; 
    }
    
    public static double max(double[] myList){
        double max1 = Double.MIN_VALUE;
        for (double e: myList) if (e > max1) max1 = e;
        
        return max1; 
    }
    public static int max(int[] myList){
        int max1 = Integer.MIN_VALUE;
        for (int e: myList) if (e > max1) max1 = e;
        
        return max1; 
    }
    
    public static double min(double[] myList){
        double min1 = Double.MAX_VALUE;
        for (double e: myList) if (e < min1) min1 = e;
        
        return min1; 
    }
    
    public static double median(double[] myList){ // myList must already be sorted.  (for-each loop does not help)
       double median1 = 0.0; 
       
       if (myList.length % 2 != 0){
           median1 = myList[myList.length/2];
        }
       else median1 = (myList[myList.length/2]+myList[myList.length/2-1])/2.0;
        
       return median1; 
    }
    
    public static double range(double[] myList){
      double max1 = max(myList); 
      double min1 = min(myList);
      
      return max1-min1; 
    }
    
    public static double mode(double[] myList){ // (modified in for-each-loop format)
        int[] myMode      = new int[myList.length];
        int[] myModeIndex = new int[myList.length];
        double myMode1 = 0.0; 
        
        int[] index = rangeIn(0, myList.length); // created for for-each-loop 
        //for (int i=0; i<myList.length; i++){
        for (int e: index){
          myModeIndex[e] = 0; 
          //for (int j=0; j<myList.length; j++){
          for (int f: index){
                if (myList[e]==myList[f]) {myMode[e]++; myModeIndex[e] = f;} // find the last occurence of the same number
            }
        }
        
        int maxMode = max(myMode); 
        //for (int k = 0; k<myList.length; k++){
        for (int g: index){
          if (myMode[g] == maxMode) myMode1 = myList[myModeIndex[g]]; 
        }
        return myMode1; 
    }
    
    /**
     * rangeIn method: index generation method for for-each loop. 
     * 
     * This method can be a good workaround for for-each loop which has no built-in indice. 
     * 
     */
    public static int[] rangeIn(int begin, int end, int step){ // create a range in (data set) function 
        final int PRECISION = 100000; 
        int span = (end-begin)>=0 ? (end-begin+step-1) : (begin-end-step-1); 
        if (span <= 0) return null; 
        int count = Math.round(Math.abs(span/step)*PRECISION)/PRECISION; 
        
        int[] rangeList = new int[count]; 
        
        for (int i=0; i<count; i++){ rangeList[i] = begin + i * step; }
       
        return rangeList; 
    }  /* Wrong index will create run-time error */ 
    
    public static int[] rangeIn(int begin, int end){ // create a range in (data set) function 
        final int step = (end-begin)>=0 ? 1 : -1; 
        final int PRECISION = 100000; 
        int span = (end-begin)>=0 ? (end-begin+step-1) : (begin-end-step-1); 
        if (span <= 0) return null; 
        int count = Math.round(Math.abs(span/step)*PRECISION)/PRECISION; 
        
        int[] rangeList = new int[count]; 
        
        for (int i=0; i<count; i++){ rangeList[i] = begin + i * step; }
       
        return rangeList; 
    }  /* Wrong index will create run-time error */ 
    
    public static int[] rangeIn(int end){ // create a range in (data set) function 
        final int begin = 0; 
        final int step = (end-begin)>=0 ? 1 : -1; 
        final int PRECISION = 100000; 
        int span = (end-begin)>=0 ? (end-begin+step-1) : (begin-end-step-1); 
        if (span <= 0) return null; 
        int count = Math.round(Math.abs(span/step)*PRECISION)/PRECISION; 
        
        int[] rangeList = new int[count]; 
        
        for (int i=0; i<count; i++){ rangeList[i] = begin + i * step; }
       
        return rangeList; 
    }  /* Wrong index will create run-time error */ 
    
    public static void main(String[] args){
       System.out.print("list: "); 
       printArray(list); 
       System.out.println("Sum    of list: "+sum(list));
       System.out.println("Avg    of list: "+avg(list));
       System.out.println("Max    of list: "+max(list));
       System.out.println("Min    of list: "+min(list));   
       System.out.println("Median of list: "+median(list)); 
       System.out.println("Range  of list: "+range(list));
       System.out.print("Mode   of list: "+mode(list)); System.out.println("    // Using rangeIn as index"); 
       int[] list2 = rangeIn(1, 32, 3); 
       System.out.print("3 param rangeIn method rangeIn(1, 32, 3): "); printIntArray(list2); 
       int[] list3 = rangeIn(1, 12); 
       System.out.print("2 param rangeIn method rangeIn(1, 12)   : "); printIntArray(list3); 
       int[] list4 = rangeIn(12); 
       System.out.print("1 param rangeIn method rangeIn(12)      : "); printIntArray(list4); 
       list2 = rangeIn(32, -2, -3); 
       System.out.print("3 param rangeIn method rangeIn(32, -2, -3): ");printIntArray(list2); 
       list3 = rangeIn(12, 1); 
       System.out.print("2 param rangeIn method rangeIn(12, 1)    : ");printIntArray(list3); 
       System.out.print("Creating Stepped Sequence using rangeIn(0, 10) method: "); 
       for (int e: rangeIn(0, 10)) System.out.print(e+" "); System.out.println();  
    }
}
