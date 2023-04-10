import java.util.Scanner;

public class Changedegrees {
    public static void main(String[] args) {
        Scanner CF = new Scanner(System.in);
        System.out.println("[0] Fahreheit to Calsius [1] Calsius to Fahrenheit Type 0 or 1:");
        int a = CF.nextInt();

        if (a == 1) {
            FahrenheitToCalsius FTC = new FahrenheitToCalsius();
            FTC.FtoC();
        } else {
            CalsiusToFahreheit CTF = new CalsiusToFahreheit();
            CTF.CtoF();

        }

        CF.close();
    }

}