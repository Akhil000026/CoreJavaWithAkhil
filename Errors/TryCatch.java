public class TryCatch {
    public static void main(String[] args) {
        /*
         * The try block wraps code that might cause an exception. It tells Java:
              “Hey, I know this code could go wrong. Watch it closely.”

              The catch block handles the specific exception thrown in the try block.

You can have multiple catch blocks for different exception types.

The first matching catch block runs.
The catch block handles the specific exception thrown in the try block.

You can have multiple catch blocks for different exception types.

The first matching catch block runs.

         */
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // Out of bounds
            
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array indexx out of range!");
        }
        catch (Exception e) {
            System.out.println("Some error occurred: " + e.getMessage());

        }
        finally {
            System.out.println("This will always execute.");
        }

        // FINALLY can  be used withou catch block

    }  
    
}
