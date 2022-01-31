/*
1. You are given a string that contains only lowercase and uppercase alphabets.
2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.

   For "abecd", the answer should be "a1b3e-2c1d", as
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1
*/
package pepcoding.string_arraylist;

import java.util.Scanner;

public class String_diff_of_every_two_consecutive_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=0; i<str.length()-1; i++) {
            sb.append(str.charAt(i+1) - str.charAt(i));
            sb.append(str.charAt(i+1));
        }
        return sb.toString();
    }
}
