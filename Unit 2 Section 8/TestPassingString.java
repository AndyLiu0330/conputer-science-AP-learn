public class TestPassingString {
    public static String f(String aa) {  

        String bb = aa;
        System.out.println("orig address pass to aa ("+aa+") and bb ("+bb+")");
            bb = "XYZ";
        System.out.println("as after modification ("+aa+") and bb after modification ("+bb+")");
        return bb;
        
    }
   public static void main (String[]args){
    String orig = "ABC";
    System.out.println("orig before f():" + orig);
    String cc = f(orig);
    System.out.println("orig after f():" + orig);
    System.out.println("cc after f():" + cc);
   }
    
}
