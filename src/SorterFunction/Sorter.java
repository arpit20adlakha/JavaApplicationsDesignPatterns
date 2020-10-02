package SorterFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface Sorter<T> {
    T getMax();
    int getFrequency(T t);
    int getPercentsOfUsing(T t);
    void readData(Scanner scanner);
    void printResult(Scanner scanner);
}
