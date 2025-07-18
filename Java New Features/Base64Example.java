import java.util.Base64;
public class Base64Example {
    /*

     Base64 encoding allows encoding binary data as text strings 

    //  Used in email, URLs, and data storage

    
     for safe transport, at the cost of larger data size.

     like transporting images inside an XML, JSON document

     Base64 uses 64 characters:
     A-Z, a-z, 0-9, +, /

     SYNTAX:
     String Base64format =
     Base64.getEncoder().encodeToString("String".getBytes());

     | Function                 | Description                         |
| ------------------------ | ----------------------------------- |
| `getEncoder()`           | Basic Base64 encoder                |
| `getDecoder()`           | Basic Base64 decoder                |
| `getUrlEncoder()`        | URL-safe Base64 encoder (`+` → `-`) |
| `getUrlDecoder()`        | URL-safe Base64 decoder             |
| `getMimeEncoder()`       | MIME encoder for email-style output |
| `getMimeDecoder()`       | MIME decoder                        |
| `encode(byte[])`         | Encodes byte\[] to byte\[] (Base64) |
| `encodeToString(byte[])` | Encodes byte\[] to Base64 string    |
| `decode(String)`         | Decodes Base64 string to byte\[]    |


     */
    public static void main(String[] args) {
        String original = "Akhilesh123";

        // Encode
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println("Encoded: " + encoded);

        // Decode
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        System.out.println("Decoded: " + decoded);
        
    }
    
}
