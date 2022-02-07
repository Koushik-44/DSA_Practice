/*
    1. You are given a number n and a number m representing number of rows and columns in a maze.
    2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
    3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
    Use sample input and output to take idea about output.

    Sample Input
    3
    3

    Sample Output
    [hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
*/
package pepcoding.recursion_and_backtracking.array_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Maze_Path {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int sr = 0; //source row
        int sc = 0; //source column
        int dr = 0; //dest row
        int dc = 0; //dest column

        if (n == m) {
            dr = dc = n - 1;
        } else {
            dr = n - 1;
            dc = m - 1;
        }
        System.out.println(getMazePaths(sr, sc, dr, dc));
    }

    private static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            ArrayList<String> bRes = new ArrayList<>();
            bRes.add("");
            return bRes;
        }
        ArrayList<String> hRes = new ArrayList<>();
        ArrayList<String> vRes = new ArrayList<>();

        if(sc < dc) {
            hRes = getMazePaths(sr, sc+1, dr, dc);
        }
        if(sr < dr) {
            vRes = getMazePaths(sr+1, sc, dr, dc);
        }

        ArrayList<String> newRes = new ArrayList<>();
        for (String s : hRes)
            newRes.add("h" + s);
        for (String s : vRes)
            newRes.add("v" + s);
        return newRes;
    }
}
