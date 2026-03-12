package Stack;

import java.util.Stack;

public class BaseBall {
    public static void main(String[] args) {
    }

    public static int  calPoints(String[] arr) {
        int n = arr.length;
        Stack<Integer> st= new Stack<>();

        for(int i=0 ; i< n;i++){
            if(arr[i].equals("C")) st.pop();
            else if(arr[i].equals("D")) st.push(2* st.peek());
            else if(arr[i].equals("+")){
                int top=st.pop();
                //int sectop=st.pop();
                int sectop=st.peek();
                int mix=top+sectop;
                //st.push(sectop);
                st.push(top);
                st.push(mix);

            }
            else{
                st.push(Integer.parseInt(arr[i]));
            }
        }
        int sum = 0;
        while(st.size() > 0) sum += st.pop();
        return sum;

    }


}
