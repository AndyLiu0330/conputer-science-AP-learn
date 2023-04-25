public class OMG {
   public static void main(String[] args){
    String ors = "Oh My God! I lost my high school backpack. You may laugh out loud but this is a very big deal. In case you didn't know. Just for your information. ";
    String c1 = ors.replace("Oh My God", "OMG");
    String c2 = c1.replace("high school", "HS");
    String c3 = c2.replace("laugh out loud", "LOL");
    String c4 = c3.replace("very big deal", "VBD");
    String c5 = c4.replace("In case you didn't know ", "INCYDK");
    String c6 = c5.replace("for your information", "FYI");
    System.out.println(ors);
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("Teacher's answer des. ");
    String originalMessage = "oh my god! i lost my high school backpack.  you may laugh out loud but this is a very big deal. in case you didn't know.  just for your information.";   

      String str1 = originalMessage.replaceAll("oh my god", "OMG"); 
      String str2 = str1.replaceAll("high school", "HS"); 
      String str3 = str2.replaceAll("laugh out loud", "LOL");
      String str4 = str3.replaceAll("very big deal", "VBD"); 
      String str5 = str4.replaceAll("in case you didn't know", "INCYDK"); 
      String str6 = str5.replaceAll("for your information", "FYI"); 
      System.out.println("ORIG: "+ originalMessage); 
      System.out.println("STR1: "+ str1); 
      System.out.println("STR2: "+ str2); 
      System.out.println("STR3: "+ str3); 
      System.out.println("STR4: "+ str4); 
      System.out.println("STR5: "+ str5); 
      System.out.println("STR6: "+ str6); 

   } 
}
