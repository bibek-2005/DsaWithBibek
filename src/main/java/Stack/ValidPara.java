package Stack;

import java.util.Stack;

import static Stack.ValidPara.isValid;

public class ValidPara {
    public static void main(String[] args) {
        System.out.println(isValid("{)]}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int ch = 0; ch < s.length(); ch++) {
            char chr = s.charAt(ch);
            if (chr == '(' || chr == '{'|| chr == '[') {
                st.push(chr);
            } else { // chr is closing para

                if(st.size() == 0) return false;

                char top = st.peek();
                if (sameStyle(top, chr)) st.pop();

            }
        }
        return st.size() == 0;

    }
        private static boolean sameStyle ( char b, char a){

            if (a == '(' && b == ')') return true;
            if (a == '{' && b == '}') return true;
            if (a == '[' && b == ']') return true;
            else return false;

        }

}


