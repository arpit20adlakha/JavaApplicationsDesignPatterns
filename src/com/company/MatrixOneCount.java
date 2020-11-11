package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class MatrixOneCount {

    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(1, 3);
        map.put(2, 1);
        map.put(3, 2);
        return arr;
    }

    private LinkedHashMap<Integer, Integer> sortedMap(LinkedHashMap<Integer, Integer> map) {
        LinkedHashMap<Integer, Integer> newMap = new LinkedHashMap<>();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> t1, Map.Entry<Integer, Integer> t2) {
                return t2.getValue() - t1.getValue();
            }
        });

        for (Map.Entry<Integer, Integer> entry : list) {
            newMap.put(entry.getKey(), entry.getValue());
        }
        return newMap;
    }
    public static int numSubmat(int[][] mat) {



        int row = mat.length;
        int col = mat[0].length;

        int[][] dp = new int[row][col];
        int[][] le = new int[row][col];


        for (int i = 0; i < row; i++){
            dp[i][0] = le[i][0] = mat[i][0];

            for (int j = 1; j < col; j++) {
                if (mat[i][j] == 1) {
                    dp[i][j] = le[i][j] = le[i][j-1] + 1;
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dp[i][j] == 0) {
                    continue;
                }
                int k = i - 1;
                for(; k >= 0 && le[k][j] > le[i][j]; k--) {
                    dp[i][j] += le[i][j];
                }
                if(k >= 0) {
                    dp[i][j] += dp[k][j];
                }
                ans += dp[i][j];
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int mat[][] = {{1, 0, 1}, {1, 1, 0}, {1, 1, 0}};
        System.out.println(numSubmat(mat));
    }
}
