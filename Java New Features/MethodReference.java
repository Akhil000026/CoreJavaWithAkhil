import java.util.function.Consumer;

class Utils {
    public static void showMessage(String message) {
        System.out.println("Message: " + message);
    }
}
public class MethodReference {

    public static void main(String[] args) {
        /*

        A method reference is the shorthand syntax for a lambda expression
        that contains just one method call. 

        Types of Method References

There are four type method references that are as follows:

1.Static Method Reference
Syntax = ClassName::staticMethodName

2.Instance Method Reference of a particular object
Syntax = object::instanceMethodName

3.Instance Method Reference of an arbitrary object of a particular type
Syntax = ClassName::instanceMethodName


4.Constructor Reference
Syntax = ClassName::new


        (1)   1. Static Method Reference  
         SYNTAX =  ClassName::staticMethodName


         */
        // Lambda: (msg) -> Utils.showMessage(msg)
        Consumer<String> c = Utils::showMessage; // Method reference

        c.accept("Hello from static method!");
        
    }
    
}
