import java.io.File; 
import java.io.PrintWriter; 
import java.io.IOException; 
/**
 * Write a description of class Gene here.
 * 
 *  Non-object Oriented version. 
 * 
 * @author (Eric Y. Chou) 
 * @version (11/24/2015)
 */
public class Gene
{
    final static char A = 'A'; 
    final static char C = 'C'; 
    final static char T = 'T'; 
    final static char G = 'G'; 
    final static char F = '5';   // Five for 5,  used for direction of strand
    final static char D = '3';   // Delta for 3, used for direction of strand 
    
    public static char complement(char code){ 
       char comCode = A; 
       
       if (code == A) comCode = T;          
       else if (code == T) comCode = A; 
       else if (code == C) comCode = G; 
       else if (code == G) comCode = C;
       else if (code == D) comCode = F; 
       else if (code == F) comCode = D;  
       return comCode; 
    } 
    
    public static boolean isComplement(char code, char code2){ 
       boolean res = true;
       
       if (code != complement(code2)) res = false;          
      
       return res; 
    } 
    
    public static String toComplementary(String inStr){
       String str = ""; 
       for (int i = 0; i < inStr.length();  i++) 
                str += complement(inStr.charAt(i));
       return str;  
    }
    
    // DNA Information extraction and encapsulation 
    public static String getDNA(String s){
       String res = ""; 
       if (s.charAt(0) == F && s.charAt(s.length()-1) == D){ // legal dna string with strand direction header
            res = s.substring(1, s.length()-1); 
       }
       else if (s.charAt(0) == D && s.charAt(s.length()-1) == F){ // legal dna string with strand direction header
            res = s.substring(1, s.length()-1); 
       }
       else res = s;        // no header or non-dna string (do nothing)
       return res;  
    }
    
    public static String toUpperStrand(String s){
         return F+s+D; 
    }
    
    public static String toLowerStrand(String s){
         return D+s+F; 
    }
    
    public static String reverseComplementary(String inStr){
     String str = ""; 
     for (int i = inStr.length()-1 ; i>=0; i--) 
                str += complement(inStr.charAt(i));
     return str;  
    }
    
    public static String tandemRepeat(String inStr, int repeat){
     String str = ""; 
     for (int i = 0;  i<repeat; i++) str += inStr; 
     return str; 
    }
    
    public static String tandemRepeatWithNonRepeat(String a, String n){
      return a+n+a; 
    } 
    
    public static boolean isPalindrome(String s){
      int low = 0;
      // The index of the last character in the string
      int high = s.length() - 1;
      boolean isPalindrome1 = true;
      while (low < high) {
        if (s.charAt(low) != s.charAt(high)) {
	        isPalindrome1 = false;
	        break;
        }
        low++;
        high--;
      }
      return isPalindrome1;
    }
    
    public static boolean isReverseComplementaryPalindrome(String s){
      int low = 0;
      // The index of the last character in the string
      int high = s.length() - 1;
      boolean isRCPalindrome1 = true;
      while (low < high) {
        if (!isComplement(s.charAt(low), s.charAt(high))) {
	        isRCPalindrome1 = false;
	        break;
        }
        low++;
        high--;
      }
      return isRCPalindrome1;
    }
    
    public static String reverse(String s){
      String str = ""; 
      for (int i=s.length()-1; i>=0; i--){
          str += s.charAt(i); 
        }
      return str; 
    } 
    
    public static String duplicate(String s){
        String str= new String(s);
      return str; 
    }
    
    public static String toPalindrome(String s){
      String str = ""; 
         str = s + reverse(s); 
      return str; 
    }
    public static String toReverseComplementaryPalindrome(String s){
       String str = ""; 
          str = s + toComplementary(reverse(s)); 
       return str; 
    }
    
    public static String cutItOut( String s, int a, int b ){
       return s.substring(0, a) + s.substring(b+1); 
    }
    
    public static String cutOutS(String s1, String s2){ // one cut by if
        String str = s1; 
        if (str.contains(s2)){
          str = cutItOut(str, str.indexOf(s2), str.indexOf(s2)+s2.length()-1); 
        }
        return str; 
    }
    
    public static String cutOutAll(String s1, String s2){ // cut all by while
        String str = s1; 
        while (str.contains(s2)){
          str = cutItOut(str, str.indexOf(s2), str.indexOf(s2)+s2.length()-1); 
        }
        return str; 
    }
    
    public static String swap(String s, int i, int j){
        char chi = s.charAt(i); 
        char chj = s.charAt(j); 
        char chtemp = chi;  // character swap first. 
             chi = chj; 
             chj = chtemp; 
        String str = s.substring(0, i) + chi + s.substring(i+1); 
               str = str.substring(0, j) + chj + str.substring(j+1); 
               // System.out.print(i+" "+j+" "); 
        return str;     
    }
    
    public static String randomSwap(String s){
         int i = (int)(Math.random()*s.length()); 
         int j = (int)(Math.random()*s.length()); 
         
         String str = swap(s, i, j); 
         return str;
    }
    
    public static String randomShuffle(String s, int steps){
         String str = s; 
         for (int i=0; i<steps; i++){
              str = randomSwap(str); 
            }
         return str; 
    }
    
    public static String randomDNA(int len){
       String str=""; int num;  char code; 
       for (int i=0; i<len; i++){
            num = (int)(Math.random()*4);
            if (num == 0) code = A; 
            else if (num == 1) code = C; 
            else if (num == 3) code = T; 
            else code = G; 
            
            str += code; 
        }
       return str; 
    }

    // Utility: 
    public static void log(PrintWriter out, String message) throws IOException {  
       System.out.println(message); 
       out.println(message); 
    }
    
