# Observer Pattern – Order Status Notification System (Java)

## 📌 Overview

This project demonstrates a **practical backend implementation of the Observer Design Pattern** using **Java**.

The system models a real-world **order status change workflow** where multiple backend services (Notification, Inventory, Analytics) automatically react when an order’s status changes — without tight coupling between services.

This project is designed for:
- Low-Level Design (LLD) interview preparation
- Backend system design practice
- Understanding event-driven architectures

---

## 🎯 Problem Statement

In real backend systems, a single event (like an order status update) often impacts multiple services:

- Notifications must be sent
- Inventory must be updated
- Analytics must be recorded

Hard-coding these dependencies leads to tight coupling and poor scalability.

---

## 💡 Solution

We use the **Observer Pattern**:

- `OrderService` acts as the **Subject**
- Multiple services act as **Observers**
- Observers register themselves and get notified automatically when the order state changes

This ensures:
- Loose coupling
- Easy extensibility
- Clean separation of concerns





