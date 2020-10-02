package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Something {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0) {
            t--;
            String str = scanner.next();
            int maxLength = 0;
            int i = 0;
            int j = 1;
            HashMap<Character, Integer> map = new HashMap<>();

            map.put(str.charAt(i), 0);
            while(j < str.length()) {
                if (map.get(str.charAt(j)) != null) {
                    int index = map.get(str.charAt(j));
                    while(i < j && i <= index) {
                        map.remove(str.charAt(i));
                        i++;
                    }
                }
                map.put(str.charAt(j), j);
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            }
            System.out.println(maxLength);
        }
    }
}
