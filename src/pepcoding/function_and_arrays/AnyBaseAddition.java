/*
    1. You are given a base b.
    2. You are given two numbers n1 and n2 of base b.
    3. You are required to add the two numbes and print their value in base b.

    Input Format
    A base b
    A number n1
    A number n2

    Output Format
    A number representing the sum of n1 and n2 in base b.
*/

package pepcoding.function_and_arrays;

import java.util.Scanner;

public class AnyBaseAddition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, n1, n2;

        base = sc.nextInt();
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println(anyBaseAdd(base, n1, n2));
    }

    private static int anyBaseAdd(int base, int n1, int n2) {
        int ans = 0, carry = 0, multiplier = 1;

        while (n1 > 0 || n2 > 0 || carry != 0) {

            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int sum = d1 + d2 + carry;
            ans = ans + (sum % base) * multiplier;
            carry = sum / base;

            multiplier = multiplier * 10;

            n1 /= 10;
            n2 /= 10;

        }

        return ans;
    }
}
