package com.company;

public class climbStairs {
    public static int climbStairs(int n) {
        int [] arr = new int[n+1];
        return climbStairsUtil(n, arr);
    }

    public static int climbStairsUtil(int n, int[] arr) {
        if ( n == 0 || n == 1) {
            return 1;
        } else if(arr[n] != 0 ) {
            return arr[n];
        }
        else {
            arr[n] = climbStairs(n-1) + climbStairs(n-2);
            return  arr[n];
        }
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
