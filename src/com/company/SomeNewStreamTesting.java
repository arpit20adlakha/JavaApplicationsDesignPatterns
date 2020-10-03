package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.PrintStream;

public class SomeNewStreamTesting {

    public static void main(String[] args)  {
       try {
           returnItn();
       } catch(Exception e) {
           e.printStackTrace();
       }
    }

    public static void returnItn() throws FileNotFoundException {


int step = 3;
        Person[] person = new Person[4];
        person[0]  = new Person(23 ,"arpit");
        person[1] = new Person(35, "postum");
        person[2] = new Person(45, "tamper");
        Person[] persons = Arrays.copyOfRange(person, 0, person.length -1);
        Arrays.stream(persons).forEach(System.out::print);

        Person[] pe=IntStream.range(0, person.length).filter(i -> i %  step == 0).mapToObj(i -> person[i]).toArray(Person[]::new);

        int count = 2;
        Arrays.stream(person, person.length- count, person.length).toArray(Person[]::new);



        File file = new File("./src/com/company/tapzo.txt");
        FileOutputStream  s = new FileOutputStream("tpx.txt");

        PrintStream out = new PrintStream(file);
        out.println("tattti");
        int[] numbers = new int[5];
//        return Arrays.stream(numbers).min().orElse(4);
        List<List<Integer>> listOFList = new ArrayList<>();
        listOFList.add(List.of(1, 3, 4));
        listOFList.add(List.of(4, 5, 6));

        List<Integer> list = listOFList.stream().flatMap(i -> i.stream()).distinct().collect(Collectors.toList());
        list.forEach(out::print);

        Integer i = Stream.of(1, 2, 4,5).map(x-> x*x).filter(x -> x%2 == 0 ? true: false).findFirst().orElse(0);
    }
}
