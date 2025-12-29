# Adapter Pattern – Payment Gateway Integration (Java)

## 📌 Overview

This project demonstrates a **real-world backend use case** of the **Adapter Design Pattern** using a **Payment Gateway Integration system**.

In real production systems, backend services often integrate with multiple third-party APIs (Stripe, PayPal, Razorpay, etc.), each having different interfaces.  
The Adapter Pattern allows our application to interact with these external systems **without changing core business logic**.

---

## 🎯 Problem Statement

- Different payment providers expose **different APIs**
- Business logic should not depend directly on third-party SDKs
- Switching or adding payment providers should not break existing code

---

## ✅ Solution: Adapter Pattern

The Adapter Pattern:
- Converts incompatible interfaces into a **common interface**
- Keeps business logic **clean and stable**
- Allows easy addition of new payment providers

---

## 🏗️ System Design

### Components

| Component | Responsibility |
|--------|----------------|
| `PaymentProcessor` | Common interface for payment processing |
| `StripePaymentAdapter` | Adapts Stripe API to `PaymentProcessor` |
| `PaypalPaymentAdapter` | Adapts PayPal API to `PaymentProcessor` |
| `StripeClient` | Simulated external Stripe SDK |
| `PaypalClient` | Simulated external PayPal SDK |
| `PaymentService` | Business logic layer |
| `Main` | Application entry point |


---

## 🔄 Data Flow (Runtime)

### Stripe Payment Flow
1. `Main` creates `StripeClient`
2. `StripePaymentAdapter` wraps `StripeClient`
3. `PaymentService` depends on `PaymentProcessor`
4. `checkout()` calls `processPayment()`
5. Adapter converts amount and calls Stripe API

### PayPal Payment Flow
Same business logic, different adapter.

➡️ **Business code remains unchanged**

---

## 💡 Why Adapter Pattern Fits Here

- External SDKs **cannot be modified**
- Each provider has a **different API**
- Business logic must remain **independent**
- New providers can be added without touching existing code

---

## ▶️ How to Run the Project

### Prerequisites
- Java 8 or above
- VS Code / IntelliJ / Any Java IDE

### Steps
1. Clone or download the project
2. Open the project in your IDE
3. Compile and run `Main.java`

### Sample Output
Stripe payment processed: 9999 cents
PayPal payment processed: $49.5


---

## 🚫 Common Mistakes to Avoid

### ❌ Using external SDK directly in business logic
- Causes tight coupling
- Makes switching providers risky

### ❌ Creating one adapter for multiple providers
- Violates Single Responsibility Principle
- Hard to maintain and test

---

## 🎤 Interview Explanation (Short & Crisp)

> The Adapter Pattern allows incompatible interfaces to work together by introducing a common interface, enabling clean integration of third-party services without affecting core business logic.

---

## 🚀 Production Benefits

- Clean architecture
- Easy third-party integration
- Better unit testing
- Safe vendor switching
- SOLID principle compliance

---

## 📌 Conclusion

This project shows how the Adapter Pattern is **actually used in real backend systems**, especially for payment gateways and third-party integrations.

It is practical, extensible, and production-ready.

---
