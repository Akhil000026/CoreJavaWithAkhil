public class FunctionalInterface {
     /*
  * A Functional Interface is an interface that has exactly one abstract method.
    Purpose: To support lambda expressions and functional programming.
    Can have multiple default or static methods.

    Also konown as  SAM(Single Abstract Method) interfaces.

    Note: @FunctionalInterface annotation is optional but it is a good practice to use. 
    It helps catching the error in early stage by making sure that the interface has only one abstract method.
  */

// @FunctionalInterface
// interface MyFunction {
//     void execute();
// }
// Define a functional interface

interface Square {
    int calculate(int x);
}

class Geeks {
    public static void main(String args[]) {
        int a = 5;

        // lambda expression to 
        // define the calculate method
        Square s = (int x) -> x * x;

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}

}
