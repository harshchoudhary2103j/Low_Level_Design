Coffee Vending Machine – Decorator Pattern (Java)

Overview

This project demonstrates the Decorator Design Pattern using a Coffee Vending Machine backend example.It is designed for Low-Level Design (LLD) and System Design interview preparation with clean, runnable, production-style Java code.

The focus is on hands-on understanding rather than theory.

Problem Statement

In a coffee vending machine system:

There is a base coffee.Customers can add optional items like Milk, Sugar, and Cream.Add-ons can be combined in any order.Each add-on increases the total price and description.

We must avoid creating multiple subclasses such as:
CoffeeWithMilk 
CoffeeWithMilkAndSugar 
CoffeeWithMilkSugarCream

This would lead to class explosion and poor maintainability.

Design Pattern Used

Decorator Pattern

Intent:Add new behavior to an object dynamically without modifying its existing code.

Why this pattern fits here:

Add-ons are optional and dynamicBehavior is layered at runtimeAvoids subclass explosionFollows the Open–Closed Principle

High-Level Design

Core Components and Responsibilities:

CoffeeDefines the contract for cost and description.

BasicCoffeeConcrete implementation of Coffee representing plain coffee.

CoffeeDecoratorAbstract wrapper that implements Coffee and holds a reference to another Coffee.

MilkDecoratorAdds milk behavior (cost and description).

SugarDecoratorAdds sugar behavior (cost and description).

CreamDecoratorAdds cream behavior (cost and description).

CoffeeMachineMain class that simulates the backend flow and runs the application.

Runtime Data Flow

Client creates a BasicCoffee object.BasicCoffee is wrapped by MilkDecorator.MilkDecorator is wrapped by SugarDecorator.SugarDecorator is wrapped by CreamDecorator.

The final object contains layered behavior from all decorators.

Each decorator:Delegates the call to the wrapped objectAdds its own cost and description

Project Directory Structure

coffee-machinesrccom.vendingmachineCoffee.javaBasicCoffee.javaCoffeeDecorator.javaMilkDecorator.javaSugarDecorator.javaCreamDecorator.javaCoffeeMachine.java

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

Navigate to the src directory.Compile all Java files in the com.vendingmachine package.Run the CoffeeMachine class.

Expected Output:

Order: Basic Coffee, Milk, Sugar, CreamTotal Cost: ₹80.0

Testing Different Orders

Decorators can be added, removed, or reordered at runtime.

Example:You can create a coffee with only Sugar and Milk by changing the order of decorators in CoffeeMachine.

This demonstrates runtime flexibility.

Common Beginner Mistakes

Mistake 1: Using inheritance instead of decoratorsThis leads to too many subclasses and poor scalability.

Mistake 2: Decorators not implementing the same interfaceThis breaks polymorphism and prevents chaining.

Interview Takeaway

A strong interview explanation would be:

“Decorator Pattern is used when we need to add responsibilities dynamically at runtime without modifying existing classes. I implemented it using a coffee vending machine example, similar to how pricing engines and middleware pipelines work in real backend systems.”

Possible Extensions

Add coffee sizes (Small, Medium, Large)Integrate with Spring BootAdd unit tests using JUnitConvert this into a real pricing engine

End Note

This project gives practical, executable understanding of the Decorator Pattern and prepares you for both interviews and real backend system design.