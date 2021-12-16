package dev.rockie.hackerrank;

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}

class MyBook extends Book {
    public MyBook(String title, String author, int price) {
        super(title, author, price);
    }

    @Override
    void display() {
        System.out.println(
                "Title: " + title +
                        "Author: " + author +
                        "Price: " + price
        );
    }

}

abstract class Book {
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    abstract void display();
}