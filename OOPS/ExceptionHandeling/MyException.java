package OOPS.ExceptionHandeling;

public class MyException extends Exception{
    // extending main exception class 

    public MyException(String message) {
        super(message);
    }
}