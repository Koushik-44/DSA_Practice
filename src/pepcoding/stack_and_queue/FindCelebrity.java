package pepcoding.stack_and_queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class FindCelebrity {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }
        findCelebrity(arr, n);

    }

    public static void findCelebrity(int[][] arr, int length) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        /*
        int i = 0, j = length - 1;

        while (i < j) {
            if (arr[i][j] == 1) //if i knows j -> then i can't be celebrity
                i++;
            else
                j--;    // if i doesn't know j -> then j can't be celebrity
        }
        */

        Stack<Integer> st = new Stack<>(); //Stack will hold the potential celebrity
        for(int i=0; i<length; i++)
            st.push(i);

        while(st.size() >= 2) {
            int first = st.pop();
            int second = st.pop();

            //if first_person knows second_person then first_person can't be a celebrity -> put second_person on stack
            if(arr[first][second] == 1) {
                st.push(second);
            }
            //if first_person doesn't know second_person then first_person might be a celebrity -> put first_person on stack
            else {
                st.push(first);
            }
        }
        int possible_candidate = st.pop();
        int flag = 1;
        for (int i = 0; i < length; i++) {
            if (i != possible_candidate) {
                if (arr[possible_candidate][i] == 1 || arr[i][possible_candidate] == 0) {
                    flag = -1;
                    break;
                }
            }
        }
        if (flag == -1)
            System.out.println("none");
        else
            System.out.println(possible_candidate);
    }

}
