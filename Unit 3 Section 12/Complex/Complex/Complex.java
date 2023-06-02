package Complex;
 
import java.text.DecimalFormat; 

/**
 * Write a description of class Complex here.
 * 
 * @author (Eric Y. Chou) 
 * @version (V1, 10/21/2015)
 */
public class Complex
{
  private double r;  // real part
  private double i;  // imaginary part
  
  public Complex(){ this.r = 0; this.i = 0; }                         // Constructor for a Complex 0
  public Complex(double rr) {this.r = rr; this.i = 0.0; }             // Constructor for a real number in Complex type
  public Complex(double rr, double ii){ this.r = rr; this.i = ii; }   // Constructor for a complex number
    
  public double getR(){ return this.r; }
  public double getI(){ return this.i; }
  
  public void setR(double rr){ this.r = rr; }
  public void setI(double ii){ this.i = ii; }
  
  public void setComplex(double rr, double ii){ this.r = rr;  this.i = ii; }
  
  public int getQuadrant(){
       int quad = 1; 
       
       if (this.r >= 0 && this.i >= 0) quad = 1; 
       if (this.r <  0 && this.i >= 0) quad = 2; 
       if (this.r <  0 && this.i <  0) quad = 3; 
       if (this.r >= 0 && this.i <  0) quad = 4; 
       return quad; 
    }
    
  public double getTheta(){
      double theta=0.0; 
      double x = Math.abs(this.r); 
      double y = Math.abs(this.i); 
      double r = Math.sqrt(x*x+y*y);
      if (r != 0) {
        if (this.getQuadrant() == 1) theta = Math.acos(x/r); 
        if (this.getQuadrant() == 2) theta = Math.PI - Math.acos(x/r); 
        if (this.getQuadrant() == 3) theta = Math.PI + Math.acos(x/r); 
        if (this.getQuadrant() == 4) theta = 2*Math.PI - Math.acos(x/r);  
      }
      return theta; 
    }
    
  public double getThetaDegree(){
      double theta=0.0; 
      double x = Math.abs(this.r); 
      double y = Math.abs(this.i); 
      double r = Math.sqrt(x*x+y*y);
      if (r != 0) {
        if (this.getQuadrant() == 1) theta = Math.acos(x/r); 
        if (this.getQuadrant() == 2) theta = Math.PI - Math.acos(x/r); 
        if (this.getQuadrant() == 3) theta = Math.PI + Math.acos(x/r); 
        if (this.getQuadrant() == 4) theta = 2*Math.PI - Math.acos(x/r);  
      }
      return theta*180/Math.PI; 
    } 
    
  public String toString(){   // return a string body, not the pointer
      return "<"+this.r + "+"+ this.i + "i"+">"; 
    }
    
  
  public String toString2(){   // return a string body, not the pointer
      return "<"+String.format("%4.2f", this.r) + "+"+ String.format("%4.2f", this.i) + "i"+">"; 
    }

  public String toString4(){   // return a string body, not the pointer
      return "<"+String.format("%6.4f", this.r) + "+"+ String.format("%6.4f", this.i) + "i"+">"; 
    }    
    
  public boolean equals(Complex cc){
       boolean result = false; 
       if (this.r == cc.r && this.i == cc.i) result = true; 
       return result;
    }
    
  public boolean equals4(Complex cc){
        DecimalFormat df = new DecimalFormat("#.####");  
        boolean result = false; 
        if (df.format(this.r).equals(df.format(cc.r)) && df.format(this.i).equals(df.format(cc.i))) result=true; 
        return result; 
    }  
    
  public boolean equals8(Complex cc){
        DecimalFormat df = new DecimalFormat("#.########");  
        boolean result = false; 
        if (df.format(this.r).equals(df.format(cc.r)) && df.format(this.i).equals(df.format(cc.i))) result=true; 
        return result; 
    }
    
  public boolean notEquals(Complex cc){
       boolean result = false; 
       if (this.r != cc.r || this.i != cc.i) result = true; 
       return result;
    } 
    
  public double abs() { return Math.sqrt(this.r*this.r+this.i*this.i); }
  
  public Complex add(Complex cc){
      Complex result = new Complex();
      result.r = this.r + cc.r; 
      result.i = this.i + cc.i;
      return result; 
    }

