**Coffee Vending Machine** – Decorator Pattern (Java)

Overview

This project demonstrates the Decorator Design Pattern using a Coffee Vending Machine backend example.It is designed for Low-Level Design (LLD) and System Design interview preparation with clean, runnable, production-style Java code.

The focus is on hands-on understanding rather than theory.

**Problem Statement**

In a coffee vending machine system:

There is a base coffee.Customers can add optional items like Milk, Sugar, and Cream.Add-ons can be combined in any order.Each add-on increases the total price and description.

We must avoid creating multiple subclasses such as:
1.CoffeeWithMilk 

2.CoffeeWithMilkAndSugar 

3.CoffeeWithMilkSugarCream

This would lead to **class explosion and poor maintainability**.

**Design Pattern Used: Decorator Pattern**

**Intent:** Add new behavior to an object dynamically without modifying its existing code.

**Why this pattern fits here:**

1.Add-ons are optional and dynamicBehavior is layered at runtime.

2.Avoids subclass explosion

3.Follows the Open–Closed Principle

High-Level Design

Core Components and Responsibilities:

Coffee: Defines the contract for cost and description.

BasicCoffee: Concrete implementation of Coffee representing plain coffee.

CoffeeDecorator: Abstract wrapper that implements Coffee and holds a reference to another Coffee.

MilkDecorator: Adds milk behavior (cost and description).

SugarDecorator: Adds sugar behavior (cost and description).

CreamDecorator: Adds cream behavior (cost and description).

CoffeeMachine: Main class that simulates the backend flow and runs the application.

Runtime Data Flow

Client creates a BasicCoffee object.

BasicCoffee is wrapped by MilkDecorator.

MilkDecorator is wrapped by SugarDecorator.

SugarDecorator is wrapped by CreamDecorator.

The final object contains layered behavior from all decorators.

Each decorator:Delegates the call to the wrapped objectAdds its own cost and description


Execution Flow (Step by Step)

1.  CoffeeMachine creates a BasicCoffee object
    
2.  MilkDecorator wraps BasicCoffee
    
3.  SugarDecorator wraps MilkDecorator
    
4.  CreamDecorator wraps SugarDecorator
    
5.  getCost() and getDescription() are called on the outermost decorator
    
6.  Calls propagate inward and results are combined
    

How to Run the Project

Prerequisites:Java 8 or higherAny Java IDE (VS Code, IntelliJ, Eclipse)

Steps using terminal:

Navigate to the src directory.
Compile all Java files in the src.vendingmachine package.
Run the CoffeeMachine class.

Expected Output:

Order: Basic Coffee, Milk, Sugar, CreamTotal Cost: ₹80.0

Testing Different Orders

Decorators can be added, removed, or reordered at runtime.

Example:You can create a coffee with only Sugar and Milk by changing the order of decorators in CoffeeMachine.

This demonstrates runtime flexibility.


