package MultiThreading;

public class MyRunnable implements Runnable {
    // OVERRIDING run() method
    public void run() {
        System.out.println("Runnable thread is running");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start(); // start() method calls run() method internally
    }
    
}
