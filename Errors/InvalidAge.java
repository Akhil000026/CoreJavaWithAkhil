public class InvalidAge extends Exception {
    // User Define Exception
    // extending Exception class
    public InvalidAge(String message) {
        super(message);
    }
    public static void main(String[] args) {
        try {
            checkAge(15); // This will throw InvalidAge exception
        } catch (InvalidAge e) {
            System.out.println("Caught InvalidAge Exception: " + e.getMessage());
        }
        
    }
    public static void checkAge(int age) throws InvalidAge {
        if (age < 18) {
            throw new InvalidAge("You are not allowed to vote.");
        } else {
            System.out.println("You can vote!");
        }
    }
    
}
