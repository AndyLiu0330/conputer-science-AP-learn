public class Person {

    private String name;
    private int age;
    public Person (String aName, int anAge){
        this.name = aName;
        this.age = anAge;

    }  
    public String toString(){
        return name + " " + age;
    }
    public void printPerson(){
        System.out.println(this);
    }

    
        
    //Other varriables and methods are no t shown


}
