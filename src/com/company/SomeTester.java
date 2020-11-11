package com.company;

import java.util.Scanner;

public class SomeTester {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] arr = new int[n][m];
            int[] maxValues = new int[n];
            for (int i = 0; i < n; i++) {
                int count = 0;
                int prev = -1;
                int max = 0;
                for (int j = 0; j < m ; j++) {
                    arr[i][j] = scanner.nextInt();
                    if (arr[i][j] == 0 && prev == 0) {
                        count++;
                    } else if (arr[i][j] == 0) {
                        count = 1;
                        prev = 0;
                    } else {
                        prev = -1;
                        count = 0;
                    }
                    if (max < count) {
                        max = count;
                    }
                }
                maxValues[i] = max;
            }
            int k = scanner.nextInt();
            int i;
            for (i = 0; i < n; i++) {
                if (maxValues[i] >= k) {
                    System.out.println(i + 1);
                    break;
                }
            }

            if (i == n) {
                System.out.println(0);
            }
        }
}
