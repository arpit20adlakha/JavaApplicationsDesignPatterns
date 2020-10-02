package SorterFunction;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sorter sorter = null;
        SorterFactory sorterFactory = new SorterFactory();
        if ("-dataType".equals(args[0])) {
            if ("long".equals(args[1])) {
                sorter = sorterFactory.getSorter(SorterTypes.LONG);
            }
            else if("line".equals(args[1])){
                sorter = sorterFactory.getSorter(SorterTypes.LINE);
            } else {
                sorter = sorterFactory.getSorter(SorterTypes.WORD);
            }
        } else {
            sorter = sorterFactory.getSorter(SorterTypes.WORD);
        }

        sorter.readData(scanner);
        sorter.getMax();
        sorter.printResult(scanner);
    }
}
