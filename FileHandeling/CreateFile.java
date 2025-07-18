package FileHandeling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
         try {
            File f = new File("test.txt");
            if (f.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
    
}
