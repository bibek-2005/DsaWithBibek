package Stack;

import java.sql.SQLOutput;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> stk= new Stack<>();
        System.out.println(stk.isEmpty());
        System.out.println(stk.size()==0);
        //System.out.println(stk.peek()); // It throw the error underflow error
        //System.out.println(stk.pop());// it also throw error stack overflow error
        stk.push("bibek");
        stk.push("shardha");
        stk.push("Sagar");
        stk.push("siba");
        stk.push("shubham");

//        System.out.print(stk.peek()+" ");
//        System.out.println(stk.size());// it gives the top element of the stack
//        stk.pop();
//        System.out.print(stk.peek());
//        System.out.println(stk.size());
//        System.out.println(stk.isEmpty());
//        System.out.println(stk);
        Stack<String> stk2= new Stack<>();
        while(stk.size() >0){
            String top = stk.pop();
            System.out.println(top);
            stk2.push(top);
        }
        System.out.println(stk.isEmpty());
        while(stk2.size()>0){
            String top = stk2.pop();
            System.out.println(top);
            stk.push(top);
        }
        System.out.println(stk2.isEmpty());
    }
}
