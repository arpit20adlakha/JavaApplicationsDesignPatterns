package com.company;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Testing123 {

    public static void main(String[] args) {


        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate date1 = LocalDate.of(2017, 10, 22);
        LocalDate date2 = LocalDate.parse("2017-11-22");
        LocalDate yearDate = LocalDate.ofYearDay(2019, 33);
        try {
            LocalDate leapThing = LocalDate.ofYearDay(2017, 366);
        } catch (DateTimeException e){
            System.out.println(e.getMessage());
        }

        System.out.println(date1.getYear());
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getDayOfYear());
        System.out.println(date1.lengthOfMonth());
        System.out.println(date1.lengthOfYear());
        LocalDate.ofYearDay(2018, 3);
        LocalDate date = LocalDate.of(2017, 1, 1);
        LocalDate tomorrow = date.plusDays(1);
        LocalDate yesterday = date.minusDays(1);
        LocalDate inTwoYears = date.plusYears(2);
        LocalDate in2016 = date.withYear(2016);

        System.out.println(tomorrow);
        System.out.println(yesterday);
        System.out.println(inTwoYears);
        System.out.println(in2016);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(yearDate);


        int v = 0b00011;
        System.out.println(v);
        Scanner scanner = new Scanner(System.in);
        String buf = scanner.nextLine();
        String[] bufSplit = buf.split(" ");
        int rows = Integer.parseInt(bufSplit[0]);
        String[] seats = new String[rows];
        long tooBigInt = 2147483647;

        for (int i =0; i < rows; i++) {
            seats[i] = scanner.nextLine().replace(" ", "");
        }
        int requiredTickets = scanner.nextInt();

        for (int i = 0; i < seats.length; i++) {
            if (seats[i].contains("0".repeat(requiredTickets))){
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(0);
    }

}
