package Recursion;

public class Reverse {
    public static void main(String[] args) {
        //System.out.print(1 % 10);
      reverse(123);
    }
    public static void reverse(int n){
       if (n==0) return; // base case
       System.out.print(n % 10);
      reverse(n /10);
    }
}
