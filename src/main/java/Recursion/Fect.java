package Recursion;

public class Fect {
    public static void main(String[] args) {
        fact1(10);

    }
    public static int  fact1(int n) {
        if (n == 1 ) return 1;
        if(n ==0) return 0;
        int ans=fact1(n-1)*fact1(n-2);
        return ans;

    }
}
