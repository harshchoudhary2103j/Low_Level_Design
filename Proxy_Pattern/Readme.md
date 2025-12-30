# Proxy Pattern – Backend System Design (Java)

## Overview

This project demonstrates the **Proxy Design Pattern** using a realistic backend use case:
**secure access to confidential documents**.

The proxy controls access to the real service by performing **authorization checks and logging**
before delegating the request to the actual business logic.

This mirrors how proxies are used in real backend systems for:
- Security
- Logging
- Rate limiting
- Caching
- API gateways

---

## Proxy Pattern (Quick Explanation)

The Proxy Pattern provides a **substitute or wrapper** for another object to control access to it.
The client interacts with the proxy instead of the real object.
The proxy can add extra behavior like access control, logging, or caching **without modifying the real object**.
This keeps business logic clean and follows good design principles.

---

## Real-World Backend Use Case

**Secure Document Access System**

- Only ADMIN users can access confidential documents
- All access attempts must be logged
- Client should not deal with authorization logic
- Business logic should remain unchanged

This is exactly how:
- API Gateways
- Spring Security
- Hibernate lazy loading
- Microservice clients

work internally.

---

## System Design

### Components

| Component | Responsibility |
|---------|----------------|
| `DocumentService` | Interface for document operations |
| `RealDocumentService` | Actual business logic |
| `DocumentServiceProxy` | Authorization & logging |
| `UserContext` | Holds user details |
| `ClientApp` | Client using the service |

---

### Data Flow

ClientApp  

↓  

DocumentServiceProxy  

↓ (authorization passed)  

RealDocumentService  

↓  

Document Content  


---

### Why Proxy Pattern Fits Here

- Authorization is a **cross-cutting concern**
- Business logic remains clean
- Client code does not change if security rules change
- Easy to extend with caching, metrics, or rate limiting

--

