
/**
 * Write a description of class Pointers here.
 * 
 * @author (Eric Y. Chou) 
 * @version (V1, 11/10/2015)
 */
public class Pointers
{ 
    public static void main(String[] args){
       String str1 = "How are you?";
       String str2 = new String("always");
       String str3 = "How are you?";
       String str4 = new String("How are you?");
       String str5;
       String str6; 
       
       // pointer assignment
       //1. assign str5 to str1
       System.out.println("First assignment of str5: "); 
       str5 = str1;
       System.out.println("Str1: "+str1+"   Str5: "+str5); 
       System.out.println(); 
       System.out.println("Check two ways of interned string: "); 
       System.out.println(""+(str1==str3));
       System.out.println(str1==str3); 
       System.out.println(); 
       //2. change str1 to I am fine; 
       str1 = "I am fine !"; 
       // show difference between str1 and str5
       System.out.println("Check results after re-assignment of str1: "); 
       System.out.println("Str1: "+str1+"   Str5: "+str5); 
       System.out.println(); 
       System.out.println("Check interned string: "); 
       System.out.println(str1==str3);
       System.out.println(str5==str3);
       System.out.println(str3==str4);
       System.out.println(str3.equals(str4)); 
       //3. increment works like append
       str6 = ""+'A';
       str6 += 'B';  // += works like append; 
       str6 += 'C'; 
       // Check pointer after append
       System.out.println(); 
       System.out.println("Check pointers after append: ");
       //4. re-assign str5
       str5 = str6; 
       System.out.println(str5==str6); 
       //5. check after appends
       str6 += ' '; 
       System.out.println(str5==str6); 
       System.out.println(); 
       System.out.println("String after many appends: "); 
       str6 += '=';
       str6 += 3.25; // all numbers, characters can be appended to string. 
       System.out.println(str6);
       //6. one way to create substring. 
       str2 = ""+str2.charAt(2)+str2.charAt(3)+str2.charAt(4);  // one way to create substring
       System.out.println(str2); 
    }
}
