package FileHandeling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    // Use FileWriter (text) or FileOutputStream (binary).
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello, world!\nThis is Java file writing.");
            fw.close();
            System.out.println("Written to file.");
        } 
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
}
