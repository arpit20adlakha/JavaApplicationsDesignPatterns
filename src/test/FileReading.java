package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReading {
    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
    public static void main(String[] args) {
        String a = 12 + "233";
        System.out.println(a);
        Queue<Integer>  q = new LinkedList<>();
        System.out.println(81/100);
        q.add(2);
        q.add(3);
        System.out.println(q.poll());
        String path = "/Users/aadlakha/Desktop/Groupon/Java11Application/src/com/company/AlienDictionary.java";
        try {
            System.out.println(readFileAsString(path));
        } catch (IOException e) {
            System.out.println("cannot read file : " + e.getMessage());
        }


        File file = new File("abc.txt");
        System.out.println(File.separator);

        System.out.println(file.getParent());

        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found" + e.getMessage());
        }

    }
}
