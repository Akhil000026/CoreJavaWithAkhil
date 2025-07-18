package MultiThreading;


public class MyThread extends Thread{
    // OVERRIDING run() method
    
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        t1.start(); // start() method calls run() method internally

        
    }
    
}
