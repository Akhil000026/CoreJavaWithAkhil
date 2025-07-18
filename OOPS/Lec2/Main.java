package OOPS.Lec2;

// No need to import the class from the same package

public class Main {
    public static void main(String[] args) {
        Humans Akhil=new Humans(20,"Akhil",10000,false);
        Humans Ankit=new Humans(20,"Ankit",10000,true);
        System.out.println(Akhil.age);
        System.out.println(Akhil.population);

    }
}
