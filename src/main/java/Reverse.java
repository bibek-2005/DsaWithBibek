import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        int i=0;
        int j=arr.length-1;
        int k=3;

        while(i<j){
            swap(arr,i,k);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));


    }
    public static void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
