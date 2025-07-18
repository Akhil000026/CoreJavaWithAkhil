package JavaIntroduction;

public class Datatype {
    public static void main(String[] args) {
        /*
         * (1) byte: 1 Byte = 8 bits, range: -128 to 127 :-2^7 to 2^7-1
         * (2) short:char: 2 Bytes = 16 bits, range: -32,768 to 32,767 :-2^15 to 2^15-1
         * (3) int:float: 4 Bytes = 32 bits, range: -2,147,483,648 to 2,147,483,647 :-2^31 to 2^31-1
         * (4) long:double: 8 Bytes = 64 bits, range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         * (5) boolean: 1 Byte = 8 bits, range: true or false
         * 
         * 
         */
        byte b = 10; // 1 Byte = 8 bits, range: -128 to 127
        short s = 20; // 2 Bytes = 16 bits, range: -32,768 to 32,767
        char c = 'A'; // 2 Bytes = 16 bits, range: 0 to 65,535
        int i = 30; // 4 Bytes = 32 bits, range: -2,147,483,648 to 2,147,483,647
        float f = 40.0f; // 4 Bytes = 32 bits, range: -3.40282347E+38 to 3.40282347E+38
        double d = 50.0; // 8 Bytes = 64 bits, range: -1.79769313486231570E+308 to 1.79769313486231570E+308
        long l = 60L; // 8 Bytes = 64 bits, range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        boolean bool = true; // 1 Byte = 8 bits, range: true or false
        String str = "Hello"; // 2 Bytes = 16 bits, range: 0 to 65,535
        // String str = "Hello"; // 2 Bytes = 16 bits, range: 0 to 65,535

        

        
    }    
    
}
