package AdvancedJavaAndGenerics;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Kitchen {
    public static Object spoon = new Object();
    public static Object bowl = new Object();

    public static void main(String[] args) throws IOException {

        Path source = Paths.get("src/AdvancedJavaAndGenerics/example.txt");
        Path dest = Paths.get("src/AdvancedJavaAndGenerics/new.txt");
        Files.copy(source, dest);

        Path path = Paths.get("src/AdvancedJavaAndGenerics/example.txt");
//        Files.deleteIfExists(path);
        System.out.println(path.getParent());


        FilenameFilter filter = (file, fileName) -> {
            return fileName.contains(".");
        };

        String[] contents = new File(".").list(filter);

        Arrays.stream(contents).forEach(System.out::println);

        File file = new File("src/AdvancedJavaAndGenerics/newFile.txt");
        try {
            boolean fileCreated = file.createNewFile();
            System.out.println(fileCreated);
        } catch (IOException ie) {

        }


        Scanner scanner = new Scanner(System.in);
        File myFile = new File("src/AdvancedJavaAndGenerics/example.txt");
        BufferedReader reader = new BufferedReader(new FileReader(myFile));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        Thread cook1 = new Thread(()-> {
            synchronized (spoon) {
                System.out.println("Cook1: Holding the spoon...");
                System.out.println("Cook1: Waiting for the bowl");

                synchronized (bowl) {
                    System.out.println("Cook1: Holding the spoon and the bowl");
                }
            }
        });

        Thread cook2 = new Thread(() -> {
            synchronized (spoon) {
                System.out.println("Cook2: Holding the bowl....");
                System.out.println("Cook2: Waiting for the spoon...");

                synchronized (bowl) {
                    System.out.println("Cook1: Holding the spoon and the bowl");
                }
            }
        });

        cook1.start();
        cook2.start();
    }
}
