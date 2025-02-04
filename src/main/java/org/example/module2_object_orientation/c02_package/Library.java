package org.example.module2_object_orientation.c02_package;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public void addBook(Book newBook) {
        // Erstelle neues Array (+1) und kopiere alle existierenden Bücher
        Book[] newBooks = Arrays.copyOf(books, books.length + 1);
        // füge neues Buch am Ende an
        newBooks[books.length] = newBook;
        // weise neues Array zu
        books = newBooks;
    }
}
