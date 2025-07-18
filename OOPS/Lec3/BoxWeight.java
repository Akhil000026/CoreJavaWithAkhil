package OOPS.Lec3;

public class BoxWeight extends box{
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }
    public BoxWeight(double l,double h,double w,double weight){
        super(l,h,w); // calling the constructor of the parent class
        // used to initialised values present in the parent class
        this.weight=weight;
    }


    
}
