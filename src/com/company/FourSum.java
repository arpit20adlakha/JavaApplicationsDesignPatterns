package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while(t > 0) {
            t--;
            int n= scanner.nextInt();
            int sum = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            HashMap<Integer, Integer>  map = new HashMap<>();
            Set<String> set = new LinkedHashSet<>();
            List<Quad> quadList = new ArrayList<>();

            for (int i =0; i< arr.length ; i++) {
                map.put(arr[i], i);
            }
            for (int i = 0; i< arr.length; i++) {
                for (int j= i+1 ; j < arr.length; j++) {
                    for(int k = j+1; k < arr.length; k++) {
                        for (int l = k+1; l < arr.length; l++) {
                            if (arr[i] + arr[j] + arr[k] + arr[l] == sum) {
                                int[] sorted = {arr[i], arr[j], arr[k], arr[l]};
                                Arrays.sort(sorted);
                                quadList.add(new Quad(sorted[0], sorted[1], sorted[2], sorted[3]));
                            }
                        }
                    }
                }
            }

            Collections.sort(quadList);
            for (Quad d : quadList) {
                set.add(d.toString());
            }

            for (String s : set) {
                System.out.print(s);
            }
            if (set.size() == 0) {
                System.out.println("-1");
            } else {
                System.out.println();
            }
        }
    }

    static class Quad implements Comparable<Quad> {
        int first;
        int second;
        int third;
        int fourth;

        Quad(int first, int second, int third, int fourth) {
            this.first = first;
            this.second = second;
            this.third = third;
            this.fourth = fourth;
        }

//        @Override
//        public int compare(Quad t1, Quad t2) {
//            if (t1.first == t2.first) {
//                if (t1.second == t2.second) {
//                    if (t1.third == t2.third) {
//                        return t1.fourth - t2.fourth;
//                    } else {
//                        return t1.third - t2.third;
//                    }
//                } else {
//                    return t1.second - t2.second;
//                }
//            } else {
//                return t1.first - t2.first;
//            }
//        }

//        @Override
//        public boolean equals(Object o) {
//            return false;
//        }

        @Override
        public String toString() {
            return String.format("%d %d %d %d $", this.first, this.second, this.third, this.fourth);
        }


        @Override
        public int compareTo(@NotNull FourSum.Quad quad) {
            if (this.first == quad.first) {
                if (this.second == quad.second) {
                    if (this.third == quad.third) {
                        return this.fourth - quad.fourth;
                    } else {
                        return this.third - quad.third;
                    }
                } else {
                    return this.second - quad.second;
                }
            } else {
                return this.first - quad.first;
            }
        }
    }
}
