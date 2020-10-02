package com.company;

import java.util.Scanner;

public class putts {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
	    while(t > 0) {
        t--;
        String s = scanner.next();
        int max = 0;
        String str = "";
        for (int i=0; i<s.length() ; i++) {
            int l = i;
            int r = i+1;
            String even = checkForEvenLengthPlaindrome(s, l, r);
            String odd = checkForOddLengthPalindrome(s, l-1, r);
            int newMax = Math.max(even.length(), odd.length());
            if (newMax > max) {
                max = newMax;
                if (newMax == even.length()) {
                    str = even;
                } else {
                    str = odd;
                }
            }
        }
        System.out.println(str);
    }
    }

    private static String checkForOddLengthPalindrome(String s, int l , int r) {
        while(l>=0 && r< s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l+1, r);
    }

    private static String checkForEvenLengthPlaindrome(String s, int l, int r) {
        while(l>=0 && r< s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l+1, r);
    }
}
