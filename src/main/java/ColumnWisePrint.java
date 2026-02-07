public class ColumnWisePrint {

    public static void main(String[] args) {

        int[][] arr= {{1,2,3,4} ,{5,6,7,8},{3,9,8,9}};

        for(int i=0;i<arr[0].length; i++){//it goes for 0 to 2
            for(int j=0; j< arr.length;j++){// it goes for 0 to 3
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
