# ATM Interface

A Java-based console application developed as part of the CodSoft Java Development Internship.

## 📌 Project Overview

The ATM Interface is a console-based Java application that simulates basic ATM operations.

The application connects an ATM class with a Bank Account class to perform balance checking, withdrawals, and deposits.

## 🎯 Objective

The objective of this project is to demonstrate:

- Object-Oriented Programming
- Classes and objects
- Encapsulation
- Methods
- Input validation
- Transaction processing

## ✨ Features

- Check account balance
- Withdraw money
- Deposit money
- Validate transaction amounts
- Prevent withdrawals exceeding available balance
- Menu-driven interface
- Exit option

## 🏗️ Project Structure

```text
CODSOFT_ATMInterface
│
├── BankAccount.java
├── ATM.java
├── ATMInterface.java
└── README.md
```

### BankAccount.java

Manages the account balance and provides methods for deposits and withdrawals.

### ATM.java

Provides the ATM menu and handles user transactions.

### ATMInterface.java

Contains the main method and starts the ATM application.

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming
- Java Standard Library
- Scanner

## ▶️ How to Run

### Compile

```bash
javac BankAccount.java
javac ATM.java
javac ATMInterface.java
```

### Run

```bash
java ATMInterface
```

## 💳 Available Operations

1. Check Balance
2. Withdraw Money
3. Deposit Money
4. Exit

## 🔐 Validation

The application validates:

- Menu choices
- Transaction amounts
- Deposit values
- Withdrawal values
- Available account balance

## 📚 CodSoft Internship Task

**Task:** ATM Interface

The task requires creating an ATM class and a user bank account class, implementing withdrawal, deposit and balance operations, connecting the classes, validating user input, and displaying appropriate transaction messages.

## 👨‍💻 Author

Renuka Takale

Developed for the CodSoft Java Development Internship.
