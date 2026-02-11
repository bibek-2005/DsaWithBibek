package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int[] nums ={1,2,3,4,5,6};
        sub(nums,list,0);

    }
    public static void sub(int[] nums,List<Integer> list, int idx){

        sub(nums,list.add(nums[idx]),idx+1);//pick

        sub(nums,list,idx+1);//skip
    }
}
