/*      1. You are given a number n1, representing the size of array a1.
        2. You are given n1 numbers, representing elements of array a1.
        3. You are given a number n2, representing the size of array a2.
        4. You are given n2 numbers, representing elements of array a2.
        5. The two arrays represent digits of two numbers.
        6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

        Assumption - number represented by a2 is greater.

        Input Format
        A number n1
        n1 number of elements line separated
        A number n2
        n2 number of elements line separated

        Output Format
        A number representing difference of two numbers (a2 - a1), represented by two arrays.
*/
package pepcoding.function_and_arrays;

import java.util.Scanner;

public class DifferenceOfTwoArrays {
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

        diff_result(n1, arr1, n2, arr2);

    }

    private static void diff_result(int n1, int[] arr1, int n2, int[] arr2) {
        int i1 = n1-1;
        int i2 = n2-1;

        int max = n1>n2?n1:n2;
        int result[] = new int[max];

        int itr = max-1;
        int carry = 0;

        int d1 = 0, d2 = 0;

        while(itr >= 0)
        {
            if(i1 >= 0)
                d1 = arr1[i1];
            else
                d1 = 0;

            d2 = arr2[i2];
            d2 = d2 + carry;

            int digit = 0;

            if(d2 >= d1) {
                carry = 0;
                digit = d2 - d1;
            }
            else{
                carry = -1;
                digit = d2 + 10 - d1;
            }

            result[itr--] = digit;
            i1--;
            i2--;
        }

        int len = 0;
        int flag = 0;
        while(len < result.length){
            //System.out.println("Length = " + len);
            if(result[len] != 0){
                flag = 1;
                break;
            }
            len++;
        }
        //System.out.println("Length = " + len);
        if(flag == 0)
            System.out.println(0);
        else {
            for (int k = len; k < result.length; k++) {
                System.out.println(result[k]);
            }
        }
    }
}
