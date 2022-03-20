package pepcoding.stack_and_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Smallest_number_following_pattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        getAns(input);
    }

    private static void getAns(String input) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        String res = "";

        for(int i=1; i<=input.length(); i++) {
            if(input.charAt(i-1) == 'd') {  // if d -> then push it to stack with val i+1
                st.push(i+1);
            }
            else {
                while(st.size() != 0) { // if i -> then pop until stack is empty and append to answer
                    int p = st.pop();
                    res += p;
                }
                st.push(i+1); //then push the index+1 val of current i
            }
        }
        while(st.size() != 0) {
            res += st.pop();
        }
        System.out.println(res);
    }
}
