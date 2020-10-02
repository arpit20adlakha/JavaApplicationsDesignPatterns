package com.company;

import java.util.*;

public class FrequencyBasedSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t > 0) {
            t--;
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i=0; i < n; i++) {
                arr[i]= scanner.nextInt();
            }

            Map<Integer, Integer> map = new HashMap<>();
            for (int i=0; i< n; i++) {
                map.put(arr[i], 1 + map.getOrDefault(arr[i], 0));
            }
            HashMap<Integer, Integer> newMap = sortMapBasedOnValue(map);
            genericPrinterClass<Integer> p  = new genericPrinterClass<>();
            for (Map.Entry<Integer, Integer> e : newMap.entrySet()) {
                   p.genericPrinter(e.getKey(), e.getValue());
            }
            System.out.println();
        }
    }

    private static  HashMap<Integer, Integer>  sortMapBasedOnValue(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                if (entry1.getValue().equals(entry2.getValue())) {
                    return entry1.getKey() - entry2.getKey();
                }
                return entry2.getValue() - entry1.getValue();
            }
        });

        HashMap<Integer, Integer>  mao = new LinkedHashMap<>();

        for (Map.Entry<Integer, Integer> e : list) {
            mao.put(e.getKey(), e.getValue());
        }
        return mao;
    }
}
