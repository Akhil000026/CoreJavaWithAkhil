 import java.util.*;
public class ThrowableDemo {
    
    public static void main(String[] args) {
        try {
            // Simulating an exception
            int result = 10 / 0; // This will cause ArithmeticException
        }
        catch (Exception e) {
            // Catching the Exception
            System.out.println("Caught Exception: " + e.getMessage());
            e.printStackTrace(); // Prints the stack trace of the exception
        }
    }
    
}
