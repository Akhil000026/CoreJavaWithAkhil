package MultiThreading;

public class MyThread1 extends Thread {
    // OVERRIDING run() method
    public void run() {
        System.out.println("MyThread1 is running");
    }

    public static void main(String[] args) {
        MyThread1 t1= new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        t1.start(); // start() method calls run() method internally
        t2.start();
        t3.start();
        System.out.println(t1.getPriority());
        t1.setPriority(8);
        System.out.println(t1.getPriority());
        
    }
    static class MyThread2 extends Thread {
        // OVERRIDING run() method
        public void run() {
            System.out.println("MyThread2 is running");
        }
    }
    static class MyThread3 extends Thread {
        // OVERRIDING run() method
        public void run() {
            System.out.println("MyThread3 is running");
        }
    }
}
