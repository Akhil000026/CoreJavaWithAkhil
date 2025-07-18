 
public class Recordss {
    public static void main(String[] args) {
        
        Person p = new Person("Akhil", 21);
        System.out.println(p.name());  // Akhil
        System.out.println(p.age());   // 21
        System.out.println(p);    
             // Person[name=Akhil, age=21}
       
        /*
         * Records in Java are a special kind of class introduced in Java 14 (preview) and standardized in Java 16, meant to model immutable data objects — like a simple DTO (Data Transfer Object), POJO, or struct.
         *
         * They automatically generate:
         *
         * Constructor
         *
         * Getters
         *
         * equals()
         *
         * hashCode()

toString()


         */
    }
    
}
 record Person(String name, int age) {}
