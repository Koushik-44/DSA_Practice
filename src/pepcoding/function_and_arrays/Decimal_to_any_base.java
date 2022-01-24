/*      1. You are given a decimal number n.
        2. You are given a base b.
        3. You are required to convert the number n into its corresponding value in base b.
        Input Format
        A number n
        A base b
        Output Format
        A number representing corresponding value of n in number system of base b

 */
package pepcoding.function_and_arrays;

import java.util.Scanner;

public class Decimal_to_any_base {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int base = sc.nextInt();

        System.out.println(convertToAny(number, base));
    }

    private static int convertToAny(int number, int base) {

        int ans = 0, multiplier = 1;

        while(number > 0)
        {
            int rem = number%base;
            number = number/base;
            ans = ans + rem*multiplier;
            multiplier = multiplier * 10;  //as actual number base is decimal(10)
        }

        return ans;
    }
}
