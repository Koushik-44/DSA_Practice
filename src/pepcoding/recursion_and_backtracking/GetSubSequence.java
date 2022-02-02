/*  Sample Input
    abc

    Sample Output
    [, c, b, bc, a, ac, ab, abc]
*/

package pepcoding.recursion_and_backtracking;

import java.util.*;


public class GetSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(gss(str));
    }

    private static List<String> gss(String str) {
        if(str.length() == 0) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        List<String> result = gss(ros);

        List<String> myResult = new ArrayList<>();

        for(String s: result) {
            myResult.add(""+s);
            myResult.add(ch+s);
        }
        return myResult;
    }
}
