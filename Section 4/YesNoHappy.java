
public class YesNoHappy {
    public static void main(String[] args){
        final boolean Yes = true;
        final boolean No = false;

        char ch0 = 'H';
        char ch1 = 'a';  
        char ch2 = 'p';
        char ch3 = 'p';
        char ch4 = 'y';
        char ch5 = '!';
        System.out.println("Boolean Value of Yes:"+ Yes + "Bollean Nalue of No:" + No);
        if (Yes){

        System.out.println("Yes case: " + (ch0) + (ch1));
        }
        if (No) {

        System.out.println(" " + ch2 + ch3);
        }
        if (Yes && Character.isLetter(ch0)){
            System.out.println("Original Massage :" + (ch0)+ (ch2) + (ch3) +(ch4)+(ch5) );
        }
            System.out.println("After Incrase:" + (ch0 + 1)+ (ch2 + 1) + (ch3 + 1) +(ch4 + 1 )+(ch5 + 1) );
            System.out.println("back to orginal:" + (ch0 - 1)+ (ch2 - 1) + (ch3 - 1) +(ch4 - 1 )+(ch5 - 1) );
    }
    
}
