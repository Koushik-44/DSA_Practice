/*
    Print All Permutations Of A String Iteratively

    Sample Input
    abc

    Sample Output
    abc
    bac
    cab
    acb
    bca
    cba
*/

package pepcoding.string_arraylist;

import java.util.Scanner;

public class AllPermutations_Iteratively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutation(str);
    }

    private static void printPermutation(String str) {
        int fact = getFactorial(str.length());
        for (int i = 0; i < fact; i++) {
            int temp = i;
            StringBuilder sb = new StringBuilder(str);

            for (int k = str.length(); k > 0; k--) {
                int q = temp / k;
                int r = temp % k;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp = q;
            }
            System.out.println();
        }
    }

    private static int getFactorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++)
            ans *= i;
        return ans;
    }
}
