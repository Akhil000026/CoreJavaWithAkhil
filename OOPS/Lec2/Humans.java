package OOPS.Lec2;

public class Humans {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Humans(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Humans.population+=1; 
    }
    
}
