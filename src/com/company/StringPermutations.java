package com.company;


import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class StringPermutations {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        permuations(treeSet , "abc", 0, "abc".length());
        for(String s : treeSet) {
            System.out.print(s + " ");
        }
    }

    private static void permuations(SortedSet<String> treeSet,  String s, int l, int r) {
        if (l >= r) {
            treeSet.add(s);
        }

        for(int i = l; i < r; i++) {
            s = swap(s, l, i);
            permuations(treeSet, s, l+1, r);
            s = swap(s, l, i);
        }
    }

    private static String swap(String s, int l, int r)  {

        char[] arr = s.toCharArray();
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        return new String(arr);
    }
}
