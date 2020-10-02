package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MeetingRoomScheduling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while(t-- > 0) {
            int n = scanner.nextInt();
            Pair[] timing = new Pair[n];
            int time = 0;
            for (int i = 0; i < n ;i++) {
                 time = scanner.nextInt();
                 timing[i] = new Pair(time, 0, i);
            }
            for (int i = 0; i< n; i++) {
                 time = scanner.nextInt();
                 timing[i].end = time;
            }

            Arrays.sort(timing, new comparatorPair());


            System.out.println(timing[0].index + 1);

            int lastScheduledEndTime = timing[0].end;

            for (int i=1; i < timing.length ; i++) {
                 if (timing[i].start >= lastScheduledEndTime) {
                     lastScheduledEndTime = timing[i].end;
                     System.out.print(timing[i].index + 1 + " ");
                 }
            }
            System.out.println();
        }
    }





    public static class Pair {
        int start;
        int end;
        int index;

        public Pair(int start, int end, int index) {
            this.start = start;
            this.end = end;
            this.index = index;
        }

    }

    public static class comparatorPair implements Comparator<Pair> {
        @Override
        public int compare(Pair t1, Pair t2) {
                return t1.end - t2.end;
        }
    }

}
