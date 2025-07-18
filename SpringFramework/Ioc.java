package SpringFramework;

public class Ioc {
    public static void main(String[] args) {
        /*
         * Inversion of Control (IoC) is a design principle used in object-oriented 
         * programming where the control of object creation and dependency management
         *  is transferred from the application code to an external framework or container.
          
         Two types of IoC Containers:
         1. BeanFactory:
            -> The simplest container that provides basic support for DI.
            It is a basic container that initializes beans lazily (i.e., only when they
             are needed). It is typically used for lightweight applications where
              the overhead of ApplicationContext is not required.

              <bean id="car" class="com.example.Car"/>


         2. ApplicationContext:
            -> A more advanced container that provides additional features like event 
            propagation, declarative mechanisms to create a bean, and support for 
            internationalization.

            <context:component-scan base-package="com.example"/>
         
            
         */
    }
    
}
