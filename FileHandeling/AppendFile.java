package FileHandeling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
           try {
            FileWriter fw = new FileWriter("test.txt", true); // true = append
            fw.write("\nAdding new line.");
            fw.close();
            System.out.println("Appended to file.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        
    }
    
}
