/*      1. You are given a number n.
        2. You are given a base b1. n is a number on base b.
        3. You are given another base b2.
        4. You are required to convert the number n of base b1 to a number in base b2.

        Input Format
        A number n
        A base b1
        A base b2

        Output Format
        A number of base b2 equal in value to n of base b1.
 */

package pepcoding.function_and_arrays;

import java.util.Scanner;

public class AnyBase_to_AnyBase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int srcBase = sc.nextInt();
        int destBase = sc.nextInt();

        System.out.println(anyBasetoAnyBase(number, srcBase, destBase));
    }

    private static int anyBasetoAnyBase(int number, int srcBase, int destBase) {

        int decival = toDecimal(number, srcBase);
        int result = toDestinationBase(decival, destBase);

        return result;
    }

    private static int toDestinationBase(int decival, int destBase) {
        int ans = 0, multiplier = 1;

        while(decival > 0)
        {
            int rem = decival%destBase;
            decival /= destBase;
            ans = ans + (rem * multiplier);
            multiplier = multiplier * 10;
        }

        return ans;
    }

    private static int toDecimal(int number, int srcBase) {

        int ans = 0, multiplier = 1;

        while(number > 0)
        {
            int rem = number%10;
            number = number/10;
            ans = ans + rem * multiplier;
            multiplier = multiplier * srcBase;
        }
        return ans;
    }

}
