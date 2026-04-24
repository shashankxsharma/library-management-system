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

//        bookService.borrowBook(1);
//        bookService.borrowBook(1); // try again
//        bookService.borrowBook(5); // not exist
        bookService.showAllBooks();

        System.out.println("\nBorrow Book:");
        bookService.borrowBook(1);
        bookService.borrowBook(1);
        bookService.borrowBook(10);

        System.out.println("\nReturn Book:");
        bookService.returnBook(1);
        bookService.returnBook(1);
        bookService.returnBook(10);
    }
    }

