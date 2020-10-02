package com.company;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Math.min(2, 4);
        Scanner scanner = new Scanner(System.in);

        Long m = scanner.nextLong();

        Long product = 1l;
        Long n = 1l;

        while(product <= m) {
            product *= ++n;
        }

        System.out.println(n);
    }
}
