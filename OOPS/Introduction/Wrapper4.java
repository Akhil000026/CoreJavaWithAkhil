package OOPS.Introduction;

public class Wrapper4 {
    public static void main(String[] args) {
        // SWAPPING TWO NUMBERS
        // Using a custom wrapper class to allow swapping

        IntWrapper x = new IntWrapper(5);
        IntWrapper y = new IntWrapper(10);

        System.out.println("Before swap: x = " + x.value + ", y = " + y.value);
        swap(x, y);
        System.out.println("After swap: x = " + x.value + ", y = " + y.value);
    }

    static class IntWrapper {
        int value;
        IntWrapper(int value) {
             this.value = value; 
             }
    }

    // Fix: Move swap method inside Wrapper4
    static void swap(IntWrapper a, IntWrapper b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}
