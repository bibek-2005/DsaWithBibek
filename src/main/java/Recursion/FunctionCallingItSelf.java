package Recursion;

import java.util.Scanner;

public class FunctionCallingItSelf {

    static int n; //most of the case we ignore it
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first number:");
        int x=sc.nextInt();
        print(x);
    }
    public static void print(int x){
        if(x==0) return;
      System.out.print(x+" ");
        print(x-1);
        if(x!=1)System.out.print(x+" ");
    }


    //    public static void print(int x){
//        if(x>n) return;
//        System.out.println(x);
//        print(x+1);
//    }
}
