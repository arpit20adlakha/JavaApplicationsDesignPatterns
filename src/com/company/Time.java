package com.company;

import javafx.fxml.LoadException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void printTime() {
        System.out.println(LocalTime.of(hours, minutes, seconds));
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
//        return LocalTime.of(hours, minutes, seconds).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(Stream.of("tatti", "krlo", "bhaiya").toArray()).replaceAll(" ", ""));
        Time time = new Time(3, 5, 56);
        System.out.println(time);
        time.printTime();
    }

}
