package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;


public class FileWriting {

    public static void main(String[] args) throws IOException {
        InputStream input = new BufferedInputStream(System.in);
        byte[] abc = input.readAllBytes();
        System.out.println(new String(abc));
        String abc1 = "hadimba";

        String filename = args[0];
        String pattern = args[1];
        String resultString = args[2];
        byte[] allBytes = Files.readAllBytes(Paths.get(filename));
//        Files.readAllBytes(Paths.get(System.in));
        String string = new String(allBytes);
        if(string.contains(pattern)) {
            System.out.println(resultString);
        } else {
            System.out.println("Unknown file type");
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine().trim();
        System.out.println(line.isEmpty() ? 0 : line.split("\\s+").length);
        int character = reader.read();
        char firstCharacter = (char) character;
        int count = 0;
        while(character != -1) {
            count++;

            while((char)character != ' ' && character !=- 1) {
                character = reader.read();
            }

            while ((char)character == ' ') character = reader.read();

        }
        System.out.println("outside loop");

        if (firstCharacter == ' ' && count == 1) {
            System.out.println(0);
        } else if (firstCharacter == ' '){
            System.out.println(count-1);
        } else {
            System.out.println(count);
        }

        reader.close();
        // start coding here
        char[] b = new char[50];
        reader.read(b);
        String s = new String(b);
        StringBuilder input1 = new StringBuilder();
        input1.append(s);
        input1 = input1.reverse();
        System.out.println(input1.toString());
        reader.close();


        InputStream input4 = System.in;
        int byt = input.read();
        while(byt != -1) {
            System.out.print(byt);
            byt = input.read();
        }


        File file = new File("/Users/aadlakha/Desktop/Groupon/Java11Application/src/com/company/abc.txt");
        FileWriter writer = new FileWriter(file, true);
        writer.write("Hello");
        writer.write("Java");

        writer.close();



        File file1 = new File("/Users/aadlakha/Desktop/Groupon/Java11Application/src/com/company/ato.txt");

        try ( FileWriter f2 = new FileWriter(file1)) {
            f2.write("\nHow the hell are you\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File file2 = new File("/Users/aadlakha/Desktop/Groupon/Java11Application/src/com/company/printWriter.txt");

        try (PrintWriter printer = new PrintWriter(file2)) {
            printer.print("Hello");
            printer.println("Java");
            printer.println(123);
            printer.printf("You have %d %s", 400, "gold coins");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        FileReader reader1 = new FileReader(file2);
        int charAsNumber = reader1.read();
        while(charAsNumber != -1) {
            char character1 = (char) charAsNumber;
            System.out.println(character1);
            charAsNumber = reader.read();
        }

        reader.close();

        byte[] bytes = new byte[5];

        FileInputStream inputStream = new FileInputStream(file2);
        int numberOfBytes = inputStream.read(bytes);
        System.out.println(numberOfBytes);
        String string1 = new String(bytes);
        char[] ch = string1.toCharArray();
        System.out.println(Arrays.toString(ch));
        inputStream.close();

    }
}
