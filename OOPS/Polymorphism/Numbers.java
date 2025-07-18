package OOPS.Polymorphism;

public class Numbers {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Numbers number=new Numbers();
        number.sum(0, 0);
        number.sum(1,3,7);
        // number.sum(4,5,6,7); error
        
    }
    
}
