package pepcoding.stack_and_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Infix_Evaluation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        System.out.println(infixEval(exp.replaceAll("\\s", ""))); // as input is having space
    }

    private static int infixEval(String exp) {

        Stack<Character> operator = new Stack<>(); //for storing +, -, *, / , (
        Stack<Integer> operand = new Stack<>(); // for numbers

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                if (operator.size() == 0)
                    operator.push(ch);
                else {
                    if (ch == '(') {
                        operator.push(ch);
                    } else if (isPriority(ch) > isPriority(operator.peek())) {
                        operator.push(ch);
                    } else {
                        while (operator.size() > 0 && isPriority(ch) <= isPriority(operator.peek())) {
                            char opt = operator.pop();
                            int opd2 = operand.pop();
                            int opd1 = operand.pop();

                            int ans = getResult(opd1, opd2, opt);
                            operand.push(ans);
                        }
                        operator.push(ch);
                    }
                }
            } else if (ch == ')') {
                while(operator.peek() != '(') {
                    char opt = operator.pop();
                    int opd2 = operand.pop();
                    int opd1 = operand.pop();

                    int ans = getResult(opd1, opd2, opt);
                    operand.push(ans);
                }
                operator.pop();
            } else {
                operand.push(ch - '0');
            }
        }
        if(operator.size() > 0) {
            while (operator.size() > 0) {
                char opt = operator.pop();
                int opd2 = operand.pop();
                int opd1 = operand.pop();

                int ans = getResult(opd1, opd2, opt);
                operand.push(ans);
            }
        }
        return operand.peek();
    }

    private static int getResult(int opd1, int opd2, char opt) {
        int res = 0;

        switch (opt) {
            case '+':
                res = opd1 + opd2;
                break;
            case '-':
                res = opd1 - opd2;
                break;
            case '*':
                res = opd1 * opd2;
                break;
            case '/':
                res = opd1 / opd2;
                break;
        }
        return res;
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
