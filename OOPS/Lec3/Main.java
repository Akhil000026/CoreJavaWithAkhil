package OOPS.Lec3;

public class Main {
    public static void main(String[] args) {
        box box=new box();
        // box box2=new box(box);

        System.out.println(box.l+" "+box.h+" "+box.w);

        BoxWeight box2=new BoxWeight();
        System.out.println(box2.l+" "+box2.h+" "+box2.w+" "+box2.weight);

        box box3=new BoxWeight(1,2,3,4);
        // member access is deined by reference variable type
        System.out.println(box3.l+" "+box3.h+" "+box3.w);
        // BoxWeight box4=new box(1,2,3); // this will give an error because box is not a subclass of BoxWeight

        BoxWeight box5=new BoxWeight(1,2,3,4);
        System.out.println(box5.l+" "+box5.h+" "+box5.w+" "+box5.weight);

        box box6=new BoxPrice(1,2,3,4,5);
        


        
    }
    
}
