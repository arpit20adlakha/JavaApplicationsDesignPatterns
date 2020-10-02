package com.company;

import java.util.Scanner;


public class Tester {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
        Runnable target;

        target = new PrintingFruitTypesAndThings();
//        while(t > 0) {
//            Thread p = new Thread(target);
//            p.start();
//            t = scanner.nextInt();
//        }

        Thread t1 = new Thread(target);
        t1.start();
        Thread t2  = new Thread(target);
        t2.start();

    }
}
