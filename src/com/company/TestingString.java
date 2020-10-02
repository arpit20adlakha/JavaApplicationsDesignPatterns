package com.company;

import java.util.Scanner;

public class TestingString {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer t = scanner.nextInt();

        while(t > 0) {
            t--;
            String inputString = scanner.next();
            String[] arr = inputString.split("\\.");
            String[] newArr = new String[arr.length];

            for (Integer i = 0; i < arr.length; i++) {
                newArr[arr.length-1-i] = arr[i];
            }

            String newString = newArr[0];
            for (Integer i = 1; i < arr.length; i++) {
                newString += "." + newArr[i];
            }

            System.out.println(newString);

        }
    }
}
