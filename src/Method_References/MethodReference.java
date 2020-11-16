package Method_References;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MethodReference {

    Consumer<String> printer = str -> System.out.println(str);

    static Consumer<String> printerNew = System.out::println;

    static Function<Double, Double> sqrt = Math::sqrt;

//    public static void main(String[] args) {
//        Double answer = sqrt.apply(100.0d);
//        System.out.println(answer);
//        printerNew.accept("Hello how are you ?");
//        Function<Double, Double> sqrt2 = i -> Math.sqrt(i);
//        System.out.println(sqrt2.apply(4.0d));
//
//
//
//        Scanner scanner = new Scanner(System.in);
//        Supplier<String> lineReader = scanner::nextLine;
//        System.out.println(lineReader.get());
//        Supplier<String> lineReaderNew = () -> scanner.nextLine();
//        Function<Long, Double> converter = Long::doubleValue;
//
//        System.out.println(converter.apply(100L));
//
//        Supplier<String> generator = String::new;
//
//        Predicate<String> p = (t) -> t.isEmpty();
//    }



    public static <T> void applyFunction(T[] array, Function<T, T> func) {
        List<T> list = Arrays.stream(array).map(func).collect(Collectors.toList());
        int i = 0;
        for(T t : list) {
            array[i++] = t;
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String method = scanner.nextLine();
        String[] array = scanner.nextLine().split(" ");
        array.clone();

        applyFunction(array,
                "lower".equals(method) ? String::toLowerCase :
                        "upper".equals(method) ? String::toUpperCase :
                                "new".equals(method) ? String::new :
                                        "trim".equals(method) ? String::trim : String::intern);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }



}
