import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr= {1,2,0,4,3,0,5,0};
        int i=0;

        for(int j=0; j<arr.length;j++){
            if(arr[j] != 0) {
                if(i !=j){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
