package Recursion;

public class ArrayInRecussion {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
//        rec(arr,0);

        int ele =10;
        System.out.print(Lin(arr,ele,0));

    }

    public static boolean Lin(int[] arr, int ele,int index){

        if(index==arr.length) return false;

        if(arr[index] == ele ) return true;
        return Lin(arr,ele,index+1);


    }

    public static void rec(int[] arr,int indx){
        if(indx == arr.length) return;
        rec(arr,indx+1);
        System.out.print(arr[indx]+ " ");
    }
}
