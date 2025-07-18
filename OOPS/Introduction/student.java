package OOPS.Introduction;

public class student {
    // CLASS IN DIFFERENT FILE but same PACKAGE
    private int rollno;
    String name;
    float marks;  
    
    // private: only accessible within the class
    // default: only accessible within the package
    // protected: only accessible within the package and outside the package through inheritance

    // Getter and Setter methods

    public int getrollno() {
        return rollno;
    }
    public void setrollno(int rollno) {
        this.rollno = rollno;
    }

    // Creating Constructor
    public student() {
        System.out.println("Default Constructor");
    }
    public student(String naam, int rno, float mars) {
         name=naam;
         rollno=rno;    
            marks=mars;
    }

    
    
 
}
