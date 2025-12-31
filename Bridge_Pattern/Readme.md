# Bridge Pattern – Backend Notification System (Java)

## Overview

This project demonstrates the **Bridge Design Pattern** using a **realistic backend notification system**.  
The goal is to separate **notification types** from **notification delivery mechanisms** so both can evolve independently.

This is **not a toy example** — the design mirrors real production systems used in backend services.

---

## What is the Bridge Pattern? (Interview Level)

The **Bridge Pattern** decouples an abstraction from its implementation so that both can change independently.  
It uses **composition instead of inheritance** to avoid class explosion.  
This pattern is useful when a system has **multiple dimensions of change**.  
It improves extensibility, testability, and maintainability.  

> **Key idea:** Separate *what the system does* from *how it does it*.

---

## Real-World Backend Use Case

### Notification Systems

In real backend systems:
- Notifications can be **Alerts, OTPs, Logs, Promotions**
- Delivery channels can be **Email, SMS, Push, WhatsApp**

Without Bridge → exponential class growth  
With Bridge → independent evolution of features

---

## Problem Statement

Design a notification system where:
- Notification types and delivery channels can change independently
- No tight coupling between business logic and infrastructure
- Easy to extend without modifying existing code

---

## Why Bridge Pattern Fits Here

- Two independent axes of change:
  - **Notification Type**
  - **Delivery Mechanism**
- Prevents inheritance explosion
- Follows **Open-Closed Principle**
- Encourages clean separation of concerns
- Easy to mock and test

---

## High-Level Design

### Dimensions

| Dimension | Responsibility |
|--------|---------------|
| Abstraction | What notification is sent |
| Implementation | How it is delivered |

---

## Components

### Abstraction Layer
- `Notification` (abstract class)
- `AlertNotification`
- `OtpNotification`

### Implementation Layer
- `NotificationSender` (interface)
- `EmailSender`
- `SmsSender`



