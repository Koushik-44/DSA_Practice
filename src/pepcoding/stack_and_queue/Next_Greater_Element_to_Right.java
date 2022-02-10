package pepcoding.stack_and_queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Next_Greater_Element_to_Right {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    /*Using naive approach*/
    /*
    public static int[] solve(int[] arr){
        int n = arr.length;
        int ans[] = new int[n];

        for(int i=0; i<=n-2; i++) {
            int flag = 0;
            for(int j=i+1; j<n; j++) {
                if(arr[j] > arr[i]) {
                    ans[i] = arr[j];
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                ans[i] = -1;
        }
        ans[n-1] = -1;
        return ans;
    }
    */
    //Using stack
    public static int[] solve(int[] arr) {
        int res[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length - 1]); //Pushing last element to stack
        res[arr.length - 1] = -1; //Last element of result will always be -1

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] > st.peek()) { //popping elements till size > 0 or tos < arr[i]
                st.pop();
            }
            if (st.size() == 0) { // after popping, if stack is empty then put -1 in result[]
                res[i] = -1;
            } else {
                res[i] = st.peek(); // result[] will contain tos
            }
            st.push(arr[i]);    //push the current element to stack for next iterations
        }

        return res;
    }
}
