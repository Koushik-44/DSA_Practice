/*
    Sample Input
    3

    Sample Output
    [111, 12, 21, 3]
*/
package pepcoding.recursion_and_backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Stair_Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(stairPath(n));
    }

    private static ArrayList<String> stairPath(int n) {
        if(n <= 0) {
            return new ArrayList<>();
        }
        else if(n == 1)
        {
            ArrayList<String> res = new ArrayList<>();
            res.add("1");
            return res;
        }

        ArrayList<String> res1 = stairPath(n-1);
        ArrayList<String> res2 = stairPath(n-2);
        ArrayList<String> res3 = stairPath(n-3);

        ArrayList<String> myRes = new ArrayList<>();
        for(String s: res1)
            myRes.add("1"+s);
        for(String s: res2)
            myRes.add("2"+s);
        for(String s: res3)
            myRes.add("3"+s);

        //myRes.add(Integer.toString(n));
        return myRes;

    }
}
