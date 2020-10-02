package com.company;

import java.util.Scanner;

public class hupla {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while(t > 0) {
            t--;
            int n = scanner.nextInt();
            String[] strArray = new String[n];
            for (int i=0; i< n; i++) {
                strArray[i] = scanner.next();
            }
            String smallestString = "";
            int min = Integer.MAX_VALUE;
            for (String s : strArray) {
                if (s.length() < min) {
                    smallestString = s;
                    min = s.length();
                }
            }

            int count = 0;
            int length = 0;
            for (int i = 0; i < smallestString.length(); i++) {
                count = 0;
                for (String s : strArray) {
                    if (s.charAt(i) == smallestString.charAt(i)) {
                        count++;
                    }
                }
                if (count == strArray.length) {
                    length++;
                } else {break;}

            }

            if (length == 0) {
                System.out.println("-1");
            } else {
                System.out.println(smallestString.substring(0, length));
            }

        }
    }
}
