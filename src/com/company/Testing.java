package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Testing {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        long count = 0;
        long max = 0;

        long keyMax = 0;
        Map<Long, Long> map = new TreeMap<>();

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            count++;

            if (number >= keyMax) {
                keyMax = number;
                if (map.get(number) != null) {
                    max = map.get(number) + 1;
                    map.put(number, map.get(number) + 1);
                } else {
                    max = 1;
                }
            }
        }

        System.out.println("Total Numbers: " + count);
        System.out.println("The greatest number: " + keyMax + " (" + max + " time(s))");
    }
}
