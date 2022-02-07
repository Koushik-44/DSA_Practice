package pepcoding.recursion_and_backtracking.the_way_up;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        ArrayList<Integer> out = new ArrayList<>();
        printArraySub(arr, 0, out);
    }

    private static void printArraySub(int[] arr, int len, ArrayList<Integer> out) {
        //System.out.println("Length = " + len);
        if (len == arr.length) {
            if (out.size() > 0) {
                System.out.println(out);
            }
            return;
        }
        out.add(arr[len]);
        printArraySub(arr, len+1, out);
        out.remove((Integer) arr[len]);
        printArraySub(arr, len+1, out);
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String in = sc.nextLine();
//        printSubSeq(in, "");
//    }
//
//    private static void printSubSeq(String in, String output) {
//        if (in.length() == 0) {
//            System.out.println(output);
//            return;
//        }
//        char ch = in.charAt(0);
//        String restString = in.substring(1);
//        printSubSeq(restString, output + ch);
//        printSubSeq(restString, output + "");
//    }
}
