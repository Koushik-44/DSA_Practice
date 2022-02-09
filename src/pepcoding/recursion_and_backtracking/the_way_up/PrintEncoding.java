package pepcoding.recursion_and_backtracking.the_way_up;

import java.util.Scanner;

public class PrintEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        printEncoding(input, "");
    }

    private static void printEncoding(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        } else if (input.length() == 1) {
            if (input.charAt(0) != '0') {
                int val = input.charAt(0) - '0';
                char ch = (char) ('a' + val - 1);
                printEncoding(input.substring(1), output + ch);
            } else {
                return;
            }
        } else {
            if (input.charAt(0) != '0') {
                int val = input.charAt(0) - '0';
                char ch = (char) ('a' + val - 1);
                printEncoding(input.substring(1), output + ch);

                if (Integer.parseInt(input.substring(0, 2)) <= 26) {
                    int val1 = Integer.parseInt(input.substring(0, 2));
                    char ch1 = (char) ('a' + val1 - 1);
                    printEncoding(input.substring(2), output + ch1);
                }
            } else {
                return;
            }
        }
    }
}
