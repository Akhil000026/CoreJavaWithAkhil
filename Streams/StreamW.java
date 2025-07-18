package Streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class StreamW {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("data.bin");
            fos.write(65); // Writes byte for 'A'
            fos.close();
            System.out.println("Data written.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
}
