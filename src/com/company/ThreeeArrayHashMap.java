package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThreeeArrayHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t > 0) {
            t--;
            int flag = 0;
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int p = scanner.nextInt();

            Map<Integer, Integer> map = new LinkedHashMap<>();
            Map<Integer, Integer> map2 = new LinkedHashMap<>();
            Map<Integer, Integer> map3 = new LinkedHashMap<>();
            streamAndPutInMap(scanner, map, n);
            streamAndPutInMap(scanner, map2, m);
            streamAndPutInMap(scanner, map3, p);

            for (int key : map.keySet()) {
                if (map.containsKey(key) && map2.containsKey(key) && map3.containsKey(key)) {
                    if (map.get(key) >= 1 && map2.get(key) >= 1 && map3.get(key) >= 1) {
                        flag = 1;
                        System.out.print(key + " ");
                    }
                }
            }
            if (flag == 0) {
                System.out.println(-1);
            } else {
                System.out.println();
            }
        }
    }


    private static void streamAndPutInMap(Scanner scanner, Map<Integer, Integer> map, int length) {

        for (int i = 0; i < length; i++) {
            int input = scanner.nextInt();
            map.put(input, 1 + map.getOrDefault(input, 0));
        }
    }
}
