/*  1. You are given a number n, representing the size of array a.
    2. You are given n numbers, representing elements of array a.
    3. You are given a number k.
    4. Rotate the array a, k times to the right (for positive values of k), and to
    the left for negative values of k.
*/

/*
    public static void reverse(int[] a, int li, int ri){
        while(li < ri){
          int temp = a[li];
          a[li]= a[ri];
          a[ri] = temp;

          li++;
          ri--;
        }
      }

  public static void rotate(int[] a, int k){
    k = k % a.length;
    if(k < 0){
      k += a.length; //+ve reverse = -ve reverse + array length
    }

    reverse(a, 0, a.length - k - 1);
    reverse(a, a.length - k, a.length - 1);
    reverse(a, 0, a.length - 1);
  }

*/

package pepcoding.function_and_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class RotateArray {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        rotate(a, k);
        display(a);
    }

    private static void display(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int val : a)
            sb.append(val + " ");
        System.out.println(sb);
    }

    private static void rotate(int[] a, int k) {

        if (k >= 0) {
            int rot = k % a.length;
            if (rot > 0) {
                for (int i = 0; i < rot; i++) {
                    int temp = a[a.length - 1];
                    for (int j = a.length - 2; j >= 0; j--) {
                        a[j + 1] = a[j];
                    }
                    a[0] = temp;
                }
            }
        } else {
            int rot = k * (-1) % a.length;
            //System.out.println("Rotation = " + rot);
            if (rot > 0) {
                for (int i = 0; i < rot; i++) {
                    //display(a);
                    int temp = a[0];
                    for(int j=1; j<=a.length-1; j++) {
                        a[j-1] = a[j];
                    }
                    a[a.length-1] = temp;
                }
            }
        }
    }
}


