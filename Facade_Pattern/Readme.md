# 🧩 Facade Pattern – Order Processing Backend (Java)

## 📌 Overview

This project demonstrates the **Facade Design Pattern** using a **realistic backend use case**:  
**Order Processing in an E-commerce system**.

The goal is to show how a **single, simple interface (Facade)** hides the complexity of multiple backend subsystems like inventory, payment, order creation, and notifications.

This is **not a toy example** — it mirrors how real production backends are structured.

---

## 🧠 Facade Pattern (Quick Explanation)

- Facade provides a **single unified interface** to multiple complex subsystems.
- Clients interact with **one entry point**, not many services.
- Internal complexity is hidden.
- Improves **readability, loose coupling, and maintainability**.
- Helps enforce **clean architecture** and **Law of Demeter**.

---

## 🏗️ System Use Case

### Scenario: Place an Order

Placing an order requires:
1. Checking inventory  
2. Processing payment  
3. Creating order  
4. Sending confirmation  

Without Facade → Controller talks to multiple services  
With Facade → Controller talks to **one class**

---




---

## 🔁 Data Flow

Main  

↓  

OrderController  

↓  

OrderProcessingFacade  

↓  

| InventoryService |  

| PaymentService |  

| OrderService |  

| NotificationService |  



---

## 🎯 Why Facade Pattern Fits Here

- Controllers should be **thin**
- Business workflows span **multiple services**
- Internal services may change frequently
- API surface must remain **stable**
- Reduces coupling between layers

---

## 🧪 How to Run the Project

### Prerequisites
- Java 8 or higher
- Any IDE (VS Code / IntelliJ)

### Steps
1. Clone or create the project
2. Place files according to directory structure
3. Run `Main.java`




