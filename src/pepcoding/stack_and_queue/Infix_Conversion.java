package pepcoding.stack_and_queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Infix_Conversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        System.out.println(inToPost(exp));
        //System.out.println(inToPre(exp));
    }

//    private static String inToPre(String exp) {
//        StringBuilder sb = new StringBuilder();
//
//        return sb.toString();
//    }

    private static String inToPost(String exp) {

        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                if (st.size() == 0) {
                    st.push(ch);
                } else {
                    if (ch == '(') {
                        st.push(ch);
                    } else if (isPriority(ch) > st.peek()) {
                        st.push(ch);
                    } else {
                        while (st.size() > 0 && isPriority(ch) <= st.peek()) {
                            sb.append(st.pop());
                        }
                        st.push(ch);
                    }
                }
            } else if (ch == ')') {
                while (st.peek() != '(') {
                    sb.append(st.pop());
                }
                st.pop();
            } else {
                sb.append(ch);
            }
            System.out.println(st);
            System.out.println(sb.toString());
        }

        if (st.size() > 0) {
            while (st.size() > 0) {
                sb.append(st.pop());
            }
        }
        return sb.toString();
    }

    private static int isPriority(char ch) {
        if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;
        else
            return 0;
    }
}
