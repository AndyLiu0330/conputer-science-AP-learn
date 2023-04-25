public class SubString {
    public static void main(String[] args){
        String a = "Welcome to java";
        String b = a.substring(11);
        String c = a.substring(0, 11);
        System.out.println(b);
        System.out.println(c);
        int d = a.indexOf("W");
        // to check if there is a char
        System.out.println(d);
        int e = a.lastIndexOf("java");
        System.out.println(e);
        String f = a.replace(  "Welcome to java", "If you are new please make a new account");
        System.out.println(f);
        String[] tokens = "Java;Html;Perl".split(";", 0);
        for (int i = 0; i < tokens.length; i ++){
            System.out.print(tokens[i] + " ");
        }
    }

}