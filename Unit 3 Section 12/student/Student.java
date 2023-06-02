package student;

import java.util.ArrayList; 
/**
 * Write a description of class Student here.
 * 
 * @author (Eric Y. Chou) 
 * @version (12/23/2015)
 */
public class Student
{
    final static char A = 'A'; 
    final static char B = 'B';
    final static char C = 'C'; 
    final static char D = 'D';
    final static char E = 'E'; 
    final static char F = 'F'; 
    final static char N = 'N'; 
    final static char S = ' ';
    
    private String name; 
    private String id; 
    private String address; 
    private String birthday; 
    private double gpa; 
    
    private ArrayList<Subject> slist = new ArrayList<Subject>(); 
   
    public Student(String name, String id, String address, String birthday, String[] courses){
      this.name     = name; 
      this.id       = id; 
      this.address  = address; 
      this.birthday = birthday; 
      
      for (int i=0; i<courses.length; i++){
           Subject a = new Subject(courses[i]); 
           slist.add(a); 
        }
    }
    
    public ArrayList<Subject> getSubjectList(){
       return slist; 
    }
    
    public String toString(){
     String str = "ID: "+ id+ "    Name: "+String.format("%-20s", name); 
     for (Subject s: slist) str += " "+String.format("%8s", s.getCourse())+": "+ String.format("%3d", s.getScore())+" "+s.getGrade();
     return str; 
    }
    
    public String getID(){
       return id; 
    }
    
    public static int getScale(int score){
      int scale = 0; 
        if (score>=90 && score<=100){scale=4;}
        else if (score>=80 && score<=100)  {scale=3;}
        else if (score>=70 && score<=100)  {scale=2;}
        else if (score>=60 && score<=100)  {scale=1;}
        else if (score<60 && score>= 0){scale=0;}
        else { scale=0;}    
      return scale; 
    }
    
    public static char getGrade(int score){
      char grade = S; 
        if (score>=90 && score<=100){grade = A;}
        else if (score>=80 && score<=100)  {grade = B;}
        else if (score>=70 && score<=100)  {grade = C;}
        else if (score>=60 && score<=100)  {grade = D;}
        else if (score<60 && score>= 0){grade = F;}
        else { grade = N;}
      return grade; 
    }
    
    public double getGPA(){
        gpa = 0.0; 
        for (Subject s: slist) gpa += getScale(s.getScore());
        gpa /= slist.size(); 
      return gpa; 
    }
    
    public void toScreen(){
        System.out.println("\n\n\nStudent Record: ");
        System.out.println("  Name: "+name);
        System.out.println("  ID: "+id);
        System.out.println("  Birthday: "+birthday); 
        System.out.println("  Address: "+address); 
        for (Subject s: slist) System.out.print("  "+s.getCourse()+": "+ s.getScore()+" ");
        System.out.println(); 
        System.out.println("  GPA: "+getGPA());
        System.out.println("\n\n\n\n\n"); 
    }
}
