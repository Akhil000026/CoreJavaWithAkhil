public sealed class Shape permits Circle, Rectangle, Square {}

final class Circle extends Shape {}
final class Rectangle extends Shape {}
final class Square extends Shape {}

public class Sealed {
    public static void main(String[] args) {
        /*
         * Sealed classes restrict which classes can extend or implement 
         * them. Helps enforce strict inheritance control.
         * 
         Use to limit the number of classses that can inherit it
         
         */
    }
    
}
