public class Annotation {

    // Annotations are Metadata added to a ajava code.

    public @interface MyAnnotation {
        String value() default "default value";
    }

    public static void main(String[] args) {
        // You can use MyAnnotation here if needed

        // Using Annotation
        @MyAnnotation("Example Annotation")
        class AnnotatedClass {
            public void display() {
                System.out.println("This class is annotated with MyAnnotation.");
            }
        }
    }
    
}
