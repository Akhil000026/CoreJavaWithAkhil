package OOPS.Static;

public class StaticMethod {
    // Static Method can be caled without creating an object of the class
   public static void main(String[] args) {
     System.out.println(Calculator.square(5));
    
   }
    
}
class Calculator{
    static int square(int x) {
        return x * x;
    }
}
 
