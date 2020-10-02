package MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class HuplaTester {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Integer[] arr = list.toArray(Integer[]::new);
        int[] arr1 = list.stream().mapToInt(integer -> integer).toArray();
        MyClass c = new MyClass();
        Thread t1 = new T1(c);
        Thread t2 = new T2(c);

        t1.start();
        t2.start();
    }
}
