import java.util.ArrayList;

public class Sprialmatrix {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> spirallyTraverse(int[][] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        int n= arr.length;
        int m = arr[0].length;
        int firstRow=0, lastRow = n-1 , firstCol= 0, lastCol=m-1;
            int count =0; int tn= n*m;
        while(count <tn){

            for(int i=firstCol; i<=lastCol;i++){
                ans.add(arr[firstRow][i]);
            }
            firstRow++;
            if(count == tn) break;
            for(int j=firstRow;j<=lastRow;j++){
                ans.add(arr[j][lastCol]);
            }
            lastCol--;
            if(count == tn) break;

            for(int k=lastCol; k>=firstCol;k--){
                ans.add(arr[lastRow][k]);
            }
            if(count == tn) break;

            lastRow--;
            for(int l=lastRow; l>=firstRow;l--){
                ans.add(arr[l][firstCol]);
            }
            firstCol++;
        }

        return ans;
    }

//    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
//
//        ArrayList<Integer> ans = new ArrayList<>();
//        int n= arr.length;
//        int m = arr[0].length;
//        int firstRow=0, lastRow = n-1 , firstCol= 0, lastCol=m-1;
//
//        while(firstRow <= lastRow && firstCol <= lastCol){
//
//            for(int i=firstCol; i<=lastCol;i++){
//                ans.add(arr[firstRow][i]);
//            }
//            firstRow++;
//            if(firstRow >lastRow || firstCol>lastCol) break;
//            for(int j=firstRow;j<=lastRow;j++){
//                ans.add(arr[j][lastCol]);
//            }
//            lastCol--;
//            if(firstRow >lastRow || firstCol>lastCol) break;
//
//            for(int k=lastCol; k>=firstCol;k--){
//                ans.add(arr[lastRow][k]);
//            }
//            if(firstRow >lastRow || firstCol>lastCol) break;
//
//            lastRow--;
//            for(int l=lastRow; l>=firstRow;l--){
//                ans.add(arr[l][firstCol]);
//            }
//            firstCol++;
//        }
//
//        return ans;
//    }



}
