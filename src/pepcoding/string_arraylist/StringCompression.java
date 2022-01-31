package pepcoding.string_arraylist;

import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(compression1(line));
        System.out.println(compression2(line));
    }

    private static String compression2(String line) {
        String str = "";
        for(int i=0; i<line.length(); i++) {
            str += line.charAt(i);
            int count = 1;

            while((i < line.length()-1) && line.charAt(i) == line.charAt(i+1)) {
                i++;
                count++;
            }
            if(count > 1) {
                str += count;
            }
        }
        return str;
    }

    public static String compression1(String s) {
        String ans = "";
        for (int i = 0 ; i < s.length(); i++) {
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                i++;
            }
            ans += s.charAt(i);
        }
        return ans;
    }

//    private static String compression1(String line) {
//        String str = "";
//
//        str += line.charAt(0);
//
//        for(int i=1; i<line.length(); i++) {
//            while((i < line.length()-1) && line.charAt(i) == line.charAt(i-1)) {
//                i++;
//            }
//            if(i == line.length()-1) {
//                if(line.charAt(i) != line.charAt(i-1)) {
//                    str += line.charAt(i);
//                    break;
//                }
//                else {
//                    break;
//                }
//            }
//            str += line.charAt(i);
//        }
//
//        return str;
//    }
}
