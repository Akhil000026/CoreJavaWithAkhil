
public class Throws {

    //throws keyword-> Can throw exception this type -> using throws keyword
    // throws keyword -> explicitly throw exception

    public static void main(String[] args) {
        int a=10;
         try {
            divide(a);
             
         } 
         catch (ArithmeticException e) {
             System.out.println("Caught ArithmeticException: " + e.getMessage());
         }
    }
    
    static int divide(int a) throws ArithmeticException{
        return a/0; // This will throw ArithmeticException
    }
}
