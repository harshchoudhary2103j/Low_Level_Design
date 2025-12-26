# 🧩 Command Pattern – Order Processing System (Java)

##  Overview

This project demonstrates the **Command Design Pattern** using a **realistic backend use case** — an **Order Processing System**.

The goal is to show how backend systems can **decouple request creation from execution**, enabling:
- Better separation of concerns
- Easier extensibility
- Support for queuing, logging, retries, and async execution

This implementation is **practical, executable, and interview-ready**.

---

## What is the Command Pattern?

The **Command Pattern** encapsulates a request as an object.  
This allows clients to parameterize requests, queue them, log them, or execute them later — without knowing the details of execution.

In simple words:  
**“Turn actions into objects and execute them later.”**

---

##  System Use Case

### Order Processing Flow
When a user places an order, the system must:
1. Reserve inventory  
2. Process payment  
3. Send confirmation email  

Each step is implemented as a **Command**.

---



