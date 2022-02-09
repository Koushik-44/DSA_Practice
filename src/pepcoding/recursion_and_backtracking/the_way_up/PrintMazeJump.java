package pepcoding.recursion_and_backtracking.the_way_up;

import java.util.Scanner;

public class PrintMazeJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        printMazeJump(1, 1, n, m, "");
    }

    private static void printMazeJump(int sr, int sc, int dr, int dc, String output) {
        if (sr == dr && sc == dc) {
            System.out.println(output);
            return;
        } else if (sr > dr || sc > dc) {
            return;
        }

        //Horizontal Move
        for(int i=1; i<=dc-sc; i++) {
            printMazeJump(sr, sc+i, dr, dc, output+"h"+i);
        }

        //Vertical Move
        for(int i=1; i<=dr-sr; i++) {
            printMazeJump(sr+i, sc, dr, dc, output+"v"+i);
        }

        //Diagonal Move
        for(int i=1; i<=dc-sc && i<= dr-sr; i++) {
            printMazeJump(sr+i, sc+i, dr, dc, output+"d"+i);
        }
    }
}
