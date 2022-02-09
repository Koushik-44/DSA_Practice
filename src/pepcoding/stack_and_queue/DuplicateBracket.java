package pepcoding.stack_and_queue;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(duplicateCheck(input));
    }

    private static boolean duplicateCheck(String input) {
        Stack<Character> st = new Stack<>();
        boolean ans = false;
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ')')
                st.push(ch);
            else {
                char p = st.peek();
                if (p == '(') {
                    ans = true;
                    break;
                } else {
                    while (p != '(') {
                        st.pop();
                        p = st.peek();
                    }
                    st.pop();
                }
            }

        }
        return ans;
    }
}
