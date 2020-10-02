package com.company;

import java.util.Scanner;

public class TETTE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t > 0) {
            t--;
            String str1 = scanner.next();
            String str2 = scanner.next();

            if (str1.equals(frontRotate(str2)) || str1.equals(backRotate(str2))) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
    }


    private static String frontRotate(String s) {
        return s.substring(s.length() - 2) + s.substring(0, s.length() - 2);
    }

    private static String backRotate(String str2) {
        return  str2.substring(2) + str2.substring(0, 2);
    }
}
