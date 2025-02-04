package org.example.module2_object_orientation.c02_package;

public class Main_Challenge02 {
    public static void main(String[] args) {

        Book[] books = {
                new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"),
                new Book("To Kill a Mockingbird", "Harper Lee", "9780446310789")
        };

        Library library = new Library(books);
        System.out.println(library);

        Book newBook = new Book("1984", "George Orwell", "9780451524935");
        library.addBook(newBook);
        System.out.println(library);

    }
}
