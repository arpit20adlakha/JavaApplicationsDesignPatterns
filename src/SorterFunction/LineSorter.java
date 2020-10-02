package SorterFunction;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LineSorter implements Sorter<String> {
    private List<String> list;
    private String longestLine;

    public LineSorter() {
        list = new ArrayList<>();
    }


    @Override
    public String getMax() {
        longestLine =  list.stream().max(Comparator.comparing(String::length)).get();
        return longestLine;
    }

    @Override
    public int getFrequency(String s) {
        return (int)list.stream().filter((line)->line.equals(s)).count();
    }


    @Override
    public int getPercentsOfUsing(String s) {
        return (int)getFrequency(s)*100/list.size();
    }

    @Override
    public void readData(Scanner scanner) {
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
    }

    @Override
    public void printResult(Scanner scanner) {
        System.out.printf("Total lines: %d%n", list.size());
        System.out.printf("The longest line: %n%s%n (%d time(s), %d%%).",getMax(),getFrequency(longestLine),getPercentsOfUsing(longestLine));
    }


}