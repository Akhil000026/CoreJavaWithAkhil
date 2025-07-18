package SpringFramework;

import SpringFramework.DependencyInjection.Engine;

public class DependencyInjection {
    public static void main(String[] args) {

        // SPRING FRAMEWORK 
        /*

        The Spring Framework is a powerful, lightweight, and widely used Java framework
        for building enterprise applications. 

        Before Enterprise Java Beans (EJB), JavaBeans were used for developing Web applications,
        but they lacked essential services like transaction management and security.

        Spring Framework emerged as a solution to these complications. It simplifies enterprise
        application development by using techniques like (1)Aspect-Oriented Programming (AOP),
        (2)Plain Old Java Objects (POJO), and (3)Dependency Injection (DI).

        Core Concepts of Spring Framework:

        1.Dependency Injection (DI):
        -> Dependency Injection is a design pattern used in software development to
        implement Inversion of Control(IoC). 
        -> It allows a class to receive its dependencies from an external source rather than
        creating them within the class.
        This reduces the dependency between classes and makes the system more maintainable.
         
        Dependency Injection is a design pattern where an object’s dependencies 
        (other objects it needs to work) are provided from the outside, rather than the object
        creating them itself.

        Types of Dependency Injection-
        (1) Constructor Injection
        (2) Setter Injection
        (3) Field Injection
        -> Constructor Injection: Dependencies are provided through the class constructor
        -> Setter Injection: Dependencies are provided through setter methods
        -> Field Injection: Dependencies are injected directly into the fields

         */

        
    }
    class Engine {
    public void start() {
        System.out.println("Engine started");
       } 
    }
    class CarWithoutDI {

        // Without DI (Tight Coupling)
    private Engine engine = new Engine();  // Car creates Engine

    public void drive() {
        engine.start();
        System.out.println("Car is moving");
      }
    }

    class CarWithDI {
        // With Dependency Injection (Loose Coupling)
        private Engine engine;  // Engine is injected

        public CarWithDI(Engine engine) {
            this.engine = engine;
        }

        public void drive() {
            engine.start();
            System.out.println("Car is moving with DI");
        }
        // Now Car doesn't create the Engine. Instead, someone injects it.
    }


    
//     @Component
//     class Engine {
//     public void start() {
//         System.out.println("Engine started");
//      }
//   }

//     @Component
//     class Car {
//     private Engine engine;

//     @Autowired
//     public Car(Engine engine) {
//         this.engine = engine;
//     }

//     public void drive() {
//         engine.start();
//         System.out.println("Car is moving");
//     }
// }




    
}
