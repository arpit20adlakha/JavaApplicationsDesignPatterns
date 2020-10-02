package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

    static class Pair {
        int year;
        int population;
        public Pair(int year, int population) {
            this.year = year;
            this.population = population;
        }
    }


    public static void main(String[] args) {
        File file = new File("/Users/aadlakha/Downloads/dataset_91007.txt");
        File file1 = new File("/Users/aadlakha/Desktop/Groupon/Java11Application/src/com/company/abc.txt");
        File file2 = new File("/Users/aadlakha/Downloads/dataset_91069.txt");
        int count = 0;
        Integer max = Integer.MIN_VALUE;
        try {
            Scanner scanner = new Scanner(file2);
            scanner.next();
            scanner.next();
            Long maxIncrease = Long.MIN_VALUE;

            int year = scanner.nextInt();
            Long population = scanner.nextLong();

            int maxYear1 = year;
            int maxYear2 = year;
            while(scanner.hasNext()) {
                int nextYear = scanner.nextInt();
                Long nextPopulation = scanner.nextLong();

                if ((nextPopulation - population) > maxIncrease) {
                  maxIncrease = nextPopulation - population;
                  maxYear1 = year;
                  maxYear2 = nextYear;
                }
                year = nextYear;
                population = nextPopulation;
//               max =  Math.max(scanner.nextInt(), max);
            }
            scanner.close();
            System.out.println(maxYear2);
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found" + e.getMessage());
        }



    }
}
