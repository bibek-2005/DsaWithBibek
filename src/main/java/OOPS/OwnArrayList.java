package OOPS;

import java.util.ArrayList;

class Arraylist{
    int index;
    int size;
    int capacity;
    int[] arr=new int[capacity];
    Arraylist(){}

    Arraylist(int capacity){
        //this.index = index;
        arr=new int[capacity];
        System.out.println(arr[0]);
    }



}


public class OwnArrayList {
    public static void main(String[] args) {
        Arraylist a = new Arraylist(0);
        a.index =1;

    }
}
