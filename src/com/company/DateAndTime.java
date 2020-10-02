package com.company;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class DateAndTime {

    OffsetDateTime currentTime ;
    LocalDateTime localDateTime;

    DateAndTime(OffsetDateTime currentTime, LocalDateTime localDateTime) {
        this.currentTime = currentTime;
        this.localDateTime = localDateTime;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6, 7};
//        List<Integer> list = List.of(arr);
//        System.out.println(Collections.binarySearch(list, 6));
        System.out.println(binarySearch(arr, 1));
//        DateAndTime dateAndTime = new DateAndTime(OffsetDateTime.of());

//        System.out.println(dateAndTime.currentTime);
    }


    private static boolean binarySearch(int[] array, int key) {
        return binarySearchUtil(array, 0, array.length -1 , key);
    }



    private static boolean binarySearchUtil(int [] inputArray, int low, int high, int searchKey) {
        boolean left = false;
        boolean right = false;

        if (low >= high) {
            if (inputArray[low] == searchKey) {
                return true;
            } else {
                return false;
            }
        }

        int mid = low + ((high - low) / 2);
        System.out.println(inputArray[mid]);
        if (inputArray[mid] > searchKey) {
           left =  binarySearchUtil(inputArray, low, mid-1, searchKey);
        } else if (inputArray[mid] < searchKey) {
           right =  binarySearchUtil(inputArray, mid +1 , high, searchKey);
        } else if (inputArray[mid] == searchKey) {
            return true;
        }
        return left || right;

    }

}
