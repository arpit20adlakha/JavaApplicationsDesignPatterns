package AdvancedJavaAndGenerics;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add(1, "C");
        System.out.println(list);
        list.remove("B");
        System.out.println(list);
    }
}
