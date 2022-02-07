package pepcoding.recursion_and_backtracking.the_way_up;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintKPC {
    static Map<Integer, String> map = new LinkedHashMap<>();
    static {
        map.put(0, ".;");
        map.put(1, "abc");
        map.put(2, "def");
        map.put(3, "ghi");
        map.put(4, "jkl");
        map.put(5, "mno");
        map.put(6, "pqrs");
        map.put(7, "tu");
        map.put(8, "vwx");
        map.put(9, "yz");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printKPC(input, "");
    }

    private static void printKPC(String input, String output) {
        if(input.length() == 0)
        {
            System.out.println(output);
            return;
        }

        int k = Integer.parseInt(Character.toString(input.charAt(0)));
        String v = map.get(k);

        for(int i=0; i<v.length(); i++) {
            printKPC(input.substring(1), output+Character.toString(v.charAt(i)));
        }
    }
}
