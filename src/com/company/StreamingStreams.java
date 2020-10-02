package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamingStreams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while(t > 0) {
            t--;
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n;i++) {
                list.add(scanner.nextInt());
            }

            List<Integer> listEven = list.stream().filter(x -> x%2 == 0).collect(Collectors.toList());


            List<Integer> listOdd = list.stream().filter(x -> x%2 != 0).collect(Collectors.toList());

            listEven.forEach(x -> System.out.print(x + " "));
            listOdd.forEach(x -> System.out.print(x + " "));

        }
    }
}
