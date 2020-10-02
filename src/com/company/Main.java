package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    int a;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        // put your code here
        String output = "YES";

        if (Math.abs(x1) == Math.abs(x2) || Math.abs(y1) == Math.abs(y2)) {
            System.out.println("YES");
        } else if (x1-x2 == y1-y2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        String string = "harami toh tum ho";

        String[] elements = string.trim().split(" ");

        List<String> newList5 = Arrays.asList(elements);
        System.out.println(newList5);



        String q = "tapzo";

        List<Character> abc = q.chars().mapToObj( c-> (char)c).collect(Collectors.toList());
        Collections.reverse(abc);
        StringBuilder sb = new StringBuilder();
        for (Character c : abc) {
            sb.append(c);
        }

        String newString = sb.toString();
        System.out.println(newString);
        abc.stream().map(String::valueOf).collect(Collectors.joining());

        System.out.println(abc.toString().substring(1, 3*abc.size() -1).replaceAll(", ", ""));


        System.out.println(abc);


        char a[] =  q.toCharArray();

       int arr[][] = new int[][] { {10, 20}, {30, 40, 50} };


        Integer ar1[] = new Integer[] {10, 12, 14};
        System.out.println(Arrays.toString(ar1));
        List<Integer>  list4 = Arrays.asList(ar1);
        Collections.reverse(list4);
        ar1 =  list4.toArray(ar1);
        System.out.println(Arrays.toString(ar1));





	// write your code here
        var i = 123;
        List<String> list1 = List.of("1", "2", "3", "4");
        List<String> newList = list1.stream().filter((item) ->  item.compareTo("3") < 0).collect(Collectors.toList());
        newList.stream().forEach(System.out::println);

        List<Integer> list3 = List.of(4, 5, 6, 7);

        Integer [] arr2 = list3.toArray(new Integer[0]);
        Integer [] arr1 = list3.stream().toArray(Integer[]::new);

        for(Integer item : arr2) {
            System.out.println(item);
        }
        for(Integer item : arr1) {
            System.out.println(item);
        }

        Set<Integer> hashSet = new LinkedHashSet<>();
        hashSet.add(24);
        hashSet.add(25);
        hashSet.add(36);

        Integer array1[] = new Integer[hashSet.size()];


         array1 =  hashSet.toArray(array1);

        System.out.println(Arrays.toString(array1));
        System.out.println();
        hashSet.stream().forEach(System.out::println);

        Set<Integer> hash1 = new HashSet<>();

        hash1.add(9);
        hash1.add(6);
        hash1.add(78);
        hash1.add(45);

        List<Integer> list = new ArrayList<>(hash1);

        Collections.sort(list);

        Set<Integer> sortedHash =  list.stream().collect(Collectors.toSet());

        sortedHash.stream().forEach(System.out::println);
        System.out.println();
        System.out.println();
        hash1.stream().forEach(System.out::println);

        System.out.println();
        System.out.println();
        Set<Integer> hash2 = new TreeSet<>();

        hash2.add(56);
        hash2.add(23);
        hash2.add(45);
        hash2.add(90);
        hash2.add(18);

        hash2.stream().forEach(System.out::println);


//        arr = (Integer[]) list3.toArray(new Integer[0]);

//        System.out.println(arr);





    }
}
