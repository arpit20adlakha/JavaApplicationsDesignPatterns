package com.company;

import java.util.*;

public class SetRelated {

    public static void main(String[] args) {
        Set<Integer> s = Set.of(1, 2, 4);
        Set<String>  s1 = new HashSet<>();
        s1.add("hashim");
        s1.add("put");

        System.out.println(s1.contains("put"));
        System.out.println(s1);

        SortedSet<Integer> s2 = new TreeSet<>();
        s2.add(3);
        s2.add(5);
        s2.add(1);
        s2.add(20);
        s2.add(20);
        s2.add(40);

        s2.first();
        System.out.println(s2.headSet(15));
        System.out.println(s2.first());
        System.out.println(s2.last());
        System.out.println(s2.subSet(1, 40));
        System.out.println(s2.tailSet(5));
        s2.forEach(System.out::println);



        Set<Character> characters = new LinkedHashSet<>();

        for (char c='a'; c <= 'k'; c++) {
            characters.add(c);
        }

        System.out.println(characters);


        Set<String> countries = new HashSet<>(List.of("India", "Japan", "Switzerland"));

        countries.addAll(List.of("India", "Germany", "Algeria"));
        System.out.println(countries);
        countries.retainAll(List.of("Italy", "Japan", "India", "Germany"));
        System.out.println(countries);

//        countries.removeAll(List.of("Japan", "Germany", "USA"));
//        System.out.println(countries);




        System.out.println(countries.containsAll(List.of("India", "Germany")));

        System.out.println(countries.containsAll(Set.of("India", "Japan")));


        Set<Integer> integerSet = new HashSet<>(List.of(1, 2, 3));

        Set<Integer> anotherSet = new LinkedHashSet<>(List.of(1, 2, 3));

        System.out.println(integerSet.equals(anotherSet));
        System.out.println(Objects.equals(integerSet, anotherSet));


    }
}
