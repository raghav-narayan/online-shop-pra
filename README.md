# 🛒 Online Shop with Product Recommender Algorithm (PRA)

A console-based Java application simulating an online shop with an integrated product recommender engine.

## 📌 Overview

This application simulates an online retail system where users can browse products, add them to a shopping cart, complete transactions, and receive intelligent product recommendations based on historical purchase behavior. The recommender system uses a frequency-based algorithm to suggest relevant products.

## 🚀 Key Features

- **Object-Oriented Design** using interfaces, abstract classes, and concrete subclasses
- **Shopping Cart** management with transaction handling and total price calculation
- **Purchase History Tracking** from multiple users
- **Product Recommender Algorithm**:
  - Suggests related products based on prior purchase correlations
  - Frequency-based association using a customer’s shopping cart
- **Robust Exception Handling** for invalid product codes, bad user input, and file operations
- **File I/O**: Reads and updates persistent purchase history from a file
- **Custom Product Types** like `Soap`, `Shampoo`, `Utensil`, `Bottle`, and `Note`

## 📂 Structure

- `OnlineShopApp.java` – Main entry point; handles user interaction and menu logic
- `OnlineShop.java` – Core business logic for product management and transactions
- `RecommenderSystem.java` – Implements PRA logic
- `ProductDatabase.java` – Maintains the product catalog
- `PurchaseHistory.java` – Stores and parses customer purchase histories
- `RecommendedItem.java` – Models a recommended product with its frequency
- `Product.java` (Abstract) + Custom Subclasses – Base and derived product types
- `ProductNotFoundException.java` – Custom exception
- `PaymentSystem.java` – Interface for payment handling

## 📊 Sample Use Case

Given the purchase histories of multiple users, the PRA algorithm calculates product frequencies and recommends items that are frequently bought together. For example:

- `praAlgorithm([187], 2)` → `[123, 865, 199]`
- `praAlgorithm([200], 2)` → `[]`

## 📁 File I/O

- Reads `purchase-history.txt` to initialize user histories
- Updates the file after each new transaction
- Handles exceptions like file not found, malformed input, and unknown product codes

## ⚙️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Javadoc documentation
- File I/O and Exception Handling

## 🧠 What I Learned

- Building modular Java systems with robust architecture
- Implementing association-based recommendation algorithms
- Working with Java collections, comparators, and abstract interfaces
- Exception-driven development and clean CLI interaction

## 📜 License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---

> Developed as part of academic coursework under the guidance of Dr. Seyedjamal Zolhavarieh at AUT.
