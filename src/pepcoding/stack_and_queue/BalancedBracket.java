package pepcoding.stack_and_queue;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(balanceCheck(input));
    }

    private static boolean balanceCheck(String input) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);

            if (ch == ')' || ch == '}' || ch == ']') {
                if (st.size() == 0) {
                    return false;
                }
                char p = st.pop();
                if (ch == ')' && (p == '{' || p == '[')) {
                    return false;
                }
                if (ch == '}' && (p == '(' || p == '[')) {
                    return false;
                }
                if (ch == ']' && (p == '{' || p == '(')) {
                    return false;
                }
            }
        }

        if (st.size() > 0)
            return false;
        return true;
    }
}
