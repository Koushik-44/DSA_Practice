/*
    Sample Input
    2
    2

    Sample Output
    [h1v1, v1h1, d1]
*/
package pepcoding.recursion_and_backtracking.array_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Maze_Path_Jumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(mazePathJumps(1,1,n,m));
    }

    private static ArrayList<String> mazePathJumps(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            ArrayList<String> bRes = new ArrayList<>();
            bRes.add("");
            return bRes;
        }
        else if(sr > dr || sc > dc){
            ArrayList<String> bRes =  new ArrayList<>();
            return bRes;
        }

        ArrayList<String> myRes = new ArrayList<>();

        //for horizontal move
        for (int i = 1; i <= dc - sc; i++) {
            ArrayList<String> hRes = mazePathJumps(sr, sc + i, dr, dc);
           // System.out.println("Val i = " + i + " ----> " + hRes);
            for (String s : hRes)
                myRes.add("h" + i + s);
        }

        //for vertical move
        for (int i = 1; i <= dr - sr; i++) {
            ArrayList<String> vRes = mazePathJumps(sr + i, sc, dr, dc);
           // System.out.println("Val i = " + i + " ----> " + vRes);
            for (String s : vRes)
                myRes.add("v" + i + s);
        }

        //for diagonal move
        for(int i=1; i<=dr-sr && i<=dc-sc; i++) {
            ArrayList<String> dRes = mazePathJumps(sr+i, sc+i, dr, dc);
            for(String s: dRes)
                myRes.add("d"+i+s);
        }
        return myRes;
    }
}
