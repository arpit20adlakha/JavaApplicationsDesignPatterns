package com.company;

import java.util.*;

public class StringSubstring {

    static final int charCount = 256;
    public static String smallestWindow(String S, String P){
        int[] hashS = new int[charCount];
        int[] hashP = new int[charCount];

        for (int i = 0; i < P.length(); i++) {
            hashP[P.charAt(i)]++;
        }

        int start = 0, start_index = -1 , min_len = Integer.MAX_VALUE;
        int count = 0;
        for (int j = 0; j < S.length(); j++) {
            hashS[S.charAt(j)]++;

            if (hashP[S.charAt(j)] != 0 && hashS[S.charAt(j)] <= hashP[S.charAt(j)]) {
                count++;
            }

            if (count == P.length()) {

                while(hashS[S.charAt(start)] > hashP[S.charAt(start)]  || hashP[S.charAt(start)] == 0) {
                    if (hashS[S.charAt(start)] > hashP[S.charAt(start)]) {
                        hashS[S.charAt(start)]--;
                    }
                    start++;
                }


                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }

        if (start_index== -1) {
            return "";
        }
        return S.substring(start_index , start_index + min_len);
    }


    public static void main(String[] args) {
        System.out.println(smallestWindow("timetopractice", "toc"));
    }
}
