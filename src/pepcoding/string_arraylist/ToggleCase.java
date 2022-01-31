/*  Sample Input
    pepCODinG

    Sample Output
    PEPcodINg
*/
package pepcoding.string_arraylist;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toggleCase(str));
    }

    private static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if((int) c >= 65 && (int) c <= 90) {
                sb.append(Character.toLowerCase(c));
            }
            else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}
