package pepcoding.stack_and_queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Merge_Overlapping_Meeting {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr, n);
    }

    public static void mergeOverlappingIntervals(int[][] arr, int len) {
        // merge overlapping intervals and print in increasing order of start time

        //sorting the array based on start time
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        Stack<Integer> st = new Stack<>();
        st.push(arr[0][0]);
        st.push(arr[0][1]);

        for (int i = 1; i < len; i++) {
            if (arr[i][0] <= st.peek()) { //if start time of current meeting is less than end time of prev meeting then it would merge
                if (arr[i][1] > st.peek()) { //if end time of current meeting is greater than end time of prev meeting
                    st.pop();               //then update TOS
                    st.push(arr[i][1]);
                }
            } else {
                st.push(arr[i][0]); // else push both start and end time
                st.push(arr[i][1]);
            }
        }

        display_ans(st);
    }

    private static void display_ans(Stack<Integer> st) {
        if (st.size() == 0)
            return;

        int end = st.pop();
        int beg = st.pop();

        display_ans(st);

        System.out.println(beg + " " + end);
    }
}
