package AdvancedJavaAndGenerics;

public class Varags {


    public static void main(String[] args) {
        printShopping("Perfume", "Clothes", "Disc");
    }
    private static void printShopping(String... items) {
        System.out.println("List ..");

        for (int i = 0; i< items.length; i++) {
            System.out.println(i + 1 + ":"  + items[i]);
        }
    }
}
