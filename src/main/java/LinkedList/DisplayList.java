package LinkedList;

import java.util.Scanner;



public class DisplayList {
    public static void Display(Node head){
        Node temp = head;
        while(temp!= null){
            //System.out.print(temp.val + " ");
            temp= temp.next;
        }

    }

    public static void dsplayrec(Node head){
        Node temp = head;
        if(temp == null) return;
        System.out.print(temp.val+" ");
        dsplayrec(temp.next);

    }
    public static int get(Node head,int index){
        Node temp=head;
        for(int idx =0; idx<index; idx++){
            temp = temp.next;
        }
        return temp.val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(12);
        Node b = new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e= new Node(50);
        //System.out.println(c.next);
        //connect the linked list
        a.next = b;
        b.next=c;
        c.next= d;
        d.next=e;
        //e.next=a;
        e.next=null;
        //Display(a);
        //dsplayrec(a);
        System.out.println(get(a,3));
    }
}
