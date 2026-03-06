package Stack;

class Node{
    Node next;
    int val;
    Node(int val) {
        this.val = val;
    }
}
class MyStack{
    Node head;
    int len;

    int peek() throws Exception{
       if(head == null) throw new Exception("Stack Underflow Error By Bibek");
        else return head.val;
    }
    void push(int ele){
        Node temp = new Node(ele);
        temp.next= head;
        len++;
        head=temp;
    }
    int pop()throws Exception{
        if(len ==0) throw new Exception("Stack Underflow");
        int top=head.val;
        head= head.next;
        len--;
        return top;
    }
    void display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
            System.out.println();
        }

    }


}

public class LlImplimenation {
    public static void main(String[] args) throws Exception {
    MyStack st=new MyStack();
    //st.peek();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.display();
    st.pop();
    st.display();


    }
}
