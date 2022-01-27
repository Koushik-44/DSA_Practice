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

        int ans = 0, carry = 0, multiplier = 1;

        while(n2 > 0)
        {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int digit = 0;
            d2 = d2 + carry;

            if(d2 >= d1) {
                carry = 0;
                digit = d2 - d1;
            }
            else{
                carry = -1;
                digit = d2 + base - d1;
            }

            ans = ans + digit*multiplier;
            multiplier = multiplier * 10;

            n1 /= 10;
            n2 /= 10;
        }
        return ans;
    }
}


