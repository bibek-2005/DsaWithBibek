package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public int kthSmallest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele:arr){
            pq.add(ele);//logk
            if(pq.size()>k) pq.remove();//logk
        }
        return pq.peek();
    }
}
