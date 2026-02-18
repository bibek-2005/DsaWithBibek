public class MoveAllZeros {
    public static void main(String[] args) {
        int[] arr={0,0,5,0,0,0,8,0,2,0,0,0,4,0};
        int pos=0;
        for(int num: arr){
            if( num > 0){
                arr[pos++]=num;
            }
        }
        while(pos<arr.length){
            arr[pos++] =0;

        }
        for(int num: arr){
            System.out.println(num);
        }
    }
}
