package com.company;

import java.util.HashMap;

public class Gamescraft {

    private static void permutations(String input, int left, int right) {
        if (left == right) {
            System.out.println(input);
        }
        else {
            for (int i = left; i <= right; i++) {
                input = swap(input, left, i);
                permutations(input, left + 1, right);
                input = swap(input, left, i);
            }
        }
    }

    private static void nonRepeating(String input) {
        HashMap<Character, Integer>  map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            map.put(input.charAt(i), 1+ map.getOrDefault(input.charAt(i), 0));
        }

        for (int i = 0; i < input.length(); i++) {
            if (map.get(input.charAt(i)) == 1) {
                System.out.println(input.charAt(i));
                break;
            }
        }

    }

    private static String swap(String input, int i, int j) {
        char temp;

        char[] arr = input.toCharArray();

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return String.valueOf(arr);
    }



    public static void main(String[] args) {
//        String s = "abc";
//        permutations(s, 0, s.length() -1);

        String input = "ababdx";
        nonRepeating(input);
    }

}
