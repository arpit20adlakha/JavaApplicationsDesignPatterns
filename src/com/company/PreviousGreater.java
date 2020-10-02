package com.company;

import java.util.Arrays;
import java.util.Stack;

public class PreviousGreater {


    public static void main(String[] args) {
//        int arr[]= {10, 4 , 2, 20, 40, 12, 30};
        int arr[] = {40, 30, 20, 10};
        Stack<Integer> s = new Stack<>();
        int[] newarr = new int[arr.length];
        s.push(arr[0]);
        newarr[0] = -1;
        for (int i=1 ; i< arr.length ; i++) {
                if (s.peek() > arr[i]) {
                    newarr[i] = s.peek();
                    s.push(arr[i]);
                } else if (s.peek() < arr[i])  {
                    while(!s.isEmpty() && s.peek() < arr[i]) {
                        s.pop();
                    }
                    if (s.isEmpty()) {
                        newarr[i] = -1;
                    } else {
                        newarr[i] = s.peek();
                    }
                    s.push(arr[i]);
                }
        }

        String finalString = Arrays.toString(newarr).replaceAll("," , " ");

        System.out.println(finalString.substring(1, finalString.length() - 1));
    }
}
