package com.company;

import javafx.beans.Observable;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.TreeMap;

public class AbsolutHasing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while(t > 0) {
            t--;
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arrn = new int[n];
            int[] arrm = new int[m];
            for (int i= 0; i< n ; i++) {
                arrn[i] = scanner.nextInt();
            }
            for (int i= 0; i< m ; i++) {
                arrm[i] = scanner.nextInt();
            }
            genericPrinterClass<Integer>  g = new genericPrinterClass<>();
            TreeMap<Integer, Integer> map = new TreeMap<>();

            for (int i : arrn) {
                map.put(i, 1 + map.getOrDefault(i, 0));
            }

            for (int i : arrm) {
//                Optional<Integer> o = Optional.ofNullable();
                if (map.get(i) != null) {
                    g.genericPrinter(i,map.get(i));
                }
                map.remove(i);
            }
            for( Integer key : map.keySet()) {
                map.get(key);
                g.genericPrinter(key, map.get(key));
            }
            System.out.println();
        }
    }
}
