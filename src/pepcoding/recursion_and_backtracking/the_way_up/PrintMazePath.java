package pepcoding.recursion_and_backtracking.the_way_up;

import java.util.Scanner;

public class PrintMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        printMaze(1, 1, n, m, "");
    }

    private static void printMaze(int sr, int sc, int dr, int dc, String out) {
        if (sr == dr && sc == dc) {
            System.out.println(out);
            return;
        } else if (sr > dr || sc > dc) {
            return;
        }

        printMaze(sr, sc+1, dr, dc, out+"h");
        printMaze(sr+1, sc, dr, dc, out+"v");

    }
}
