import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface Printer<T> {
    void print(int totalItems, T maxItem, long numberOfMaxItems, double percentage);
}

public class Something {
    private static void printLong(int totalItems, Long maxItem, long numberOfMaxItems, double percentage) {
        System.out.printf("Total numbers: %s\n", totalItems);
        System.out.printf("The greatest number: %d (%d time(s), %2.0f%%).\n", maxItem, numberOfMaxItems, percentage);
    }

    private static void printWord(int totalItems, String maxItem, long numberOfMaxItems, double percentage) {
        System.out.printf("Total words: %s\n", totalItems);
        System.out.printf("The longest word: %s (%d time(s), %2.0f%%).\n", maxItem, numberOfMaxItems, percentage);
    }

    private static void printLine(int totalItems, String maxItem, long numberOfMaxItems, double percentage) {
        System.out.printf("Total lines: %s\n", totalItems);
        System.out.println("The longest line:");
        System.out.println(maxItem);
        System.out.printf("(%d time(s), %2.0f%%).\n", numberOfMaxItems, percentage);
    }

    private static <T> void calculateAndPrint(List<T> input, Comparator<? super T> comparator, Printer<? super T> printer) {
        int totalItems = input.size();
        T maxItem = input.stream().max(comparator).orElse(null);
        long numberOfMaxItems = input.stream().filter(i -> i.equals(maxItem)).count();
        double percentage = (1.0 * numberOfMaxItems / totalItems) * 100;
        printer.print(totalItems, maxItem, numberOfMaxItems, percentage);
    }

    private static final Comparator<String> stringComparator = (o1, o2) -> {
        if (o1.length() == o2.length())
            return o1.compareTo(o2);
        else
            return Integer.compare(o1.length(), o2.length());
    };

    private static final Comparator<Long> longComparator = Long::compareTo;

    public static void main(final String[] args) {
        if (args.length < 2) return;
        if (!"-dataType".equals(args[0])) return;
        String dataType = args[1];

        Scanner sc = new Scanner(System.in);

        switch (dataType) {
            case "long": {
                List<Long> input = sc
                        .tokens()
                        .map(Long::parseLong)
                        .collect(Collectors.toList());
                calculateAndPrint(input, longComparator, Something::printLong);
                break;
            }
            case "word": {
                List<String> input = sc
                        .tokens()
                        .flatMap(s -> Arrays.stream(s.split("\\s+")))
                        .collect(Collectors.toList());
                calculateAndPrint(input, stringComparator, Something::printWord);
                break;
            }
            case "line": {
                List<String> input = new ArrayList<>();
                while (sc.hasNext()) {
                    input.add(sc.nextLine());
                }
                calculateAndPrint(input, stringComparator, Something::printLine);
                break;
            }
            default: {
            }
        }
    }
}