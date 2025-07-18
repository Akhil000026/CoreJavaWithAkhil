import java.util.Scanner;   

public class ExceptionHandeling {
    public static void main(String[] args) {
        try {
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter Numerator: ");
            int n=scn.nextInt();
            System.out.println("Enter Denominator: ");
            int d=scn.nextInt();
            int ans=n/d;
            System.out.println("Answer is: "+ans);

            
        }
        catch (ArithmeticException e) {
            System.out.println("Denominator cannot be zero");
        }
         catch (Exception e) {
            System.out.println("Something went wrong: "+e.getMessage());
        }
        finally {
            System.out.println("This will always execute");
        }
        
    }
    
}
