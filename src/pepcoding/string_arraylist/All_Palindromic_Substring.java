package pepcoding.string_arraylist;

import java.util.Scanner;

//for git purpose line 1;
//for git Line 2;
// for merge test (master)
//hsfdjfkfks.jsdk
//xgchjvkjdshvjkxvdbfbfbfbh
//Koushik

public class All_Palindromic_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        printPalindrome(line);
    }

    private static void printPalindrome(String line) {

        for(int i=0; i<line.length(); i++) {
            for(int k=i+1; k<=line.length(); k++) {
                if(isPalindrome(line.substring(i, k))) {
                    System.out.println(line.substring(i, k));
                }
            }
        }
    }

    private static boolean isPalindrome(String substring) {
        int beg = 0;
        int end = substring.length()-1;

        while(beg < end) {
            if(substring.charAt(beg) != substring.charAt(end))
                return false;
            beg++;
            end--;
        }
        return true;
    }
}
