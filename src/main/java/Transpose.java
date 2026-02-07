public class Transpose {

    public static void main(String[] args) {
        int[][] arr= {{1,2,3,0} ,{5,6,7,8},{3,9,8,9},{3,5,7,8}};
print(arr);


        for(int i=0; i< arr.length; i++){
            for(int j=0;j<i;j++){
                int temp =arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }
print(arr);





    }

    public static void print(int[][] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
              System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
