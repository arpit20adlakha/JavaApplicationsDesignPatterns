package com.company;

import java.util.HashMap;
import java.util.Map;

public class FunctionalnterfaceImpl {

    private static Func<Long, Long> square = new Func<Long, Long>() {
        @Override
        public Long apply(Long val) {
            return val * val;
        }
    };

    public static int totalFruit(int[] tree) {
        int maxi = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 1;
        int removalKey = -1;
        map.put(tree[0], 1);
        for (int j = 1; j < tree.length; j++) {
            count ++;
            if (tree[j] != tree[j-1]) {
                if (map.size() < 2) {
                    map.put(tree[j], 1);
                } else if (map.get(tree[j]) != null) {
                    map.put(tree[j], 1 + map.get(tree[j]));
                } else {
                    for (Integer v : map.keySet()) {
                        if (v != tree[j-1]) {
                            count -= map.get(v);
                            removalKey = v;
                        }
                    }
                    map.remove(removalKey);
                    map.put(tree[j], 1);
                }
            } else {
                map.put(tree[j], map.get(tree[j]) + 1);
            }

            maxi = Math.max(count, maxi);
        }

        return maxi;
    }

    public static void main(String[] args) {
        int[] tree = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(totalFruit(tree));
//        Func<Long, Long> pquare = val -> val* val;
//        long vaq = square.apply(9L);
//        System.out.println(vaq);
//        long val = square.apply(10L);
//        System.out.println(val);
    }



}
