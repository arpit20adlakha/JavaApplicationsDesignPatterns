package com.company;

public class AllSubstringsOfAString {
    private static String s = "atgfef";
    public static void main(String[] args) {
        int len = s.length();
        for (int l= 0; l < s.length(); l++) {
            for (int r = l; r < s.length(); r++) {
                System.out.println( s.substring(l, r+1));
            }


        }
    }



    private static boolean isPalindrome(String s) {
        return true;
    }

}
