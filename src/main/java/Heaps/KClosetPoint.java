package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

class Triplets implements Comparable<Triplets>{
    int x;
    int y;
    int dis;
    Triplets(int x,int y,int dis){
        this.x = x;
        this.y= y;
        this.dis = dis;
    }
    public int compareTo(Triplets t){
        return this.dis-t.dis;
    }
}
public class KClosetPoint {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplets> pq = new PriorityQueue<Triplets>(Collections.reverseOrder());
        for(int[] point:points){
            int x = point[0];
            int y=point[1];
            int dis = x*x + y*y;
            pq.add(new Triplets(x,y,dis));
            if(pq.size()>k) pq.remove();
        }
        int[][] ans = new int[k][2];
        for(int i=0;i<k;i++){
            Triplets top =pq.remove();
            ans[i][0]=top.x;
            ans[i][1]=top.y;
        }
        return ans;
    }


}
