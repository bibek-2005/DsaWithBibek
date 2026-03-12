package Queue;
class CircularQueue{
    int[] arr;
    int front;
    int rear;
    int size;
    CircularQueue(int n){
        arr = new int[n];
        front=rear=n=0;
    }
    void add(int val) {
        if (size == 0) {
            System.out.println("queue is empty");
        }

        arr[rear++] = val;
        if (rear == arr.length) rear = 0;
        size++;
    }
    int remove(){
        if (size == 0) {
            System.out.println("queue is empty");
            return  -1;
        }
        int frontval = arr[front];
        front++;
        if(front == arr.length) front=0;
        size--;
        return frontval;
    }
    int peek(){
        if(arr.length==0){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[front];

    }
    void display(){

        if(front>=rear){
            for(int i=front;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else {
            for(int i=0;i<rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

}
public class ArrayImplimentation {
    public static void main(String[] args) {
        CircularQueue c=new CircularQueue(5);
        c.add(1);
        c.add(2);c.add(4);
        c.display();
        System.out.println(c.peek());
    }
}
