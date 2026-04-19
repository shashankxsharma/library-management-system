package com.library.service;

import com.library.model.Book;

import java.util.ArrayList;

public class BookService {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully");


    }
    public void showAllBooks(){
        for (Book book : books){

            book.displayBook();
        }
    }


    }

