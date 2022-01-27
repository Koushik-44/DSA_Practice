/*      1. You are given a number n1, representing the size of array a1.
        2. You are given n1 numbers, representing elements of array a1.
        3. You are given a number n2, representing the size of array a2.
        4. You are given n2 numbers, representing elements of array a2.
        5. The two arrays represent digits of two numbers.
        6. You are required to add the numbers represented by two arrays and print the
           arrays.

        Input Format
        A number n1
        n1 number of elements line separated
        A number n2
        n2 number of elements line separated

        Output Format
        A number representing sum of two numbers, represented by two arrays.
*/
package pepcoding.function_and_arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2;

        n1 = sc.nextInt();
        int arr1[] = new int[n1];

        for(int i=0; i<n1; i++)
            arr1[i] = sc.nextInt();

        n2 = sc.nextInt();
        int arr2[] = new int[n2];

        for(int i=0; i<n2; i++)
            arr2[i] = sc.nextInt();

        sum_result(n1, arr1, n2, arr2);

    }

    private static void sum_result(int n1, int[] arr1, int n2, int[] arr2) {

        int max = n1>n2?n1:n2;
        int result[] = new int[max];
        int i1 = n1-1;
        int i2 = n2-1;
        int itr = max-1;

        int carry = 0;
        while(itr >= 0) {
            int digit = carry;
            if(i1 >= 0)
                digit += arr1[i1--];
            if(i2 >= 0)
                digit += arr2[i2--];

            carry = digit/10;
            digit = digit%10;

            result[itr--] = digit;
        }
        if(carry > 0)
            System.out.println(carry);
        for(int k: result)
            System.out.println(k);
    }
}
