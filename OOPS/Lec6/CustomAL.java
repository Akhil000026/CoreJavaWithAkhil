package OOPS.Lec6;

import java.util.Arrays;

public class CustomAL {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size=0;


    public CustomAL() {
        this.data = new int[DEFAULT_SIZE];

    }
    // Creating add fcn
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        int temp[]=new int[data.length*2];

        // copy the current items in new array
        for(int i=0;i<=data.length-1;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public int remove(){
        int removed=data[--size];
        return removed;

    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size; 
    }
    public void set(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString(){
        return "CustomAL{"+"data"+Arrays.toString(data)+",size="+size+'}';
    }


    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        
        CustomAL list = new CustomAL();
        list.add(23);
        list.add(45);
        list.add(67);
        System.out.println(list.size());
        System.out.println(list);

    }  
    
}
