package SorterFunction;

import  java.util.*;

public class LongSorter implements Sorter<Long> {
    private List<Long> list;
    private Long greatestLong;

    public LongSorter() {
        list = new ArrayList<>();
    }


    @Override
    public Long getMax() {
        greatestLong = Collections.max(list);
        return greatestLong;
    }

    @Override
    public int getFrequency(Long aLong) {
        return (int)list.stream().filter((word)->word.equals(aLong)).count();
    }


    @Override
    public int getPercentsOfUsing(Long item) {
        return (int)getFrequency(item)*100/list.size();
    }

    @Override
    public void readData(Scanner scanner) {
        while (scanner.hasNextLong()) {
            list.add(scanner.nextLong());
        }
    }

    @Override
    public void printResult(Scanner scanner) {
        System.out.printf("Total numbers: %d%n", list.size());
        System.out.printf("The longest number: %d (%d time(s), %d%%).",getMax(),getFrequency(greatestLong),getPercentsOfUsing(greatestLong));
    }
}