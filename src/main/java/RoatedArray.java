import java.util.Arrays;
import java.util.Scanner;

public class RoatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        int d=sc.nextInt();
       d =d % n;

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr,int i,int j){

        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
