package pepcoding.function_and_arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        if(binarySearch(arr, n, data))
            System.out.println("Data is present");
        else
            System.out.println("Data not found!!");
    }

    private static boolean binarySearch(int[] arr, int n, int data) {
        int f = 0;
        int r = n-1;

        while(f <= r) {
            int mid = (f + r)/2;
            if(arr[mid] < data)
                f = mid + 1;
            else if(arr[mid] > data)
                r = mid - 1;
            else
                return true;
        }
        return false;
    }
}

