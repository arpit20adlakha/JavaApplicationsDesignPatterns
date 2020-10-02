package LeetCodeHardCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratingAllSubsets {

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8};
        ArrayList<Integer>[] arrayLists = new ArrayList[1 << arr.length];

        for (int mask = 0; mask < (1 << arr.length); mask++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if ((mask & (1 << i)) > 0) {
                    list.add(arr[i]);
                }
            }
            arrayLists[mask] = list;
        }

        printList(arrayLists);
    }


    private static void printList(List<Integer>[] arrLists) {
        for (int i = 1; i < arrLists.length; i++) {
            System.out.println(Arrays.toString(arrLists[i].stream().toArray(Integer[]:: new)));
        }
    }
}
