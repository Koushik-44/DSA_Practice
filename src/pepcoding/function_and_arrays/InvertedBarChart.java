/*
        Sample Input
        5
        3
        1
        0
        7
        5

        Sample Output
        *	*		*	*
        *			*	*
        *			*	*
                    *	*
                    *	*
                    *
                    *
*/

package pepcoding.function_and_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InvertedBarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        invertedChart(arr, n);
    }

    private static void invertedChart(int[] arr, int n) {
        int max = Arrays.stream(arr)
                .max()
                .getAsInt();

        for(int i=1; i<=max; i++) {
            for(int k=0; k<n; k++) {
                if(arr[k] >= i)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
