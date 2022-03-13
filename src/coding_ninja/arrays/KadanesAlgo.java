/**
 * Problem Statement
 * You are given an array (ARR) of length N, consisting of integers. You have to find the sum of the subarray (including empty subarray) having maximum sum among all subarrays.
 * A subarray is a contiguous segment of an array. In other words, a subarray can be formed by removing 0 or more integers from the beginning, and 0 or more integers from the end of an array.
 * Note :
 * The sum of an empty subarray is 0.
 * Input Format :
 * The first line of input contains an integer N, representing the length of the array.
 *
 * The second line of input contains N single space-separated integers, denoting the elements of the array.
 * Output Format :
 * In the only output line, output the maximum subarray sum.
 * **/
package coding_ninja.arrays;

import java.util.Scanner;

public class KadanesAlgo {
    public static long maxSum(int arr[], int n) {
        long currentSum = 0;
        long maxSum = Integer.MIN_VALUE;
        int subarrayLeft = -1, subarrayRight = -1;
        int leftTemp = 0;
        for(int i=0; i<n; i++) {
            leftTemp = i;
            currentSum += arr[i];
            if(currentSum > maxSum)
            {
                maxSum = currentSum;
                subarrayRight = i;
                subarrayLeft = leftTemp;
            }
            if(currentSum < 0) {
                currentSum = 0;
                subarrayLeft = leftTemp+1;
            }
        }
        if(currentSum <= 0) {
            return 0;
        }
        else {
            System.out.println("Left Index : " + subarrayLeft + "&& Right Index : " + subarrayRight);
            return maxSum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Max Sum is : " + maxSum(arr, n));
    }
}
