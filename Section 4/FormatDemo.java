
public class FormatDemo
{
   public static void main(String[] args){
    
       double sin0PI    = Math.sin(0*Math.PI); 
       double sin025PI  = Math.sin(0.25*Math.PI); 
       double sin05PI   = Math.sin(0.5*Math.PI); 
       double sin075PI = Math.sin(0.75*Math.PI); 
       double sin1PI    = Math.sin(1.0*Math.PI); 
       double sin125PI  = Math.sin(1.25*Math.PI); 
       double sin15PI   = Math.sin(1.5*Math.PI); 
       double sin175PI  = Math.sin(1.75*Math.PI);        
       double sin2PI    = Math.sin(2.0*Math.PI); 
       double cos0PI    = Math.cos(0*Math.PI); 
       double cos025PI  = Math.cos(0.25*Math.PI); 
       double cos05PI   = Math.cos(0.5*Math.PI); 
       double cos075PI = Math.cos(0.75*Math.PI); 
       double cos1PI    = Math.cos(1.0*Math.PI); 
       double cos125PI  = Math.cos(1.25*Math.PI); 
       double cos15PI   = Math.cos(1.5*Math.PI); 
       double cos175PI  = Math.cos(1.75*Math.PI);        
       double cos2PI    = Math.cos(2.0*Math.PI);   
       
       // print out the header
       System.out.println("     Sine and Cosine Math Table");
       System.out.println("    Angle       Sine       Cosine"); 
       System.out.println("======================================="); 
       //System.out.print("  "+0.0*Math.PI); 
       //System.out.print("  "+sin0PI);
       //System.out.println("  "+cos0PI);
       //System.out.print("  "+0.25*Math.PI); 
       //System.out.print("  "+sin025PI);
       //System.out.println("  "+cos025PI);
       // print out the table
       System.out.printf("%9.2f  ", 0.0); 
       System.out.printf("%9.2f  ", sin0PI);
       System.out.printf(" %9.2f  %n", cos0PI); 
       System.out.printf("%9.2f  ", 0.25); 
       System.out.printf("%9.2f  ", sin025PI);
       System.out.printf(" %9.2f  %n", cos025PI); 
       System.out.printf("%9.2f  ", 0.5); 
       System.out.printf("%9.2f  ", sin05PI);
       System.out.printf(" %9.2f  %n", cos05PI); 
       System.out.printf("%9.2f  ", 0.75); 
       System.out.printf("%9.2f  ", sin075PI);
       System.out.printf(" %9.2f  %n", cos075PI); 
       System.out.printf("%9.2f  ", 1.0); 
       System.out.printf("%9.2f  ", sin1PI);
       System.out.printf(" %9.2f  %n", cos1PI); 
       System.out.printf("%9.2f  ", 1.25); 
       System.out.printf("%9.2f  ", sin125PI);
       System.out.printf(" %9.2f  %n", cos125PI); 
       System.out.printf("%9.2f  ", 1.5); 
       System.out.printf("%9.2f  ", sin15PI);
       System.out.printf(" %9.2f  %n", cos15PI); 
       System.out.printf("%9.2f  ", 1.75); 
       System.out.printf("%9.2f  ", sin175PI);
       System.out.printf(" %9.2f  %n", cos175PI); 
       System.out.printf("%9.2f  ", 2.0); 
       System.out.printf("%9.2f  ", sin2PI);
       System.out.printf(" %9.2f  %n", cos2PI); 
   }
}
