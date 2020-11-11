package MultiThreading;

import java.time.LocalDate;
import java.util.*;

public class NeedOfConcurrentCollectionsDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, Integer> map = new LinkedHashMap<>(3, 0.75f, true) {
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > 3;
        }
        };

        map.put(3,4);
        map.put(5, 6);
        map.put(7, 8);
        map.get(5);
        print(map);

//        Queue<Integer> q = new PriorityQueue<Integer>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer integer, Integer t1) {
//                return 0;
//            }
//        });
//        Deque<Integer> dq = new LinkedList<>();
//        Deque<Integer> deque = new ArrayDeque<>();
        Queue<Integer> deque1 = new PriorityQueue<Integer>();
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        Thread writer = new Thread(() -> addNumbers(numbers));
//        writer.start();
//        addNumbers(numbers);
//        writer.join();
//
//        System.out.println(numbers.size());
    }

    private static void addNumbers(ArrayList<Integer> target) {
        for(int i = 0; i < 100_000; i++) {
             target.add(i);
        }
    }

    private static void print(Map<Integer, Integer> map) {
        for (Integer k : map.keySet()) {
            System.out.println(k);
        }
    }
}
