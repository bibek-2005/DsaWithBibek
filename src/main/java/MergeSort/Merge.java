package MergeSort;

public class Merge {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,1,2,4,3};
        // step 1 make too empty array .
        merge(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void merge(int[] arr){
        int n = arr.length;
        int[] a =new int[n/2];
        int[] b = new int[n-n/2];

        if(n == 1) return;
//        copy pasting the element to the sub array
        int index=0;
        for(int i=0;i<a.length;i++)  a[i] = arr[index++];
        for(int j=0;j<b.length;j++)  b[j] = arr[index++];
//  perform magic of recursion
        merge(a); merge(b);
        mergetowarray(a,b,arr);

    }
    public static void mergetowarray(int[] a, int [] b, int[] c){
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length){
            if(a[i] < b[j]) c[k++] = a[i++];
            else c[k++] =b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];

    }
}
