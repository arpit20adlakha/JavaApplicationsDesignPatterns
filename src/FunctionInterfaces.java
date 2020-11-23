import java.util.function.*;

public class FunctionInterfaces {
    static BiConsumer consumer = (x, y) -> {
        System.out.println(x);
    };

    public static void main(String[] args) {
        consumer.accept(2, 3);
        System.out.println(predicate.test(3));
        Function<String, Integer> converter = Integer::parseInt;
        try {
            Integer i = converter.apply("34e");
            System.out.println("The integer value is " + i);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }

        ToIntFunction<String> anotherConverter = Integer::parseInt;
        try {
            Integer i = anotherConverter.applyAsInt("2000");
            System.out.println("From another converter " + i);
        } catch (NumberFormatException  ne) {
            ne.printStackTrace();
        }

        BiFunction<Integer, Integer, Integer> sumFunction = (a, b) -> a + b;
        System.out.println(sumFunction.apply(2, 3));
    }

    static IntPredicate predicate = (a) ->  {
        if(a != 0) {
            return true;
        }
        return false;
    };

}
