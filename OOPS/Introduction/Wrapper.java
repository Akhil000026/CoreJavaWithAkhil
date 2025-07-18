package OOPS.Introduction;

public class Wrapper {
    public static void main(String[] args) {
        // primitive data types
        int rollno = 5;
        char grade = 'A';
        float marks = 67.67f;
        double price = 45.56;


        int a=10;
        Integer nums=10; // Wrapper class
        // Integer class is final class  so we can't inherit it
        //  now  nums is an object of Integer class
        System.out.println(nums);
        // Using primitives as an object

        final int x = 10;
        // x=20;  error
        // always initalise while declaring
        // final keyword is only for primitive data types

        // GARBAGE COLLECTOR
        // Can't destroy object manually
        // Java has a garbage collector that destroys objects
        // tell java what to do after destroying the object
        

        A obj;
        for(int i=0;i<1000000;i++){

            // When less object it will not delete the object
            // When more object it will delete the object
            obj=new A("Akhil");
        }

        
    
    }  
}
class A{
    final int nums=10;
    String name;
    public A(String name){
        this.name=name;
    }
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        // super.finalize();

        System.out.println("Object is destroyed");
    }
    
}
