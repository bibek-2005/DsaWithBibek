public class ColSnake {


    public static void main(String args[]){

        int[][] arr= {{1,2,3,0} ,{5,6,7,8},{3,9,8,9}};
        int rows=arr.length;
        int cols=arr[0].length;
        for(int col=0; col< cols; col++){
            if(col%2==0){
                for (int row = 0; row < rows; row++) {
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println();
                }
            else{
                //transpose(arr);
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
                //print(arr);
                System.out.println();
            }
        }

    }
    public static void transpose(int[][] arr){
        for(int i=0; i< arr[0].length; i++){
            for(int j=0; j< arr.length; j++){
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }

        }

    }
    public static void print(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
