package com.company;

import SorterFunction.SorterFactory;

import java.util.*;
import java.util.stream.Stream;

public class StringMethods {
    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        /* Do not change code above */
        Optional<String> optString = Optional.ofNullable(string);


        optString.ifPresentOrElse((item) -> System.out.println(item.toLowerCase()),() -> System.out.println("NPE!"));



//        System.out.println(0%2);
        Optional<String> optional = Optional.ofNullable(null);
//        optional.ifPresentOrElse();
        var alphabet = "abcdefghijklmopqrstuvwxyz";
        var scan = new Scanner(System.in);
        System.out.println(alphabet.contains(scan.next()));
        Boolean[] ar = {false, true, false};
        int [] tp = {2, 2, 4, 5, 6};
         int[] integerArr = new int[] {1, 2, 3};
//        for (int i=0; i< arr.length ; i++) {
//            arr[i] = !arr[i];
//        }
//        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        char a= '1';
          Character.getNumericValue(a);
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.next();
        int m = 1;
        for(; m < string.length(); m++) {
            if((int)string.charAt(m) != string.charAt(m-1) + 1) {
                System.out.println("false");
                break;
            }
        }

        if (m == string.length()) {
            System.out.println("true");
        }




        String[] input = new Scanner(System.in).nextLine().split(" ");


//        new java.util.Scanner(System.in)
//                .tokens()
//                .min((a, b) -> b.length() - a.length())
//                .ifPresent(System.out::print);
//
//        new java.util.Scanner(System.in)
//                .tokens()
//                .sorted((a, b) -> b.length() - a.length())
//                .findFirst()
//                .ifPresent(System.out::print);


        Scanner sc = new Scanner(System.in);
        System.out.println(
                Arrays.stream(sc.nextLine()
                        .strip()
                        .split("\\s+")
                )
                        .sorted(Comparator.comparing(String::length).reversed())
                        .findFirst()
                        .get()
        );


        String input1 = scanner.nextLine();

        char[] charArray = input1.toCharArray();

        Integer[] intArray = new Integer[charArray.length];

        for(int j = 0; j< charArray.length ; j++) {
            intArray[j] = Character.getNumericValue(charArray[j]);
        }
        System.out.println(Arrays.toString(intArray));

        String[] strings = new Scanner(System.in).nextLine().split("\\s+");
        int max = Arrays.stream(strings).mapToInt(String::length).max().getAsInt();
        System.out.println(Arrays.stream(strings).filter(s -> s.length() == max).findFirst().get());

        String[] sep = "sss".split(" ");
        System.out.println(Arrays.stream(sep).max(Comparator.comparingInt(String::length)).orElse(null));

        String kun = "pass=1244";

        System.out.println(kun.replaceAll("=", " : "));

        String url = scanner.nextLine();

        boolean password = false;
        String passwordValue = "";
        String[] stringArray = url.split("&");
        String[] firstCase = stringArray[0].split("\\?");
        stringArray[0] = firstCase[1];

        for (int i = 0; i < stringArray.length; i++) {
            String [] params = stringArray[i].split("=");
            String value = params[1];

            if (params[0] == "pass") {
                password = true;
                passwordValue = value;
            }

            if (value == null) {
                value = "not found";
            }

            System.out.println(params[0] + " : " + value);
        }

        if (password) {
            System.out.println("password" + " : " + passwordValue);
        }












        String stringInput  = scanner.next();

        StringBuilder builder = new StringBuilder();

        builder.append(stringInput);

        builder = builder.reverse();
        String xy = new String(builder);
        String tpr = builder.toString();
        System.out.println(xy);
        System.out.println(stringInput.equals(tpr));

        System.out.println(builder);
        byte[] stringOutput = stringInput.getBytes();
        byte[] newArray = new byte[stringInput.length()];
        for (int j=0; j< stringOutput.length; j++) {
            newArray[j] = stringOutput[stringOutput.length -j-1];
        }
        char[] abc = {'a', 'v', 'c'};
        String b = new String(newArray);
        String p = String.valueOf(abc);
        System.out.println(p);
        char[] charr = stringInput.toCharArray();





        int i, j;
        for (i = 0, j = stringInput.length() - 1; i != j && i - 1 != j; i++, j--) {
            if (stringInput.charAt(i) != stringInput.charAt(j)) {
                System.out.println("no");
                break;
            }
        }

        if (i == j || i - 1 == j) {
            System.out.println("yes");
        }




        String text = "The simple text string";
        System.out.println(text.contains("string"));
        boolean empty = text.isEmpty();



        String upperCase = text.toUpperCase();

//        Scanner s = new Scanner(System.in);

//        Scanner scanner = new Scanner(System.in);

        System.out.println(scanner.nextLine());

        System.out.println(scanner.next());
        System.out.println(scanner.nextLine());
        int n = scanner.nextInt();
        int d1 = n / 1000;
        int d2 = n / 100 % 10;
        int d3 = n / 10 % 10;
        int d4 = n % 10;

        if (d1 == d4 && d2 == d3) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }






        boolean startsWith = text.startsWith("THE"); // case insensitive

        String nowhitespaces = text.replace(" ", "");

        String withWhitespaces = "\t text with whitespaces   !\n  \t";

        String trimmedText = withWhitespaces.trim();


//        String s = null;
//        int length = s.length();

        String s1 = "ab";

//        char c = s.charAt(2);

        String firstName = "John";
        String lastName = "Smith";

        String fullName = firstName + " " + lastName;

        String fullName2 = firstName.concat(" ").concat(lastName);

        String str = "str"+ 10 + false;

        String h = "str";
        long number = 100;

        String result1 = h + number+ 50;

        String result2 = number + 50 + h;

        String first = "first";
        String second = "second";

        String anotherFirst = "first";
        String secondInUpperCase = "SECOND";

        System.out.println(first.equals(second));
        System.out.println(first.equals(anotherFirst));

        System.out.println(second.equals(secondInUpperCase));
        System.out.println(second.equalsIgnoreCase(secondInUpperCase));

        String g = " Inside Main";
//        String subs = g.substring()''


        Patient patient = new Patient();
        patient.name = "Arpit";
        patient.age = 26;

        SorterFactory sortedFactory = new SorterFactory();
    }


    private static class Patient {
        private String name;
        private Integer age;
    }

}
