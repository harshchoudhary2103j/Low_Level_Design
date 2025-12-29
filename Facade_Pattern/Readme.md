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

### Expected Output


You said:
I am learning Low-Level Design and System Design. I have just learned the Facade Pattern . I want hands-on practical experience, not just theory. Please do the following step by step: Briefly explain the pattern in 4–5 lines in simple language (assume interview level). Give me a real-world use case where this pattern is actually used in backend systems. Design a small but realistic backend system (not a toy example) where this pattern is the core. Mention components Data flow Why this pattern fits here Write clean, production-style code in: Language: [Java ] Follow good naming, separation of concerns Show how the pattern works at runtime Step-by-step flow Which object talks to which Add 1–2 common mistakes beginners make with this pattern. Explain how this pattern helps in real interviews & production systems. Important constraints: Keep it practical and executable Avoid unnecessary theory Assume I want to run and test the code Start now with full clarity and explanations.  
Also explain law of demeter and how it is related to facade pattern 
ChatGPT said:
Great choice, Harsh 👍
The Facade Pattern is extremely common in real backend systems, and interviewers love it because it shows you understand API design, layering, and clean architecture.

I’ll keep this practical, executable, and interview-oriented, exactly like your previous LLD sessions.

1️⃣ Facade Pattern — Simple Explanation (Interview Level)
Facade Pattern provides a simple, unified interface over a set of complex subsystems.

It hides internal complexity and exposes only what the client actually needs.

The client talks to one entry point, not multiple classes.

It improves readability, maintainability, and loose coupling.

Internally, subsystems can change without affecting clients.

👉 One line:

Facade = single clean door to a messy backend room.

2️⃣ Real-World Backend Use Case (Very Common)
Example:
Order Placement in an E-commerce Backend

Placing an order involves:

Inventory check

Payment processing

Order creation

Notification sending

Without Facade → controller talks to 4–5 services
With Facade → controller talks to one service

📌 This is exactly how real production systems are structured.

3️⃣ System Design: Order Processing System (Facade-Centric)
🎯 Goal
Expose a single API to place an order, while internally coordinating multiple services.

4️⃣ Components (Clean Separation)
Subsystems (Complex Internals)
InventoryService

PaymentService

OrderService

NotificationService

Facade
OrderProcessingFacade

Client
OrderController (simulates REST controller)

5️⃣ Data Flow (High-Level)
Client
  ↓
OrderController
  ↓
OrderProcessingFacade
  ↓
-----------------------------------
| InventoryService                |
| PaymentService                  |
| OrderService                    |
| NotificationService             |
-----------------------------------
6️⃣ Why Facade Pattern Fits Here
Controller should not manage business workflows

Order logic spans multiple services

Changes in payment/inventory should not break API

Keeps controllers thin and readable

Makes testing & refactoring safer

✅ This is textbook real-world Facade usage.

7️⃣ Java Implementation (Executable & Clean)
📁 Package Structure
facade/
 ├── controller/
 │    └── OrderController.java
 ├── facade/
 │    └── OrderProcessingFacade.java
 ├── service/
 │    ├── InventoryService.java
 │    ├── PaymentService.java
 │    ├── OrderService.java
 │    └── NotificationService.java
 └── Main.java
InventoryService.java
package service;

public class InventoryService {
    public boolean isStockAvailable(String productId) {
        System.out.println("Checking inventory for product: " + productId);
        return true;
    }
}
PaymentService.java
package service;

public class PaymentService {
    public boolean processPayment(String userId, double amount) {
        System.out.println("Processing payment for user: " + userId);
        return true;
    }
}
OrderService.java
package service;

public class OrderService {
    public void createOrder(String userId, String productId) {
        System.out.println("Creating order for user: " + userId);
    }
}
NotificationService.java
package service;

public class NotificationService {
    public void sendOrderConfirmation(String userId) {
        System.out.println("Sending order confirmation to user: " + userId);
    }
}
⭐ OrderProcessingFacade.java (CORE)
package facade;

import service.InventoryService;
import service.PaymentService;
import service.OrderService;
import service.NotificationService;

public class OrderProcessingFacade {

    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final OrderService orderService;
    private final NotificationService notificationService;

    public OrderProcessingFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.orderService = new OrderService();
        this.notificationService = new NotificationService();
    }

    public void placeOrder(String userId, String productId, double amount) {

        if (!inventoryService.isStockAvailable(productId)) {
            throw new RuntimeException("Product out of stock");
        }

        if (!paymentService.processPayment(userId, amount)) {
            throw new RuntimeException("Payment failed");
        }

        orderService.createOrder(userId, productId);
        notificationService.sendOrderConfirmation(userId);

        System.out.println("Order placed successfully!");
    }
}
OrderController.java
package controller;

import facade.OrderProcessingFacade;

public class OrderController {

    private final OrderProcessingFacade orderFacade;

    public OrderController() {
        this.orderFacade = new OrderProcessingFacade();
    }

    public void placeOrderRequest() {
        orderFacade.placeOrder("user123", "product456", 999.99);
    }
}
Main.java (Run & Test)
import controller.OrderController;

public class Main {
    public static void main(String[] args) {
        OrderController controller = new OrderController();
        controller.placeOrderRequest();
    }
}
8️⃣ Runtime Flow (Step-by-Step)
Main calls OrderController.placeOrderRequest()

Controller calls only OrderProcessingFacade

Facade internally:

Checks inventory

Processes payment

Creates order

Sends notification

Controller never sees internal services

🎯 Controller → Facade → Subsystems

9️⃣ Law of Demeter (Very Important 🔥)
Definition (Simple Language)
A class should talk only to its direct friends, not strangers’ friends.

❌ Bad:

controller.getOrderService().getPaymentService().process();
✅ Good:

