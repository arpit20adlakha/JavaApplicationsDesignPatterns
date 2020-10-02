package com.company;

import java.util.Scanner;

public class GFG {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);

            long t = scanner.nextInt();

            while(t > 0) {
                t--;

                int n = scanner.nextInt();
                long[] arr = new long[n];
                long[] rightMax = new long[n];
                long[] leftMax = new long[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextLong();
                }

                long left = arr[0];
                for (int i = 1; i < n ; i++) {
                    if (arr[i] > left) {
                        left = arr[i];
                    }
                    leftMax[i] = left;
                }

                long right = arr[n-1];
                for (int i= n-2; i >= 0; i--) {
                    if (arr[i] > right) {
                        right = arr[i];
                    }

                    rightMax[i] = right;
                }

                long totalWater = 0;
                for (int i = 0; i< n; i++) {
                    long difference = Math.min(leftMax[i], rightMax[i]) - arr[i];
                    long heightDiff = difference > 0 ? difference : 0;
                    totalWater += heightDiff;
                }
                System.out.println(totalWater);
            }
        }
}

