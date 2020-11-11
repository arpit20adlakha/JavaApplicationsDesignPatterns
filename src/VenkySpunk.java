import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.*;

public class VenkySpunk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        var date = LocalDate.of(year, month, 1);
//        int length = date.lengthOfMonth();
//        int count = 1;
//        while(count <= length) {
//            if (date.getDayOfWeek().name().equals("MONDAY")) {
//                System.out.println(date);
//            }
//            count++;
//            date = date.plusDays(1);
//        }

        while (date.getMonthValue() == month) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
                date = date.plusWeeks(1);
            } else {
                date = date.plusDays(1);
            }
        }


        System.out.println(date.getDayOfWeek());
        var number = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = new ArrayList<>();


        System.out.println(number.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .reduce(0, (total, e) -> total + e));

        number.parallelStream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .forEach(e -> result.add(e));

        List<Integer>  next = number.parallelStream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .collect(toList());

        System.out.println(next);

        System.out.println(result);
    }
}
