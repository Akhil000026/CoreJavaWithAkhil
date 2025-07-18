 
public class a {
    public static void main(String[] args) {
        String name = "Akhilesh";
        String greeting = switch (name) {
            case "Akhilesh" -> "Hello, Akhilesh!";
            case "John" -> "Hello, John!";
            case "Jane" -> "Hello, Jane!";
            default -> "Hello, Guest!";
        };
        System.out.println(greeting);
    }
    
}
