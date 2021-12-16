package dev.rockie.streamsexample;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Library {

    BufferedImage bufferedImage;

    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();

//        books.stream().filter(book -> {
//            return book.getAuthor().startsWith("J");
//        }).filter(book -> {
//            return book.getTitle().startsWith("P");
//        }).forEach(System.out::println);

//        books.stream().filter(book -> {
//            return book.getAuthor().startsWith("J");
//        }).forEach(System.out::println);


        // parallel Stream can be useful by large amount of data
        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).forEach(System.out::println);

    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Jane Austin", "Pride and Prejudice"));
        books.add(new Book("Jane Austin", "Emma"));
        books.add(new Book("Jane Austin", "Persuasion"));
        books.add(new Book("Jane Austin", "Mansfield Park"));

        return books;
    }
}
