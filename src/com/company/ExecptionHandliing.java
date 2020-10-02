package com.company;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ExecptionHandliing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value;


        while(! "0".equals(value = scanner.next())) {
            try {
                Integer.parseInt(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input: " + value);
            }
        }

        try {
            int a = 12 / 0;
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }


        try {
            Integer.parseInt("abc");
        } catch (Exception e) {
            Integer.parseInt("abc");
            System.out.println("inside catch block");
        } finally {
            System.out.println("inside finally block");
        }
    }
}
