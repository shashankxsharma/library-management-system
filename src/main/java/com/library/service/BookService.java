package com.library.service;

import com.library.model.Book;

import java.util.ArrayList;

public class BookService {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully");


    }
//    public void showAllBooks(){
//        for (Book book : books){
//
//            book.displayBook();
//        }
public void showAllBooks() {

    if (books.isEmpty()) {
        System.out.println("No books available");
        return;
    }

    for (Book book : books) {
        book.displayBook();
    }
}
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Not available");
        }
        public void returnBook(int id) {

            boolean found = false;

            for (Book book : books) {

                if (book.getId() == id) {

                    book.returnBook();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Book not found");
            }
        }
    }
        }
    }




