package SorterFunction;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class WordSorter implements Sorter<String> {
    private List<String> list;
    private String longestWord;

    public WordSorter() {
        list = new ArrayList<>();
    }

    @Override
    public String getMax() {
        longestWord =  list.stream().max(Comparator.comparing(String::length)).get();
        return longestWord;
    }

    @Override
    public int getFrequency(String s) {
        return (int)list.stream().filter((word)->word.equals(s)).count();
    }


    @Override
    public int getPercentsOfUsing(String s) {
        return (int)getFrequency(s)*100/list.size();
    }

    @Override
    public void readData(Scanner scanner) {
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
    }

    @Override
    public void printResult(Scanner scanner) {
        System.out.printf("Total words: %d%n", list.size());
        System.out.printf("The longest word: %s (%d time(s), %d%%).",getMax(),getFrequency(longestWord),getPercentsOfUsing(longestWord));
    }


}