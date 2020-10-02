package com.company;

import java.util.*;

public class mm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int count = 0;
        List<Integer> indexes = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        if (list.size() == 1) {
            System.out.println(1);
            System.out.println(0);
        } else {
            String pattern = list.get(0);
            String sub = list.get(1);
            Integer totalLegth = 0;
            while (sub.length() > 0 && sub.indexOf(pattern) >= 0) {
                count++;
                Integer index = sub.indexOf(pattern);
                indexes.add(index + totalLegth);
                Integer struckOutLength = index + 1;
                totalLegth += struckOutLength;

                sub = sub.substring(struckOutLength);
            }
            System.out.println(count);
            indexes.forEach(item -> System.out.print(item));

        }
    }
}
