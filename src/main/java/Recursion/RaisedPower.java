package Recursion;

import java.util.Scanner;

public class RaisedPower {
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        System.out.print("Enter the base: ");
        int base= sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        System.out.print(pow(base,exponent));

    }
//    public static int pow(int a, int b){
//        if(a == 0) return 1;
//        return b* pow(a-1,b);
//    }
    public static int pow(int base, int exponent){
        if(exponent==0)return 1; // base case
        int call = pow(base,exponent/2); //calculation
        if(exponent % 2 == 0) return call* call;
        return base*call*call;
    }
}
