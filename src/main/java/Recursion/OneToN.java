package Recursion;
public class OneToN {
    public static void main(String[] args) {
//        print(10);
        print2(5,1);
    }
//    public static void print(int n){
//        if(n==0) return;
//        System.out.print(n+" ");
//        print(n-1);
//    }
    public static void print2(int n, int a){
        if(a >n) return;
        System.out.print(a+" ");
        print2(n,a+1);
    }
}
