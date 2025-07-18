public class YieldExample {
    public static void main(String[] args) {
        int score = 87;
        
        // Storing the switch expression result in a variable
        // Can't store in switch statement directly
        // because switch statement doesn't return a value
        String grade = switch (score / 10) {
            case 10, 9 -> "A";
            case 8 -> {
                System.out.println("Good job!");
                yield "B";
            }
            case 7 -> {
                System.out.println("Fair performance");
                yield "C";
            }
            default -> "F";
        };

        System.out.println("Grade: " + grade);
    }
}
