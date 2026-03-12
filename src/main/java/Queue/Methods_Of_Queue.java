package Queue;


import java.util.LinkedList;
import java.util.Queue;
class queue{
    public void display(Queue<Integer> q){
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }

    }
}
public class Methods_Of_Queue {




    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);
        queue qe= new  queue();
        qe.display(q);
        q.add(4);
        qe.display(q);
    }
}
