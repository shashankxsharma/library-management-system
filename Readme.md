# 📚 Library Management System (Java)

## 🚀 Overview

This is a console-based Library Management System built using Java.
The project demonstrates Object-Oriented Programming (OOP), layered architecture, and real-world backend logic such as validation and state handling.

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
* Borrow book using ID
* Return book using ID
* Prevent borrowing already borrowed books
* Prevent returning already available books
* Handle invalid book IDs

---

## 🧠 Concepts Used

* Encapsulation (private fields + getters)
* Abstraction (service layer handles logic)
* Separation of Concerns (model, service, main)
* ArrayList for in-memory storage
* Conditional logic for real-world validation

---

## 🔄 Application Flow

1. Application starts from Main class
2. BookService initializes an in-memory list
3. Books are created and added to the system
4. User actions (borrow/return) are handled via service layer
5. Service layer searches book by ID and delegates behavior to Book class
6. Book class updates its internal state (available / not available)

---

## ▶️ Sample Output

All Books:
1 | java basic | James Gosling | Available: true
2 | Clean code | Robert martin | Available: true

Borrow Book:
Book borrowed
Not available
Book not found

Return Book:
Book returned
Already available
Book not found

---

## 💻 Tech Stack

* Java
* IntelliJ IDEA
* Git & GitHub

---

## 📌 Improvements Added (Day 5)

* Implemented `returnBook(int id)`
* Added validation for already returned books
* Improved error handling (book not found)
* Enhanced output messages
* Added edge case handling

---

## 🔮 Future Improvements

* Refactor duplicate logic (Day 6)
* Add User interaction (who borrows book)
* Convert to Spring Boot REST API
* Add database (MySQL)
* Implement authentication (JWT)

---

## 👨‍💻 Author

Your Name
Shashank Sharma