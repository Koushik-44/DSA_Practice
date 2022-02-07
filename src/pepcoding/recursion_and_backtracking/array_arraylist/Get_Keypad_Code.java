/*        1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
        2. The following list is the key to characters map :

        0 -> .;
        1 -> abc
        2 -> def
        3 -> ghi
        4 -> jkl
        5 -> mno
        6 -> pqrs
        7 -> tu
        8 -> vwx
        9 -> yz

        Sample Input
        78
        Sample Output
        [tv, tw, tx, uv, uw, ux]
 */
package pepcoding.recursion_and_backtracking.array_arraylist;

import java.util.*;

public class Get_Keypad_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(get_kpc(input));
    }

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

    private static ArrayList<String> get_kpc(String input) {
        if(input.length() == 0) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }

        ArrayList<String> prevRes = get_kpc(input.substring(0,input.length()-1));
        int key = Integer.parseInt(""+input.charAt(input.length()-1));
        String val = map.get(key);

        ArrayList<String> newRes = new ArrayList<>();

        for(String s: prevRes) {
            for(int k=0; k<val.length(); k++) {
                newRes.add(s+val.charAt(k));
            }
        }
        return newRes;
    }
//    private static ArrayList<String> get_kpc(String input) {
//        if (input.length() == 1) {
//            int val0 = Integer.parseInt(input);
//            ArrayList<String> result = new ArrayList<>();
//            String in0 = map.get(val0);
//            for (int i = 0; i < in0.length(); i++) {
//                result.add("" + in0.charAt(i));
//            }
//            return result;
//        }
//
//        int val1 = Integer.parseInt(input);
//        String in1 = map.get(val1 / 10);
//        ArrayList<String> prevRes = get_kpc(Integer.toString(val1 % 10));
//        //System.out.println("Previous : " + prevRes);
//
//        ArrayList<String> newRes = new ArrayList<>();
//
//        for (int k = 0; k < in1.length(); k++) {
//            for (String s : prevRes) {
//                newRes.add(""+in1.charAt(k)+s);
//            }
//        }
//
//        return newRes;
//    }
}
