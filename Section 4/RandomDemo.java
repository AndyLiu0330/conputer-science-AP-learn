import java.util.Random;
public class RandomDemo {
   public static void main(String[] args ){
    
    int seed = 1125;
    long currentTime = System.currentTimeMillis();
    seed = (int) (currentTime %= 100000);
    Random randGen = new Random(seed);
    int a,b;
    for(int i=0; i<10; i++){
        a = randGen.nextInt(100);
        System.out.println("Random ["+i+"] = " + a);

    }
    System.out.println();
    for (int i = 0; i<10 ; i++){
        b = (int) (Math.random()*10+11 );
        System.out.println("Math.random ["+ i +"]" + b );
    }
   } 
}