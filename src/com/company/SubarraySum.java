package com.company;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {

    public static void main(String[] args) {
        int[] a = {15,-2,2,-8,1,7,10,23};
        int maxlen = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < a.length ; i++) {
            sum += a[i];
            if (sum == 0) {
                maxlen = Math.max(maxlen, i + 1);
            } else if (map.get(sum) == null) {
                map.put(sum, i);
            }
            else {
                maxlen = Math.max(maxlen, i - map.get(sum));
            }
        }
    }
}
