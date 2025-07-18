public class TextBlock {
     public static void main(String[] args) {
        /*
         * **Text Blocks in Java**
         * 
         * Text blocks are a new feature introduced in Java 13 (as a preview) and made
         * standard in Java 15. They allow multi-line string literals, making it easier
         * to write and read large blocks of text, such as JSON, XML, or SQL queries.
         * 
         * **Syntax:**
         * 
         * ```java
         * String textBlock = """
         * This is a text block.
         * It can span multiple lines.
         * """;
         * ```
         */
        String json = """
                {
                    "name": "Akhilesh",
                    "age": 30,
                    "city": "Bangalore"
                }
                """;

        System.out.println(json);
        String html = """
                <html>
                    <head>
                        <title>Sample HTML</title>
                    </head>
                    <body>
                        <h1>Hello, World!</h1>
                        <p>This is a sample HTML text block.</p>
                    </body>
                </html>
                """;  
                     
                 System.out.println(html);
                 String sql="""
                         
                         """;
    }
   
}
