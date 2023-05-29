package FileI;
import java.io.*;
import java.util.Scanner;


public class O {
 public static void main (String[] args)throws Exception{
    File iFile = new File("usdeclaration.txt");
    File oFile = new File ("USDECLARATION!.txt");
    Scanner input = new Scanner (iFile);
    PrintWriter out = new PrintWriter(oFile);
    String token = " ";

    while (input.hasNext()){
        token = input.nextLine();
        System.out.println(token.toUpperCase());
        out.println(token.toUpperCase());
    }
    System.out.println();
    input.close();
    out.close();
 }   
}
