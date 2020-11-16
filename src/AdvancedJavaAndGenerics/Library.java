package AdvancedJavaAndGenerics;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();
        books.parallelStream().filter((book) -> book.getAuthor().startsWith("A"))
                .filter(book -> book.getTitle().startsWith("T"))
                .forEach(System.out::println);
    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Alice Walker", "The color purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni", "Jazz"));
        books.add(new Book("Toni", "Beloved"));
        return books;
    }
}