  public Complex neg(){
      Complex result = new Complex(); 
      result.r = - this.r;
      result.i = - this.i; 
      return result; 
    }  
    
  public Complex minus(Complex cc){
      Complex result = new Complex();
      result.r = this.r - cc.r; 
      result.i = this.i - cc.i;
      return result; 
    }

  public Complex conjugate(){
      Complex result = new Complex(); 
      result.r = this.r; 
      result.i = - this.i; 
      return result; 
    }
    
  public Complex inverse(){
     Complex result = new Complex(); 
     result.r =  this.r / (this.r*this.r + this.i * this.i); 
     result.i = -this.i / (this.r*this.r + this.i * this.i); 
     return result; 
    }
    
  public Complex multiplyR(double rr){
      Complex result = new Complex(); 
      result.r  =  rr * this.r; 
      result.i  =  rr * this.i; 
      return result; 
    }
    
  public Complex multiplyI(double ii){
       Complex result = new Complex(); 
       result.r  = (-1) * this.i * ii; 
       result.i  = this.r * ii; 
       return result; 
    }
    
  public Complex multiply(Complex cc){
      Complex result = new Complex(); 
      result.r = this.r * cc.r - this.i * cc.i; 
      result.i = this.r * cc.i + this.i * cc.r; 
      return result; 
    }
    
  public Complex divideR(double rr){
      Complex result = new Complex(); 
      result.r = this.r / rr; 
      result.i = this.i / rr; 
      return result; 
    }
    
  public Complex divideI(double ii){
      Complex result = new Complex(); 
      result.r = this.i / ii; 
      result.i = (-1) * this.r / ii; 
      return result; 
    }
    
  public Complex divide(Complex cc){
      Complex result = this.multiply(cc.inverse());
      return result; 
    }
    
  public Complex pow(double exp){  // using Euler's Formula
       double rr = Math.pow((this.r * this.r + this.i * this.i) , 0.5);  // square root of r^2 + i^2 
       double theta = Math.acos(this.r / rr); 
       Complex result = new Complex(); 
       result.r = Math.pow(rr, exp) * Math.cos(theta * exp); 
       result.i = Math.pow(rr, exp) * Math.sin(theta * exp); 
       return result; 
    }
    
  public Complex rotate(double theta1) { // rotate in radians
       double rr = Math.pow((this.r * this.r + this.i * this.i) , 0.5);  // square root of r^2 + i^2 
       //double theta = Math.acos(this.r / rr);  // This version works only for 1st quadrant
       double theta = this.getTheta();           // Four quadrant version
       Complex result = new Complex(); 
       result.r = rr * Math.cos(theta + theta1); 
       result.i = rr * Math.sin(theta + theta1); 
       return result;   
    }
    
  public Complex rotateDegree(double degree){ // rotate in degrees
      double theta1 = Math.PI * degree / 180.0; 
      double rr = Math.pow((this.r * this.r + this.i * this.i) , 0.5);  // square root of r^2 + i^2 
      //double theta = Math.acos(this.r / rr);  // This version works only for 1st quadrant
      double theta = this.getTheta();           // Four quadrant version
      Complex result = new Complex(); 
      result.r = rr * Math.cos(theta + theta1); 
      result.i = rr * Math.sin(theta + theta1); 
      return result;       
    }
    
  // static methods ==========================================================================================================================
  public static String toString(Complex t){   // return a string body, not the pointer
      return "<"+t.r + "+"+ t.i + "i"+">"; 
    }
 
  public static String toString2(Complex t){   // return a string body, not the pointer
      return "<"+String.format("%4.2f", t.r) + "+"+ String.format("%4.2f", t.i) + "i"+">"; 
    }  
    
  public static String toString4(Complex t){   // return a string body, not the pointer
      return "<"+String.format("%6.4f", t.r) + "+"+ String.format("%6.4f", t.i) + "i"+">"; 
    } 
  
  public static boolean equals(Complex t, Complex cc){
       boolean result = false; 
       if (t.r == cc.r && t.i == cc.i) result = true; 
       return result;
    }   
    
  public static boolean equals4(Complex t, Complex cc){
        DecimalFormat df = new DecimalFormat("#.####");  
        boolean result = false; 
        if (df.format(t.r).equals(df.format(cc.r)) && df.format(t.i).equals(df.format(cc.i))) result=true; 
        return result; 
    }
    
