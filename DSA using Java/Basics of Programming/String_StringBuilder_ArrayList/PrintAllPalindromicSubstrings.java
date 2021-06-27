
/**
 * 1. You are given a string. 
 * 2. You have to print all palindromic substrings of the given string.
 */

import java.util.*;

public class PrintAllPalindromicSubstrings {
    public static boolean isPalindrome(String str) {
        int len = str.length();
        if (len == 1)
            return true;
        int i = 0, j = len - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void solution(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substr = str.substring(i, j);
                if (isPalindrome(substr)) {
                    System.out.println(substr);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
        scn.close();
    }

}

// abcd

// a
// ab
// abc
// abcd

// b
// bc
// bcd

// c
// cd

// d
