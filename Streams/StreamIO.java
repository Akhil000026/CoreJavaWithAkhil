package Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class StreamIO {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("stream.txt");
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char)b);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
}
