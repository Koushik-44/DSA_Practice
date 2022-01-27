/*  1. You are given a base b.
    2. You are given two numbers n1 and n2 of base b.
    3. You are required to subtract n1 from n2 and print the value.
    
    Input Format
    A base b
    A number n1
    A number n2
    
    Output Format
    A number of base b equal in value to n2 - n1.
*/


package pepcoding.function_and_arrays;

import java.util.Scanner;

public class AnyBaseSubtraction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(anyBaseSub(b, n1, n2));
    }

    private static int anyBaseSub(int base, int n1, int n2) {

        int ans = 0, carry = 0, multiplier = 1, flag = 0;

        while(n1 > 0 || n2 > 0 || carry != 0)
        {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            if (d2 + carry < d1) {
                flag = 1;
                d2 = d2 + base;
            } else
                flag = 0;

            ans = ans + (d2 + carry - d1) * multiplier;

            if (flag == 1)
                carry = -1;
            else
                carry = 0;


            multiplier = multiplier * 10;

            n1 /= 10;
            n2 /= 10;
        }
        return ans;
    }
}
