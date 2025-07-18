package Streams;

import java.io.FileWriter;
import java.io.IOException;

public class StreamCha {
    public static void main(String[] args) {
          try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello, world!");
            fw.close();
            System.out.println("Text written.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
}
