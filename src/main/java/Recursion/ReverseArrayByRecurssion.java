package Recursion;



public class ReverseArrayByRecurssion {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int high = arr.length-1;
        int low= 0;
        reverse(arr,high,low);
    }
    public static void reverse(int[] arr,int high,int low){

        if(low>high){
            return;
        }
        reverse(arr,high,low+1);
        System.out.print(arr[low]+" ");

    }



}
