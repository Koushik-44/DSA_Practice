package pepcoding.recursion_and_backtracking.the_way_up;

import java.util.Scanner;

public class PrintStairPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printStair(n,"");
    }

    private static void printStair(int n, String path) {
        if(n == 0)
        {
            System.out.println(path);
            return;
        }
        else if(n < 0)
            return;

        printStair(n-1, path+Integer.toString(1));
        printStair(n-2, path+Integer.toString(2));
        printStair(n-3, path+Integer.toString(3));
    }
}
