package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
