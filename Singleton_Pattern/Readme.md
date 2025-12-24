# Singleton Pattern – Logger Example (Java)

## Overview

This project demonstrates a **practical and real-world implementation** of the **Singleton Design Pattern** using a **centralized application logger**.

The goal is to understand:
- Why Singleton is needed
- How it works at runtime
- How multiple backend services safely share a single instance

This example is **simple, executable, and interview-ready**.

---

## What is the Singleton Pattern?

The Singleton Pattern ensures that:
- Only **one instance** of a class exists in the entire application
- That instance is **globally accessible**
- Object creation is **controlled inside the class itself**

It is commonly used for shared resources like:
- Loggers
- Configuration managers
- Database connection pools
- Caches and metrics collectors

---

## Real-World Use Case: Application Logger

In backend systems:
- Multiple services need to log messages
- Logs should go to a single destination
- Creating multiple logger instances causes duplication and inconsistency

Hence, the **Logger** is a classic and valid use case for Singleton.