orderFacade.placeOrder();
Relation Between Facade & Law of Demeter
Law of Demeter	Facade Pattern
Limits knowledge of internals	Hides internals completely
Reduces tight coupling	Provides single entry point
Improves maintainability	Improves API design
👉 Facade is a practical way to APPLY Law of Demeter

🔟 Common Beginner Mistakes
❌ Mistake 1: Facade becomes God Class
Putting business logic + validation + DB logic inside Facade
✔ Facade should orchestrate, not own logic

❌ Mistake 2: Controller still calling services directly
Defeats the whole purpose
✔ Controller must depend only on Facade

1️⃣1️⃣ How This Helps in Interviews & Production
In Interviews
Shows understanding of clean architecture

Demonstrates API boundary thinking

Easy to explain with real backend examples

Interviewers love hearing:
“Controller talks only to facade”

In Production
Faster onboarding for new devs

Safer refactoring

Cleaner APIs

Easier testing (mock facade)

1️⃣2️⃣ When to Use Facade (Rule of Thumb)
Use Facade when:

One operation touches multiple services

You want thin controllers

You want to follow Law of Demeter

You want a stable API surface

If you want next:

Facade + Spring Boot

Facade vs Service Layer confusion

Facade combined with Adapter / Strategy

Convert this into real REST API

Just tell me 👍

You said:
readme
ChatGPT said:
Below is a complete, clean README.md you can directly copy-paste into your project.
It is interview-ready, practical, and runnable, matching exactly what you implemented.

🧩 Facade Pattern – Order Processing Backend (Java)
📌 Overview
This project demonstrates the Facade Design Pattern using a realistic backend use case:
Order Processing in an E-commerce system.

The goal is to show how a single, simple interface (Facade) hides the complexity of multiple backend subsystems like inventory, payment, order creation, and notifications.

This is not a toy example — it mirrors how real production backends are structured.

🧠 Facade Pattern (Quick Explanation)
Facade provides a single unified interface to multiple complex subsystems.

Clients interact with one entry point, not many services.

Internal complexity is hidden.

Improves readability, loose coupling, and maintainability.

Helps enforce clean architecture and Law of Demeter.

🏗️ System Use Case
Scenario: Place an Order
Placing an order requires:

Checking inventory

Processing payment

Creating order

Sending confirmation

Without Facade → Controller talks to multiple services
With Facade → Controller talks to one class

📦 Project Structure
src/
 ├── controller/
 │    └── OrderController.java
 ├── facade/
 │    └── OrderProcessingFacade.java
 ├── service/
 │    ├── InventoryService.java
 │    ├── PaymentService.java
 │    ├── OrderService.java
 │    └── NotificationService.java
 └── Main.java
🔁 Data Flow
Main
 ↓
OrderController
 ↓
OrderProcessingFacade
 ↓
--------------------------------
| InventoryService              |
| PaymentService                |
| OrderService                  |
| NotificationService           |
--------------------------------
🎯 Why Facade Pattern Fits Here
Controllers should be thin

Business workflows span multiple services

Internal services may change frequently

API surface must remain stable

Reduces coupling between layers

🧪 How to Run the Project
Prerequisites
Java 8 or higher

Any IDE (VS Code / IntelliJ)

Steps
Clone or create the project

Place files according to directory structure

Run Main.java

Expected Output
Checking inventory for product: product456
Processing payment for user: user123
Creating order for user: user123
Sending order confirmation to user: user123
Order placed successfully!
🔍 Runtime Execution Flow
Main starts the application

OrderController receives request

Controller calls only the Facade

Facade orchestrates:

Inventory check

Payment

Order creation

Notification

Controller remains unaware of internals

📏 Law of Demeter (LoD)
Definition
A class should talk only to its direct collaborators, not to internal objects of other classes.

Without Facade (Violation)
controller.getPaymentService().processPayment();
With Facade (Correct)
orderFacade.placeOrder();
Relationship with Facade
Law of Demeter	Facade Pattern
Limits object knowledge	Hides subsystem complexity
Reduces tight coupling	Provides single entry point
Improves maintainability	Cleaner API boundaries
👉 Facade is a practical implementation of Law of Demeter

⚠️ Common Mistakes
❌ Facade becomes a God Class
Adding business rules, DB logic, validations inside Facade
✅ Facade should orchestrate, not own logic

❌ Controller still calling services directly
Completely defeats the pattern
✅ Controller must depend only on Facade

🎤 Interview Talking Points
“Facade keeps controllers thin”

“Facade enforces Law of Demeter”

“It stabilizes APIs while subsystems evolve”

“Very common in real backend systems”

🏭 Production Benefits
Easier refactoring

Faster onboarding

Cleaner APIs

Better testability

Safer changes

🧠 When to Use Facade Pattern
Use it when:

One operation touches multiple services

You want clean API boundaries

You want to reduce coupling

You follow layered architecture

🚀 Next Improvements (Optional)
Convert to Spring Boot REST API

Add exception handling layer

Add unit tests by mocking Facade

Combine with Strategy / Adapter patterns

✅ This project is production-style, interview-ready, and practical.
If you want, next we can:

Convert this to Spring Boot

Compare Facade vs Service Layer

Combine Facade with another design pattern

Just say the word 👍

You said:
give me in md format 
ChatGPT said:
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

## 📦 Project Structure

src/
├── controller/
│ └── OrderController.java
├── facade/
│ └── OrderProcessingFacade.java
├── service/
│ ├── InventoryService.java
│ ├── PaymentService.java
│ ├── OrderService.java
│ └── NotificationService.java
└── Main.java


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

### Expected Output
Checking inventory for product: product456   


Processing payment for user: user123  

Creating order for user: user123  


Sending order confirmation to user: user123  

Order placed successfully!  


