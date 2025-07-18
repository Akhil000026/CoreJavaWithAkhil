package OOPS.Lec4;

public class A {
    protected int num;
    String name;
    int[] arr;

    // Creating Getter and Setter
    // Getter and Setter are used to access the private data members of a class
    // num is private, so we need to create a getter and setter for it

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
    
}