    public static void main(String[] args)throws IOException {
       File oFile = new File("Gene.txt"); 
       PrintWriter out = new PrintWriter(oFile); 
       String dnaStr1 = ""+F+A+C+T+G+A+G+C+T+D;   // make a DNA String
       log(out, "Basic DNA Operations: ");
       log(out, "Complement of "+A+" is "+complement(A)); 
       log(out, "Complement of "+C+" is "+complement(C)); 
       log(out, "Complement of "+T+" is "+complement(T)); 
       log(out, "Complement of "+G+" is "+complement(G)); 
       log(out, "Complement of "+D+" is "+complement(D)); 
       log(out, "Complement of "+F+" is "+complement(F)); 
       log(out, dnaStr1 +" is converted to "+toComplementary(dnaStr1)); 
       log(out, dnaStr1 +" has DNA information of "+ getDNA(dnaStr1)); 
       log(out, "\nUpper Strand and Lower Strand: "); 
       String codeStr1 = getDNA(dnaStr1);
       String uDNAStr1 = toUpperStrand(codeStr1);
       String lDNAStr1 = toLowerStrand(codeStr1); 
       log(out, codeStr1+" is encapsulated to a Upper Strand DNA: "+ uDNAStr1);
       log(out, codeStr1+" is encapsulated to a Lower Strand DNA: "+ lDNAStr1); 
       log(out, "\nReverse Complementary: "); 
       String uToL = reverseComplementary(uDNAStr1); 
       log(out, uDNAStr1+" and "+ toComplementary(uDNAStr1)+" is converted in reverse Complementary to: "+ uToL+" and "+toComplementary(uToL)); 
       
       log(out, "\nTandem Repeat: ");
       String codeStr1TandemRepeat = tandemRepeat(codeStr1, 2);
       log(out, codeStr1+" has a 2 times tandemRepeat of "+codeStr1TandemRepeat);
       String codeStr2 = ""+T+G+C+C+A;
       String codeStr2TandemRepeat = tandemRepeat(codeStr2, 4); 
       log(out, codeStr2+" has a 4 times tandemRepeat of "+ codeStr2TandemRepeat); 
       log(out, codeStr2+" tandemRepeat with Non-repeat pattern CTC: "+tandemRepeatWithNonRepeat(codeStr2, "CTC")); 
       
       log(out, "\nPalindrome Checks: "); 
       String codeStr3 = ""+A+G+C+T+T+C+G+A; 
       log(out, codeStr2+" check for textual palindrome is "+isPalindrome(codeStr2)); 
       log(out, codeStr3+" check for textual palindrome is "+isPalindrome(codeStr3));       
       String codeStr5 = toPalindrome(codeStr2); 
       log(out, codeStr2+" to Palindrome: "+codeStr5); 
       String codeStr6 = toReverseComplementaryPalindrome(codeStr2); 
       log(out, codeStr2+" to reverse complementary Palindrome: "+codeStr6); 
       log(out, codeStr5+" check for reverse complementary Palindrome is "+isReverseComplementaryPalindrome(codeStr5)); 
       log(out, codeStr6+" chcek for reverse complementary Palindrome is "+isReverseComplementaryPalindrome(codeStr6));     
       
       log(out, "\nString Operations (reverse).................... ");
       log(out, codeStr2+" has a reverse of "+reverse(codeStr2)); 
       log(out, "String Operations (duplicate).................... ");
       String codeStr4 = duplicate(codeStr3); 
       log(out, codeStr3+" has a duplication of "+codeStr4); 
       log(out, "String Operations (One Cut).................... ");
       log(out, codeStr3+" cut out "+"CT"+" is "+cutOutS(codeStr3, "CT"));
       log(out, codeStr3+" cut out "+"GC"+" is "+cutOutS(codeStr3, "GC"));
       String firstCut = cutOutS(codeStr2TandemRepeat, "CAT");
       String secondCut= cutOutS(firstCut, "CAT");
       String thirdCut = cutOutS(secondCut, "CAT"); 
       log(out, codeStr2TandemRepeat+" first  cut out "+"CAT"+" is "+firstCut); 
       log(out, codeStr2TandemRepeat+" second cut out "+"CAT"+" is "+secondCut); 
       log(out, codeStr2TandemRepeat+" third  cut out "+"CAT"+" is "+thirdCut); 
       log(out, "String Operations (Cut All).................... ");
       String cuttingAll = cutOutAll(codeStr2TandemRepeat, "CAT");
       log(out, codeStr2TandemRepeat+" cut out all "+"CAT"+" is "+cuttingAll); 
       
       log(out, "String Operations (replace).................... ");
       log(out, codeStr3+" replace "+"CT"+" with AT is "+codeStr3.replace("CT","AT"));
       log(out, codeStr3+" replace "+"GC"+" with TG is "+codeStr3.replace("GC","TG"));
       log(out, codeStr2TandemRepeat+" replace "+"CAT"+" with TAC is     "+codeStr2TandemRepeat.replace("CAT", "TAC"));    // same result
       log(out, codeStr2TandemRepeat+" replace all "+"CAT"+" with TAC is "+codeStr2TandemRepeat.replaceAll("CAT", "TAC")); // same result  
       //log(swap(codeStr3, codeStr3.length()-1, codeStr3.length()-1)); 
       //log(swap(codeStr3, 0, 0)); 
       //log(codeStr3); 
       //log(randomSwap(codeStr3));    log(randomSwap(codeStr3));    log(randomSwap(codeStr3));    log(randomSwap(codeStr3)); 
       log(out, codeStr2TandemRepeat+" after random shuffle is "+randomShuffle(codeStr2TandemRepeat, 5000)); 
       
       log(out, "String Operations (random DNA Generation).................... "); 
       log(out, "Random DNA of 30 codes: "+randomDNA(30)); 
       out.close(); 
    }
}
