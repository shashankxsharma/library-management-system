# 📚 Library Management System (Java)

## 🚀 Overview

This is a simple console-based Library Management System built using Java.
The project demonstrates core Object-Oriented Programming (OOP) concepts and basic layered architecture.

---

## 🧱 Project Structure

com.library
│
├── model
│   ├── Book.java
│   └── User.java
│
├── service
│   └── BookService.java
│
└── Main.java

---

## ⚙️ Features

* Add books to the system
* View all books
* Borrow a book using book ID
* Handle unavailable books
* Handle invalid book IDs

---

## 🧠 Concepts Used

* Encapsulation (private fields with methods)
* Abstraction (service layer hides logic)
* Separation of Concerns (model, service, main)
* ArrayList for in-memory storage

---

## 🔄 Application Flow

1. Main class starts the program
2. BookService is initialized
3. Book objects are created
4. Books are stored in an ArrayList
5. Service layer performs operations like add, view, borrow

---

## ▶️ Sample Output

Book added successfully
Book added successfully

Book borrowed
Not available
Book not found

---

## 💻 Tech Stack

* Java
* IntelliJ IDEA
* Git & GitHub

---

## 📌 Future Improvements

* Add returnBook functionality
* Convert to Spring Boot REST API
* Add database (MySQL / PostgreSQL)
* Add authentication (JWT)

---

## 👨‍💻 Author

Shashank sharma
