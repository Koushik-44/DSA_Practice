/*  1. You are given an array of size 'n' and n elements of the same array.
    2. You are required to find and print all the subarrays of the given array.
    3. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.
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
    10
    10	20
    10	20	30
    20
    20	30
    30
*/

package pepcoding.function_and_arrays;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        subArray(arr, n);
    }

    private static void subArray(int[] arr, int n) {

        for(int i=0; i<n; i++) {
            for(int k=i; k<n; k++) {
                for(int j=i; j<=k; j++)
                {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }

        }
    }
}
