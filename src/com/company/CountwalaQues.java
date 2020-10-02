package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountwalaQues {
    public static void main(String[] args) {

        int piggybankCount = 0;

        Integer[] arr = {4, 6, 6, 6, 8, 1, 1};


        Set<Integer> s = new HashSet<Integer>();

        for (int i  = 0; i < arr.length; i++) {
            int number = arr[i];
            while (s.contains(number)) {
                number += 1;
                piggybankCount++;
            }
            s.add(number);
        }
        System.out.println(piggybankCount);
    }
}
