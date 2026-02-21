package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Linkedlistone{
    Node head;
    Node tail;
    int size=1;

    void addtail(int val){
        Node temp = new Node(val);
        if(tail==null) {head=tail= temp;}
        else {
            tail.next = temp;
            tail = temp;
            size++;
        }
    }
    void display() {
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    void addfront(int val){
        Node temp =  new Node(val);
        if(head == null) head = temp;
        else{
            temp.next= head;
            head= temp;
            size++;
        }
    }
    void deletefront(){
        if(head == null) return;

        head = head.next;
        size--;
    }
    void deletelast(){

        if(head == null) return;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }
    int search(int val){
        if(head == null) return -1;
        Node temp = head;
        int index = 0;
        while(temp.next != null){
            if(temp.val == val)return index;
            temp = temp.next;
            index++;

        }
        return -1;
    }


    void insertAtIndex(int val, int index) {
        if(index < 0 || index>size){
            System.out.println("Index out of index");
            return;
        }
        else if(index == size) addtail(val);
        else if(index == 0) addfront(val);
        else{
            Node temp = head;
            for(int i =0; i<index-1;i++){
                temp= temp.next;

            }
            Node newNode = new Node(val);
            newNode.next= temp.next;
            temp.next= newNode;
            size++;
        }

    }
}


public class LinkedList {
    public static void main(String[] args) {
//        Node head = new Node(1);
////        head.next = new Node(2);
////        head.next.next = new Node(3);
        Linkedlistone ll = new Linkedlistone();
        ll.addtail(1);
        ll.addtail(2);
        ll.addtail(3);
        ll.addtail(4);
        ll.addtail(5);
        ll.addfront(7);

        //ll.display();
        ll.deletefront();
        //ll.display();
        //ll.deletelast();
        ll.display();
        System.out.print("size:"+ll.size+"  ");
        ll.insertAtIndex(19,2);
        ll.display();

//        System.out.println(ll.);
    }
}
