
/**
 * Write a description of class Exercise08_07 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindingClosestPair
{
   public static void main(String[] args){
      double[][] points = { {  -1, 0, 3}, { -1, -1,  -1}, 
                            {   4, 1, 1}, {  2,0.5,   9}, 
                            { 3.5, 2,-1}, {  3,1.5,   3}, 
                            {-1.5, 4, 2}, {5.5,  4,-0,5}
                          }; 
      int pp1 = 0; 
      int pp2 = 1; 
      double distanceMin = 0.0; 
      double distance = 0.0;     
      for (int i=0; i<7; i++){
        for (int j=i+1; j<8; j++){
            double[] p1 = points[i];
            double[] p2 = points[j]; 
            
            distance = Math.pow( (p1[0]-p2[0])*(p1[0]-p2[0])
                                +(p1[1]-p2[1])*(p1[1]-p2[1])
                                +(p1[2]-p2[2])*(p1[2]-p2[2]), 0.5
                                );
            if (i==0 && j==1){ 
                distanceMin = distance; 
                pp1 = 0; 
                pp2 = 1; 
            }
            else if (distance < distanceMin){
               distanceMin = distance; 
               pp1 = i; 
               pp2 = j; 
            }  
          }      
        }
      System.out.println("The closest two points are "+pp1+" and "+pp2+", there distance is "+distanceMin); 
    }
}
