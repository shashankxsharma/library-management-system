package com.library.com.library;

public class Main {
    static void main(String[] args) {
        BookService bookService = new BookService();

        Book b1 = new (1,"java basic", "James Gosling");
        Book b2 = new (2,"Clean code", "Robert martin");
        bookService.addBook(b1);
        bookService.addBook(b2);
    }
    }
}
