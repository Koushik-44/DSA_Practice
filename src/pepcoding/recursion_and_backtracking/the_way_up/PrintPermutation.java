package pepcoding.recursion_and_backtracking.the_way_up;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        printPermutation(input, "");
    }

    private static void printPermutation(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                printPermutation(input.substring(1), output + input.charAt(i));
            } else {
                printPermutation(input.substring(0,i)+input.substring(i+1), output+input.charAt(i));
            }
        }
    }
}
