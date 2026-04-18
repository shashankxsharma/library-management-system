package com.library;
import com.library.model.Book;
import com.library.service.BookService;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        Book b1 = new Book(1,"java basic", "James Gosling");
        Book b2 = new Book(2,"Clean code", "Robert martin");
        bookService.addBook(b1);
        bookService.addBook(b2);

    }
    }

