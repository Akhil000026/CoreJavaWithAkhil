package JavaIntroduction;
// Compare this snippet from JavaIntroduction/Operator.java:
class Person {
}

class Boy extends Person implements MyInterface {
}

interface MyInterface {
}

public class Operator {
    public static void main(String[] args) {
        Person obj1 = new Person();
        // Person obj2 = new Boy();

        // As obj is of type person, it is not an
        // instance of Boy or interface
        System.out.println("obj1 instanceof Person: "
                           + (obj1 instanceof Person));
        
    }
    
}
