package com.company;

import java.util.Scanner;

public class Testing124 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Divider.divide(a, b, new Callback() {
            @Override
            public void calculated(int result) {
                String textToPrint = String.format("%d / %d is %d", a, b, result);
                System.out.println(textToPrint);
            }

            @Override
            public void failed(String errorMSg) {
                System.out.println(errorMSg);
            }
        });
    }
}
