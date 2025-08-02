# Electricity Bill Calculator (Java Project)

This project is a **Java-based application** that calculates electricity bills based on the number of units (KWH) consumed. It provides a menu-driven interface with robust exception handling to manage invalid inputs.

---

## 📋 Project Overview
The **Electricity Bill Calculator** project is designed to:
- Allow users to calculate their electricity bills based on units consumed.
- Handle invalid inputs gracefully using exception handling (like `InputMismatchException`).
- Implement a tiered billing system using slabs for a more accurate and realistic billing calculation.

The user is presented with two options:
1. **Calculate Bill** – The user enters the number of units consumed, and the program displays the total amount in INR.
2. **Exit** – Ends the program with a "Thank You!" message.

This menu is displayed repeatedly using an infinite loop until the user chooses to exit.

---

## 💡 Features
- Menu-driven interface.
- Tiered billing slabs:
    - Up to 100 units: ₹1.20 per unit.
    - 101-300 units: ₹2.00 per unit (for units exceeding 100).
    - Above 300 units: ₹3.00 per unit (for units exceeding 300).
- Robust exception handling for invalid inputs (non-numeric values, negative units).
- Structured and modular code design using functions (`calculateBill()`, `calculateTotalAmount()`).

---

## 🖥️ System Requirements
### Software Requirements:
- Operating System: Windows or any other.
- Tools: VS Code or Eclipse.
- Programming Language: Java.



