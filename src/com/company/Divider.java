package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Divider {
    public static void divide(int a, int b, Callback callback) {
        if (b == 0) {
            callback.failed("Division by zero !");
            return;
        }
        callback.calculated(a/b);
    }


    int getValue() {
        int returnValue = 10;
        try {
            String[] Languages = {"Java", "Ruby"};
            System.out.println(Languages[5]);
        } catch (Exception e) {
            System.out.println("Catch Block :" + returnValue);
            return returnValue;
        } finally {
            returnValue += 10;
            System.out.println("Finally Block :" + returnValue);
        }
        return returnValue;

    }

    public static void main(String args[])
    {
//
//        String[] arr = {"steing", "srome"};
//
//        Double mod = Math.pow(10, 6) + 3l;
////        Double[] arr = new Double[1000000];
//        Scanner scanner = new Scanner(System.in);
//        Long t  = scanner.nextLong();
//        arr[0] = 1d;
//        for (Integer i=1; i< arr.length;i++) {
//            arr[i] = (arr[i-1]%mod) * (i%mod);
//        }
//        while( t != 0l) {
//            t--;
//            Integer n = scanner.nextInt();
//            Integer x = scanner.nextInt();
//
//            Double answer = x % mod * arr[n];
//            System.out.println(answer.intValue());
//        }

        int[] array = {6,9,8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);
        Divider var = new Divider();
        System.out.println("Main Block:" + var.getValue());
    }

}