  public static boolean equals8(Complex t, Complex cc){
        DecimalFormat df = new DecimalFormat("#.########");  
        boolean result = false; 
        if (df.format(t.r).equals(df.format(cc.r)) && df.format(t.i).equals(df.format(cc.i))) result=true; 
        return result; 
    }
    
  public static boolean notEquals(Complex t, Complex cc){
       boolean result = false; 
       if (t.r != cc.r || t.i != cc.i) result = true; 
       return result;
    }
    
  public static double abs(Complex t) { return Math.sqrt(t.r*t.r+t.i*t.i); }
    
  public static Complex add(Complex c1, Complex c2){ // static version
      Complex result = new Complex();
      result.r = c1.r + c2.r; 
      result.i = c1.i + c2.i;
      return result; 
    }
        
  public static Complex minus(Complex t, Complex cc){
      Complex result = new Complex();
      result.r = t.r - cc.r; 
      result.i = t.i - cc.i;
      return result; 
    }
    
  public static Complex neg(Complex t){
      Complex result = new Complex(); 
      result.r = - t.r;
      result.i = - t.i; 
      return result; 
    }
        
  public static Complex conjugate(Complex t){
      Complex result = new Complex(); 
      result.r = t.r; 
      result.i = - t.i; 
      return result; 
    }    
      
  public static Complex inverse(Complex t){
     Complex result = new Complex(); 
     result.r =  t.r / (t.r*t.r + t.i * t.i); 
     result.i = -t.i / (t.r*t.r + t.i * t.i); 
     return result; 
    }
    
  public static Complex multiplyR(Complex t, double rr){
      Complex result = new Complex(); 
      result.r  =  rr * t.r; 
      result.i  =  rr * t.i; 
      return result; 
    }
        
  public static Complex multiplyI(Complex t, double ii){
       Complex result = new Complex(); 
       result.r  = (-1) * t.i * ii; 
       result.i  = t.r * ii; 
       return result; 
    }   
     
  public static Complex multiply(Complex t, Complex cc){
      Complex result = new Complex(); 
      result.r = t.r * cc.r - t.i * cc.i; 
      result.i = t.r * cc.i + t.i * cc.r; 
      return result; 
    }
    
  public static Complex divideR(Complex t, double rr){
      Complex result = new Complex(); 
      result.r = t.r / rr; 
      result.i = t.i / rr; 
      return result; 
    }
    
  public static Complex divideI(Complex t, double ii){
      Complex result = new Complex(); 
      result.r = t.i / ii; 
      result.i = (-1) * t.r / ii; 
      return result; 
    }
    
  public static Complex divide(Complex t, Complex cc){
      Complex result = Complex.multiply(t, cc.inverse());
      return result; 
    }
    
  public static Complex pow(Complex t, double exp){  // using Euler's Formula
       double rr = Math.pow((t.r * t.r + t.i * t.i) , 0.5);  // square root of r^2 + i^2 
       double theta = Math.acos(t.r / rr); 
       Complex result = new Complex(); 
       result.r = Math.pow(rr, exp) * Math.cos(theta * exp); 
       result.i = Math.pow(rr, exp) * Math.sin(theta * exp); 
       return result; 
    }
   
  public static Complex rotate(Complex t, double theta1) { // rotate in radians
       double rr = Math.pow((t.r * t.r + t.i * t.i) , 0.5);  // square root of r^2 + i^2 
       //double theta = Math.acos(this.r / rr);  // This version works only for 1st quadrant
       double theta = t.getTheta();           // Four quadrant version
       Complex result = new Complex(); 
       result.r = rr * Math.cos(theta + theta1); 
       result.i = rr * Math.sin(theta + theta1); 
       return result;   
    }
       
  public static Complex rotateDegree(Complex t, double degree){ // rotate in degrees
      double theta1 = Math.PI * degree / 180.0; 
      double rr = Math.pow((t.r * t.r + t.i * t.i) , 0.5);  // square root of r^2 + i^2 
      //double theta = Math.acos(this.r / rr);  // This version works only for 1st quadrant
      double theta = t.getTheta();           // Four quadrant version
      Complex result = new Complex(); 
      result.r = rr * Math.cos(theta + theta1); 
      result.i = rr * Math.sin(theta + theta1); 
      return result;       
    }
}
