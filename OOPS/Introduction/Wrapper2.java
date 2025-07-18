package OOPS.Introduction;

public class Wrapper2 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a+" "+b);
        // Everything is pass by value not reference
        
        
    }
    static void swap(int a,int b){
        int temp=a;
        a = b;
        b = temp;
    }
    Integer nums=10;
    final int INCREASE=2;
    // INCREASE can't be modified
    INCREASE=3; //Can't modifie
    
}
