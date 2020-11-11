package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] nums = {-7, -8, 7, 5, 7, 1, 6, 0};

        int [] values = {-1202,7068,-2705,3159,-398,786,5303,-9662,-109,-5256,4650,8345,2669,1465,-3552,5347,181,4830,-1018,-8237,-4305,4968,-1000,6762,-6620,-3714,6598,5681,4205,-4229,3879,-7038,-843,-9542,-8565,7175,-9772,-6923,-7681,46,-465,7551,-4129,7320,3035,9862,4845,-2688,3629,39,-3393,-1293,-3529,4773,-1466,-5074,2726,-8191,3948,3314,9705,3260,-1051,-3748,-2317,-5500,-2683,3465,3661,282,811,9982};
        System.out.println(values.length);
        int k = 3;
        int[] answer =  maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(answer));
    }

    private static  int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        int length = nums.length;
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0; i < k; i++) {

           if (nums[i] > max) {
               max = nums[i];
               maxIndex = i;
           }
        }
        arrayList.add(max);
        for (int i = maxIndex ; i< k ; i++)
            deque.addLast(i);
        for (int i = k; i < length; i++) {
            if (deque.peekFirst() == i - k)
                deque.pollFirst();

             while (deque.size() > 0 && nums[i] >= nums[deque.peekLast()]) {
                 deque.pollLast();
             }

             deque.addLast(i);
             arrayList.add(nums[deque.peekFirst()]);
        }


        int [] arr1 = arrayList.stream().mapToInt(x -> Integer.valueOf(x)).toArray();
//        int [] arr = new int[arrayList.size()];
//        int j = 0;
//        for(int number : arrayList) {
//            arr[j++] = number;
//        }

        return arr1;
    }
}
