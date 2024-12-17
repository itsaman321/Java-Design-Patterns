Strategy Pattern
This code demonstrates the Strategy Design Pattern in Java by implementing multiple payment methods:

Payment Interface: Defines the common pay method for all payment strategies.
Concrete Payment Strategies:
GooglePay: Implements the pay method for Google Pay.
Paytm: Implements the pay method for Paytm.
User Context Class:
Accepts a Payment strategy in its constructor.
Calls the pay method using the provided strategy.
How It Works
Create an instance of User with a specific payment strategy (GooglePay or Paytm).
Call the doPayment method to execute the chosen payment strategy.
Here's how you can structure the **README** for your GitHub repository that demonstrates the implementation of the Decorator Pattern for a Coffee Shop Billing System:

---

# Coffee Shop Billing System ☕

This repository demonstrates the **Decorator Pattern** in Java, used to calculate the cost of coffee dynamically based on selected types and add-ons.

---

## 📝 Problem Statement

Design a coffee shop billing system where customers can:
- Choose different types of coffee like **Espresso** and **Cappuccino**.
- Add optional items like **Milk**, **Sugar**, and **Whipped Cream**.
- See the total cost based on the coffee and add-ons selected.

---

## 🎯 Objective

To implement the system using the **Decorator Design Pattern**, allowing the extension of coffee types and add-ons without modifying existing code.

---

## 🔨 Implementation Overview

1. **Core Components**:
   - A `Coffee` interface to define the base structure for coffee items.
   - Concrete classes like `Espresso` and `Cappuccino` that implement `Coffee`.

2. **Decorators**:
   - An abstract `AddOnDecorator` class implementing `Coffee`.
   - Add-on classes like `Milk`, `Sugar`, and `WhippedCream` extending `AddOnDecorator
