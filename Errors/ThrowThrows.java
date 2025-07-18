public class ThrowThrows {
    public static void main(String[] args) {

        // CREATE AND THROW MANUAL EXCEPTION
        
        int age = 15;
        if (age < 18) {
            throw new ArithmeticException("You are not allowed to vote.");
        }
        System.out.println("You can vote!");

    }

    }
    

