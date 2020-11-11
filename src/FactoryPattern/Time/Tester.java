package FactoryPattern.Time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Tester {
    public static void main(String[] args) {
        int [][] sq = new int[3][];
        int [][] sw = {{1, 3, 4}, {4, 5} };
        int [][][] cubic = new int[3][4][5];


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int [][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for(int j = 0; j< m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int column1 = scanner.nextInt();
        int column2 = scanner.nextInt();

        for (int i = 0; i< n ;i++) {
            int temp = arr[i][column1];
            arr[i][column1] = arr[i][column2];
            arr[i][column2] = temp;
        }
        for (int [] a: arr) {
          String arrayStr = Arrays.toString(a);
            System.out.println(arrayStr.substring(1, arrayStr.length()-1).replaceAll(",", " "));
        }
        int current = 1;

        for (int i=0; i< 3; i++) {
            for (int j =0; j < 4 ; j++) {
                for(int k =0; k< 5; k++) {
                    cubic[i][j][k] = current;
                }
            }
            current++;
        }

//        for(int [][] dim2Array : cubic) {
//            for(int [] arr : dim2Array) {
//                System.out.println(Arrays.toString(arr));
//            }
//            System.out.println();
//        }


        for(int i=0; i< 3; i++) {
            for(int j = 0; j< 4; j++) {
                for (int k =0; k < 5; k++) {
                    System.out.print(cubic[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        long seconds = 3000;
        long millis = 3000 * 1000;
        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM d, yyyy h:mm,a", Locale.ENGLISH);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);

        System.out.println(LocalDate.now());
        System.out.println(OffsetDateTime.now());
        System.out.println(TimeUnit.SECONDS.toHours(500000));
        System.out.println(TimeUnit.MINUTES.toMinutes(500000));
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(150, 0, ZoneOffset.UTC);
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

        int hours= (int) seconds / 3600 % 24;
        int minutes = (int) (seconds % 3600) / 60;
        int sec = (int) seconds % 60;


    }
}
