package com.company;

import org.mockito.cglib.core.Local;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;

public class HashMapRelated {


    public static void main(String[] args) {
        Map<String, String> map = Map.of();

        Map<String, String> friendPhones = Map.of(
                "Bob", "+1-202-555-0118",
                "James", "+1-202-555-0220",
                "Katy", "+1-202-555-0175"
        );

        System.out.println(friendPhones);

        System.out.println(friendPhones.size());
        System.out.println(friendPhones.getOrDefault("tap", "I am the default"));
//        friendPhones.putIfAbsent("Bob", "+1-220-333-022");

        System.out.println(map.size());
        System.out.println(friendPhones.keySet());
        System.out.println(friendPhones.values());


        for(Map.Entry k : friendPhones.entrySet()) {
            System.out.println(k);

        }


        Map<Integer, String> products = new HashMap<>();
        products.put(1000, "Notebook");
        products.put(2000, "Phone");
        products.put(3000, "Keyboard");

        System.out.println(products);
        System.out.println(products.get(1000));
        products.remove(1000);
        System.out.println(products.get(1000));
        products.putIfAbsent(3000, "Mouse");

        System.out.println(products.get(3000));

        Map<Integer, String> product = new LinkedHashMap<>();
        product.put(1000, "note");
        product.put(200, "small");
        product.put(20200, "big");
        System.out.println(product);


        SortedMap<LocalDate, String> events = new TreeMap<>();

        events.put(LocalDate.of(2017, 6, 6), "The java conference");
        events.put(LocalDate.of(2017, 6, 7), "Another Java Conference");
        events.put(LocalDate.of(2017, 6, 8), "Discussion: career or education");
        events.put(LocalDate.of(2017, 6, 9), "The modern art");
        events.put(LocalDate.of(2017, 6, 10), "Coffee master class");



        LocalDate fromInclusive = LocalDate.of(2017, 6, 8);
        LocalDate toExclusive = LocalDate.of(2017, 6, 10);

        System.out.println(events.subMap(fromInclusive, toExclusive));


        Map<String, String> friendPhone = Map.of(
                "Bob", "+1-202-555-0188",
                "James", "+1-202-555-0175",
                "Katy", "+1-202-555-0175"
        );

        for(String name : friendPhone.keySet()) {
            System.out.println(name);
        }

        for(String phone: friendPhone.values()) {
            System.out.println(phone);
        }

        for(Map.Entry e :friendPhone.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }

        Map<String, Set<String>> synonyms = new HashMap<>();

        synonyms.put("Do", Set.of("Execute"));
        synonyms.put("Make", Set.of("Set", "Attach", "Assign"));
        synonyms.put("Keep", Set.of("Hold", "Retain"));

        System.out.println(synonyms);

        Map<String, Integer> names = Map.of("John", 30, "Alice", 28);
        Map<String, Integer> names1 = new HashMap<>();

        names1.put("Alice", 28);
        names1.put("John", 30);

        System.out.println(Objects.equals(names, names1));

        String s = "Hadimna";
        Character[] ccc = new Character[] {'2', '3'};


        System.out.println(Arrays.toString(s.chars().sorted().toArray()));




    }


}
