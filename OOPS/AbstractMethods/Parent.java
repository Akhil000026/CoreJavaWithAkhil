package OOPS.AbstractMethods;

public abstract class Parent {

    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 32456789;
    }

    static void hello(){
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is a normal method");
    }
    //   Creating abstract class 
    abstract void career();
    abstract void partner();
}
    

