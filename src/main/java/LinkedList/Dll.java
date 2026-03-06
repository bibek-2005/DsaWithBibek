package LinkedList;
class ListNode{
   ListNode next;
   ListNode prev;
    int val;
    ListNode(int val){
        this.val=val;
    }
}

class DoubleLinkedList{
    ListNode head;
    ListNode tail;
    ListNode prev;
    int size;
    void insertAtHead(int val){
        ListNode temp= new ListNode(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }
    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(tail== null) head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;

        }
        size++;
    }

}
public class Dll {
    public static void main(String[] args) {

    }
}
