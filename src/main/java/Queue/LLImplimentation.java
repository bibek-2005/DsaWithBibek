package Queue;
class Node {
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }

}
class MyQueue{
    Node front;
    Node rear;
    int size=1;

    void add(int val){
        if(front==null){
            front=rear = new Node(val);
        }
    else {
            Node temp = new Node(val);
            rear.next = temp;
            rear = temp;
            size++;
        }
    }
    void remove(){
        if(front == null){
            System.out.println("queue is empty");
        }
        front = front.next;
        size--;

    }
    void display(){
        if(front == null){
            System.out.println("queue is empty");
        }
        Node temp = front;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int peek(){
        if(front == null){
            System.out.println("queue is empty");
        }
        return front.val;
    }
    int size(){
        return size;
    }

}
public class LLImplimentation {
    public static void main(String[] args) {
        MyQueue q= new MyQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        q.display();
        System.out.println("the size is "+q.size());
        q.remove();
        q.display();
    }
}
