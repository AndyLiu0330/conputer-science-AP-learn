
public class TestTwoArrays {
 public static void main(String[] args) {
    int [][] triangleArray = {
        {1, 2, 3, 4, 5},
        {2, 3, 4, 5, 0},
        {3, 4, 5, 0, 0},
        {4, 5, 0 , 0, 0},
        {5,0 ,0 ,0 ,0}
    
        
    };
    for (int i = 0; i< 2; i++){
        for (int j = 0; j< 2; j++){
            triangleArray [3 + i][3+j] = triangleArray[i][j];
        }
    }
       for (int i = 0; i <triangleArray.length; i++){
        for (int j = 0; j < triangleArray[i].length ; j++  ){
            System.out.print(triangleArray[i][j] + " ");
            
        }
        System.out.println();

       } 

    }

}