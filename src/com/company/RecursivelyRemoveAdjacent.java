package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RecursivelyRemoveAdjacent {

    private static String removeDuplicates(String str) {
        int i=0;
        List<Character> list = new ArrayList<>();
        while(i < str.length()) {
            if (i < str.length() -1  && str.charAt(i) == str.charAt(i+1)) {
                while (i < str.length() -1 && str.charAt(i) == str.charAt(i + 1)) {
                    i++;
                }
            } else {
                list.add(str.charAt(i));
            }
            i++;
        }

        Character[] arr = list.stream().toArray(Character[]::new);
        Stream<Character> stream = Arrays.stream(arr);
        String string = stream.map(String::valueOf).collect(Collectors.joining());

        return string;
    }
    public static void main(String[] args) {
        String s = "acaaabbbbacdd";

        String p = s;
        s = removeDuplicates(s);
        while(s.length() != p.length()) {
            p = s;
            s = removeDuplicates(s);
        }

        System.out.println(s);
    }


}
