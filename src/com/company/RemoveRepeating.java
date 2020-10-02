package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveRepeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        while(t > 0) {
            t--;

            String str = scanner.nextLine();

            HashSet<Character> set = new LinkedHashSet<>();

            for (int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i));
            }

            for(Character i : set) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
