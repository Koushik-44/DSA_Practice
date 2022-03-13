/**
 *
 * Problem Statement
 * You are given an array of integers ARR[] of size N consisting of zeros and ones. You have to select a subset and flip bits of that subset. You have to return the count of maximum one’s that you can obtain by flipping chosen sub-array at most once.
 * A flip operation is one in which you turn 1 into 0 and 0 into 1.
 * For Example:
 * If you are given an array {1, 1, 0, 0, 1} then you will have to return the count of maximum one’s you can obtain by flipping anyone chosen sub-array at most once, so here you will clearly choose sub-array from the index 2 to 3 and then flip it's bits. So, the final array comes out to be {1, 1, 1, 1, 1} which contains five ones and so you will return 5.
 * Input Format :
 * The first line of input consists of a single integer T denoting the total number of the test case.
 *
 * The first line of each test case contains an integer N, which represents the array's size.
 *
 * The second line of each test case contains N space-separated integers representing the array elements accordingly.
 * Output Format :
 * For each test case, return a single integer representing the maximum number of 1's you can have in the array after at most one flip operation.
 * **/

package coding_ninja.arrays;

import java.util.Scanner;

public class FlipBits {
    public static int flipBit(int arr[], int n) {
        int currentCount = 0; // count(0) - count(1)
        int max_count = 0;
        int left = -1, right = -1, tempLeft = 0;
        int total_one = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] == 0)
                currentCount++;
            if(arr[i] == 1) {
                currentCount--;
                total_one++;
            }
            if(currentCount > max_count) {
                max_count = currentCount;
                right = i;
                left = tempLeft;
            }
            if(currentCount < 0) {
                currentCount = 0;
                tempLeft = i+1;
            }
        }
        System.out.println("Left and Right index of the subarray is : "+ left + " && " + right);
        return total_one+max_count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Max Sum is : " + flipBit(arr, n));
    }
}
