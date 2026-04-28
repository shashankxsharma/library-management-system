package com.library.model;

public class Book {
    private int id;
    private  String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String title, String author ) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;

    }

    public int getId() {
        return id;
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned");
        } else {
            System.out.println("Already available");
        }
    }
//    public void borrowBook() {
//        if (isAvailable) {
//            isAvailable = false;
//            System.out.println("Book borrowed");
//        } else  {
//            System.out.println("Not available");
//        }
//    }
public void borrowBook() {
    if (isAvailable) {
        isAvailable = false;
        System.out.println("Book borrowed");
    } else {
        System.out.println("Not available");
    }
}

    public void displayBook() {
        System.out.println(id + " | " + title + " | " + author + " | Available: " + isAvailable);
    }

    if (!found) {
        System.out.println("Book not found");
    }
}
//    public void returnBook()  {
//        isAvailable = true;
//    }
//
//    public void displayBook() {
//        System.out.println(id + " | " + title + " | " + author + " | Available: " + isAvailable);
//    }
}
