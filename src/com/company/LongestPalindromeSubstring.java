package com.company;

import java.util.Scanner;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        int len = s.length();
        int maxLen = 0;
        String m = "";
        for (int mid = 0; mid < len; mid++) {
            for (int x = 1 ; mid - x >= 0  && x + mid < len; x++ ) {
                 if (s.charAt(mid - x) == s.charAt(mid + x)) {
                     int currentLen = 2 * x + 1;
                     if (currentLen > maxLen) {
                         m = s.substring(mid - x, mid + x + 1);
                         maxLen = currentLen;
                     }
                 }
            }
        }

        for (int mid = 0; mid < len; mid++) {
            for (int x = 1; x + mid < len && mid - x >= 0 ; x++) {
                if (s.charAt(mid-x+1) == s.charAt(mid+x)) {
                    int currentLen = 2 * x + 1;
                    if (currentLen > maxLen) {
                        m = s.substring(mid-x +1, mid+ x +1);
                    }
                }
            }
        }


        System.out.println(m);
    }
}
