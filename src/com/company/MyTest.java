package com.company;

public class MyTest {


    public static boolean detectCapitalUse(String word) {
        char[] c = word.toCharArray();
        int q = 'Z';
        int smallCount = 0;
        int largeCount = 0;
        for (int i=0; i < word.length(); i++) {
            if (Character.isUpperCase(c[i])) {
                largeCount++;
            } else {
                smallCount++;
            }
        }

        if (largeCount == 1 ) {
            return Character.isUpperCase(c[0]);
        }

        if (largeCount == word.length() || smallCount == word.length()) {
            return true;
        }

        return false;
    }



    public static void main(String[] args) {
        System.out.println(detectCapitalUse("FlaG"));
    }
}
