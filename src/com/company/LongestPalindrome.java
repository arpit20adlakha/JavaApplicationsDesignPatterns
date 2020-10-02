package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class LongestPalindrome {

    public static void main() {
       HashMap<Character, Integer>  charCount = new HashMap<>();
       Scanner scanner = new Scanner(System.in);
       String s = scanner.next();

       for (int i = 0; i < s.length(); i++) {
           charCount.put(s.charAt(i), 1 + charCount.getOrDefault(s.charAt(i), 0));
       }

       boolean isOdd = false;
       int sum = 0;
       for (Character  c : charCount.keySet()) {
            if (charCount.get(c) % 2 == 0) {
                sum += charCount.get(c);
            } else {
                isOdd = true;
                sum += charCount.get(c) - 1;
            }
       }

       if(isOdd) sum += 1;

        System.out.println(sum);
    }
}
