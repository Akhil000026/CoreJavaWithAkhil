interface TestInterface
{
    // abstract method
    public void square(int a);

    // default method
    default void show()
    {
      System.out.println("Default Method Executed");
    }
    // static method
    static void show1()
    {
        System.out.println("Static Method Executed");
    }
}




// DEFAULT METHOD AND MULTIPLE INHERITANCE 
interface TestInterface1
{
    // default method
    default void show2()
    {
        System.out.println("Default TestInterface1");
    }
}

interface TestInterface2
{
    // Default method
    default void show2()
    {
        System.out.println("Default TestInterface2");
    }
}




public class DefaultAndStatic implements TestInterface ,TestInterface1,TestInterface2{
    // Defining abstract method in class 
     public void square(int a)
    {
        System.out.println(a*a);
    }

    public void show2()
    {
        // use super keyword to call the show
        // method of TestInterface1 interface
        TestInterface1.super.show2();

        // use super keyword to call the show
        // method of TestInterface2 interface
        TestInterface2.super.show2();
    }
    public static void main(String[] args) {
        /*
         DEFAULT METHOD OR DEFENDER METHOD

          Before Java 8, interfaces could only have abstract methods.
          In java 8 => Interface can have a default method
          default method => which allow the interfaces to have methods with 
          implementation without affecting the classes that implement the interface.
          
         */
        DefaultAndStatic d = new DefaultAndStatic();
        d.square(4);

        // default method executed
        d.show();

        /*
         
        Static Methods:
        The interfaces can have static methods as well which is similar 
        to static method of classes.
         */
        // static method execution
        TestInterface.show1();
        /*
         Static methods in interfaces are not inherited by implementing classes.
         They must be called using the interface name, like TestInterface.show().
         */
        



         
        //  DEFAULT AND MULTIPLE INHERITANCE
        d.show();

    }
    
     
    
}
