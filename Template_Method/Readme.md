# Template Method Pattern – Backend File Import System (Java)

## 📌 Overview
This project demonstrates the **Template Method Design Pattern** using a realistic backend use case:  
a **File Import Service** that supports multiple file formats (CSV, JSON) while enforcing a fixed import workflow.

The focus is on **practical Low-Level Design**, clean Java code, and interview-ready explanations.

---

## 🎯 What Problem Are We Solving?
In backend systems, file imports usually follow the same steps:
1. Validate the file
2. Parse the file
3. Transform the data
4. Save data to the database
5. Send notification

However, **parsing and transformation differ** based on file type.

We want:
- One **fixed workflow**
- Customizable steps per file type
- No code duplication
- Strong control over execution order

This is exactly where the **Template Method Pattern** fits.

---

## 🧠 Template Method Pattern (Quick Explanation)
The Template Method Pattern defines the **skeleton of an algorithm** in a base class and allows subclasses to override specific steps without changing the overall flow.

- Parent class controls the workflow
- Subclasses customize individual steps
- Execution order is guaranteed
- Common logic stays centralized

---

## 🧩 System Design

### Components
| Component | Responsibility |
|--------|----------------|
| `FileImportTemplate` | Defines the import workflow (template method) |
| `CsvFileImporter` | CSV-specific parsing and transformation |
| `JsonFileImporter` | JSON-specific parsing and transformation |
| `ImportService` | Entry point used by controllers/services |
| `Main` | Application runner for testing |

---

## 🧠 Why Template Method Works Here
- Import workflow must **never change**
- File-specific logic **must vary**
- Prevents duplicated validation and saving logic
- New file types can be added easily (Excel, XML)

---
