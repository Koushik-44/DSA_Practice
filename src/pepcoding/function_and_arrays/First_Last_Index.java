package pepcoding.function_and_arrays;

import java.util.Scanner;

public class First_Last_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        findIndex(arr, n, data);
    }

    private static void findIndex(int[] arr, int n, int data) {
        int front = 0;
        int rear = n - 1;
        int mid = -1;
        int first_index = -1;
        int last_index = -1;

        while (front <= rear) {
            mid = (front + rear) / 2;
            if (arr[mid] > data) {
                rear = mid - 1;
            } else if (arr[mid] < data) {
                front = mid + 1;
            } else if (arr[mid] == data) {
                first_index = mid;
                rear = mid - 1;
            }
        }

        front = 0;
        rear = n - 1;
        mid = -1;

        while (front <= rear) {
            mid = (front + rear) / 2;
            if (arr[mid] > data) {
                rear = mid - 1;
            } else if (arr[mid] < data) {
                front = mid + 1;
            } else if (arr[mid] == data) {
                last_index = mid;
                front = mid + 1;
            }
        }
        if (first_index == last_index) {
            System.out.println(first_index);
        } else {
            System.out.println(first_index);
            System.out.println(last_index);
        }

    }
}
