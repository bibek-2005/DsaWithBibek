package Stack;

import java.util.Stack;



public class PushAtButtom {
    public static void main(String[] args) {
        Stack<Integer> st = new  Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        int ele =5;System.out.println(st);
        pushAtButtom(st,ele);
        System.out.println(st);
        reverse(st);
        System.out.println(st);

    }

    private static void reverse(Stack<Integer> st) {
        if(st.size()<=1) return;
        int top=st.pop();
        reverse(st); // magic
        pushAtButtom(st,top);
    }

    public static void pushAtButtom(Stack<Integer> st,int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }

        int top = st.pop();
        pushAtButtom(st,ele);
        st.push(top);


    }
}
