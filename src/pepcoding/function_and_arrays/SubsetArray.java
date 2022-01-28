/*  1. You are given a number n, representing the count of elements.
    2. You are given n numbers.
    3. You are required to print all subsets of arr. Each subset should be
    on separate line. For more clarity check out sample input and output.

    Input Format
    A number n
    n1
    n2
    .. n number of elements

    Sample Input
    3
    10
    20
    30

    Sample Output
    -	-	-
    -	-	30
    -	20	-
    -	20	30
    10	-	-
    10	-	30
    10	20	-
*/

package pepcoding.function_and_arrays;

import java.util.Scanner;

public class SubsetArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printSubArray(arr, n);
    }

    private static void printSubArray(int[] arr, int n) {
        int limit = (int) Math.pow(2, arr.length);

        for (int i = 0; i < limit; i++) {

            int temp = i;
            String line = "";

            for (int k = arr.length - 1; k >= 0; k--) {
                int rem = temp % 2;
                temp = temp / 2;

                if (rem == 0) {
                    line = "-\t" + line;
                } else {
                    line = arr[k] + "\t" + line;
                }
            }
            System.out.println(line);
        }
    }
}
