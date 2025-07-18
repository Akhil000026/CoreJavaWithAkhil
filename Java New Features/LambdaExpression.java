import java.lang.FunctionalInterface;
import java.util.ArrayList;

// Creating a FI for zero parameter
@FunctionalInterface
interface ZeroParameter {
    void display();
}

// Creating FI to implement single parameter
@FunctionalInterface
interface OneParameter {
    void greet(String name);
}

@FunctionalInterface
interface TwoParameter{
    void add(int a,int b);
}


public class LambdaExpression {
    public static void main(String[] args) {
        /*
         
           Lambda Expressions were added in Java 8 or Java SE 8.

           A lambda expression is a short block of code which takes in parameters and returns a value.
           Lambda expressions are similar to methods, but they do not need a name and they can be implemented 
           right in the body of a method.

           SYNTAX: parameter -> expression
                   (parameter1, parameter2) -> expression
                   (parameter1, parameter2) -> { code block }

                   (argument list) -> { body of the expression }   //GFG

            
           Key Points:
           1.Lambda Expressions implement the only abstract function and therefore implement functional interfaces
           2.Class Independence: Create functions without defining a class.
           3.Pass and Execute: Pass lambda expressions as objects and execute on demand.
           
           Expressions are limited. They have to immediately return a value, and they cannot contain variables,
           assignments or statements such as if or for. In order to do more complex operations, a code block 
           can be used with curly braces. If the lambda expression needs to return a value, then the code block
           should have a return statement.

           EXAMPLE: Use a lambda expression in the ArrayList's forEach() method to print every item in the list:
 
                                         Types of Lambda Parameters

             1.Lambda with Zero Parameter
             Syntax: () -> System.out.println("Zero parameter lambda");
             2.Lambda with Single Parameter
             Syntax:(p) -> System.out.println("One parameter: " + p);
             3.Lambda with Multiple Parameters
             Syntax:(p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);                                    

         */
         ArrayList<Integer> numbers = new ArrayList<Integer>();
         numbers.add(5);
         numbers.add(9);
         numbers.add(8);
         numbers.add(1);
         numbers.forEach( (n) -> { System.out.println(n); } );
         /*
          The functional interface is Consumer<T>, from java.util.function.
           forEach() method internally calling: default void forEach(Consumer<? super T> action)
            java.util.function.Consumer.
          */
         
        //  (1)ZERO PARAMETER EXAMPLE

                   
        ZeroParameter zeroParamLambda = ()
            -> System.out.println(
                "This is a zero-parameter lambda expression!");

        // Invoke the method
        zeroParamLambda.display();
        // OP:This is a zero-parameter lambda expression!



        // (2)SINGLE PARAMETER
        OneParameter oneParamLambda = (name) ->
            System.out.println("Hello, " + name + "!");

        // Invoke the method
        oneParamLambda.greet("Akhilesh");
        oneParamLambda.greet("Akhil");


        // (3)Lambda Expression for 2 parameter
        TwoParameter twoParameter=(a,b)-> System.out.println("Sum is: " + (a + b));

        // Invoke the method
        twoParameter.add(5,7);
        twoParameter.add(10,20);


        // #Internal working of forEach() Method as FunctionalInterface
        /*
          // Java program to demonstrate Lambda with one parameter using Consumer-like interface

           import java.util.ArrayList;

           // Step 1: Define Functional Interface
          @FunctionalInterface
          interface MyConsumer<T> {
          void accept(T t);
           }

    public class Demo {
    public static void main(String[] args) {
        // Step 2: Create ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // Step 3: Define lambda (treated as MyConsumer<Integer>)
        MyConsumer<Integer> myLambda = (n) -> System.out.println(n);

        // Step 4: Simulate forEach (internally how Java does it)
        for (Integer num : numbers) {
            myLambda.accept(num); // Pass each element to the lambda
            }
          }
        }
         */


    }
    
}
