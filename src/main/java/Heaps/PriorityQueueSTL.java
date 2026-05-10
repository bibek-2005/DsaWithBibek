package Heaps;

import java.util.PriorityQueue;

public class PriorityQueueSTL {
    public static void main(String arg[]){
        PriorityQueue<Integer> pq = new PriorityQueue();
        pq.add(10); pq.add(20); pq.add(30); pq.add(40); pq.add(50);
        System.out.println(pq.peek());
        pq.add(1);
        System.out.println(pq.peek());
        System.out.print(pq.size());
        pq.remove();
        System.out.println(pq);

        for(int ele:pq){
            System.out.print(ele+" ");
        }
    }

}
