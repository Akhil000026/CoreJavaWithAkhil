package OOPS.Introduction;
import java.util.*;

public class main {
  public static void main(String[] args) {
    // store 5 roll nos
    int[] numbers = new int[5];

    // store 5 names
    String[] names = new String[5];

    // data of 5 students: {roll no, name, marks}
    int[] rno = new int[5];
    String[] name = new String[5];
    float[] marks = new float[5];

    Student[] students = new Student[5];

    // just declaring
    // Student kunal;
    //kunal = new Student();

    Student kunal = new Student(15, "Kunal Kushwaha", 85.4f);
    Student rahul = new Student(18, "Rahul Rana", 90.3f);

  // kunal.rno = 13;
  // kunal.name = "Kunal Kushwaha";
  // kunal.marks = 88.5f;

  //  kunal.changeName("Shoe lover");
  //  kunal.greeting();


    System.out.println(kunal.rno);
    System.out.println(kunal.name);
    System.out.println(kunal.marks);

    Student random = new Student(kunal);
    System.out.println(random.name);

    Student random2 = new Student();
    System.out.println(random2.name);

    Student one = new Student();
    Student two = one;

    one.name = "Something something";

    System.out.println(two.name);

}
}

class Student {
  int rno;
  String name;
  float marks = 90;

  // we need a way to add the values of the above
  // properties object by object

  // we need one word to access every object

  void greeting() {
      System.out.println("Hello! My name is " + this.name);
  }

  void changeName(String name) {
      this.name = name;
  }

  Student  (Student other) {
      this.name = other.name;
      this.rno = other.rno;
      this.marks = other.marks;
  }
  //  Creating a constructor => constructor is a fcn inside the class that is called when we create an object of the class
  Student () {
    // kunal.roln0="13"; error
    
    // CONSTUCTOR
    // this is a special method that has the same name as the class
    // Use to set default values 
    // this is a keyword that refers to the current object
      // this is how you call a constructor from another constructor
      // internally: new Student (13, "default person", 100.0f);
      this (13, "default person", 100.0f);
  }


  // Student arpit = new Student(17, "Arpit", 89.7f);
  // here, this will be replaced with arpit
  Student (int rno, String name, float marks) {
      this.rno = rno;
      this.name = name;
      this.marks = marks;
  }

}
