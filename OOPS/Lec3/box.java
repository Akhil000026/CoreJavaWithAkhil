package OOPS.Lec3;

public class box {

     double l;
     double h;
     double w;

     box(){
        this.h=-1;
        this.w=-1;
        this.l=-1;
     }
    //  Cube
     box(double side){
        this.h=side;
        this.w=side;
        this.l=side;
     }

    //  
    box(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    box(box oldBox){
        this.l=oldBox.l;
        this.h=oldBox.h;
        this.w=oldBox.w;
    }

    public void information(){
        System.out.println("Running the box");
    }
    
}
