package OOPS.Introduction;

public class Introduction4 {
    public static void main(String[] args) {

        // Creating a Object of type Student
        Student s1 = new Student();

        System.out.println("Default Values:");
        System.out.println("Roll No: " + s1.rollno);
        System.out.println("Name: " + s1.name);
        System.out.println("Marks: " + s1.marks);
        s1.greeting();
        System.out.println("__________________________");
        // Assigning values to the object attributes
        s1.rollno = 1;
        s1.name = "Akhil";
        s1.marks = 85.5f;

        System.out.println("Roll No: " + s1.rollno);
        System.out.println("Name: " + s1.name);
        System.out.println("Marks: " + s1.marks);

        // Calling 3 variable constructor
        Student s2= new Student(1,"Akhil", 85.5f);
        System.out.println(s2.name);


        
    }

    // Creating a class named "Student"
    static class Student{
        int rollno;
        String name;
        float marks;

        void greeting(){
            System.out.println("Hello this is a greeting method");
            System.out.println("Hello " + name);
            System.out.println("Hello " + this.name);

        }
        void changename(String naam){
            this.name=naam;
        }

        Student(Student other){
            this.name=other.name;
            this.rollno=other.rollno;
            this.marks=other.marks;
        }

        // Creating a void constructor default constructor
        // Student(){
        //     this(13, "Person", 100);
        // }
        // Constructor  with three values
        Student(int roll,String name,float marks){
            this.rollno=roll;
            this.name=name;
            this.marks=marks;
        }
        // Calling constructor from another constructor

        Student(){
            this(13,"Person",100);
        }


    }
    
}
