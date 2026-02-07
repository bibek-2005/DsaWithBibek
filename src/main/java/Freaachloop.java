public class Freaachloop {
    public static void main(String[] args) {

        int[][] arr= {{1,2,3,0} ,{5,6,7,8},{3,9,8,9}};


//        for(int i=0;i<arr[0].length;i++){
//            for(int ele: arr[i]){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }

        for(int[] a: arr){
            for(int ele: a){
                System.out.print(ele+" ");

            }
            System.out.println();
        }




    }
}
