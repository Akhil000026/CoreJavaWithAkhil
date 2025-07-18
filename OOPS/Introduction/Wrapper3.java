package OOPS.Introduction;

public class Wrapper3 {
    public static void main(String argu[]){
        int a=10;
        Integer nums=a; // // Autoboxing (int → Integer)

        System.out.println(nums);
        Integer num2=20;
        int b=num2; // Unboxing (Integer → int)
        System.out.println(b);
        // Autoboxing and Unboxing are the process of converting between primitive types and their corresponding wrapper classes.

    }
    
}
