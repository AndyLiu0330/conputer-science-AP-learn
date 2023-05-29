import java.util.Scanner;
public class StudentInfo {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter name: ");
    String name = input.nextLine();
    System.out.println("Enter Math Score:");
    int mathscore = Integer.parseInt(input.nextLine());
    System.out.println("Enter English Score: ");
    int engscore = Integer.parseInt(input.nextLine());
    //String aa = input.nextLine();
    System.out.print("Enter Address:");
    String address = input.nextLine();
    System.out.print("Enter Physics Score:");
    int physcore = input.nextInt();
    System.out.print("Enter Chemistry Score:");
    int chemscore   = input.nextInt();

    System.out.println("Name:" + name );
    System.out.println("Math:" + mathscore);
    System.out.println("Eng:" + engscore);
    System.out.println("Address:" + address);
    System.out.println("Phy: " + physcore);
    System.out.println("Chem: " + chemscore);
    input.close();
   } 
}
