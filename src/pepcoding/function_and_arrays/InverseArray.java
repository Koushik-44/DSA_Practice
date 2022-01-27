package pepcoding.function_and_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InverseArray {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(br.readLine());

        int inv[] = inverse(a);
        display(inv);
    }

    private static int[] inverse(int[] a) {
        int res[] = new int[a.length];
        for(int i=0; i<a.length; i++) {
            res[a[i]] = i;
        }
        return res;
    }

    private static void display(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int val : a)
            sb.append(val + " ");
        System.out.println(sb);
    }

}


