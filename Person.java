public class Person {

    private String name;
    private int age;
    public void Person (String aName, int anAge){
        name = aName;
        age = anAge;

    }  
    public String toString(){
        return name + " " + age;
    }
    public void printPerson(){
        System.out.println(this);
    }
    public void ForLoop(){
        
        for (int i = 1; i <= 6 ; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print("+");
            }
            for(int j = 1 ; j <= 6 - i; j++){
                System.out.print("*");
            }
            for(int n = 7; n<=7 +  i ; n++){
                System.out.print("!");
            }

            for(int n = 7; n<= 13 - i  ; n++){
                System.out.print("$");
            }
            System.out.println();
        }

    }
    
        
    //Other varriables and methods are no t shown


}
