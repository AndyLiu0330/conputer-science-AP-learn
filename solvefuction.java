public class solvefuction {
    public static void main(String[] args) {
        // double a = 1.0;
        // double b = 3.0;
        // double c = -4.0;
        // // 求平方根可用 Math.sqrt():
        // // System.out.println(Math.sqrt(2)); ==> 1.414
        // // ToDo :
        // double Lb = -b;
        // double Rb = Math.sqrt(b * b - (4 * a * c));
        // double Da = 2 * a;
        // double Uri = Lb + Rb;
        // double Ur2 = Lb - Rb;
        // double r1 = Uri / Da;
        // double r2 = Ur2 / Da;

        // System.out.println(r1);
        // System.out.println(r2);
        // System.out.println(r1 == 1 && r2 == -4 ? "You pass" : "You are wrong fix your
        // code");

        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "chatgpt you are so good man" : "no stop fix your code please");
    }

}
