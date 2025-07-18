package OOPS.Static;

public class StaticVariable {
    // Static variable is shared among all instances of a class
    // Only ONE-COPY of static variable exists in memory
    static int count = 0;
    static class counter {
        counter() {
            count++;
            System.out.println("Object created. Current count: " + count);
        }
    }

    public static void main(String[] args) {
        counter count1 = new counter();
        counter count2 = new counter();
        counter count3 = new counter();
        // Use count3 to avoid unused variable warning
        System.out.println("Final count: " + count);
    }
}
