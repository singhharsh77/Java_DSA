# ☕ Java OOP Interview Guide — Notes + MCQs + Advanced Scenarios
Reference : https://www.geeksforgeeks.org/java/oops-interview-questions-java-programming/

This document contains:

✅ Core OOP Concepts
✅ Interview Questions
✅ MCQs for Practice
✅ Advanced OOP Scenarios (Real Interview Level)

Perfect for:

* Java Interviews
* Backend Roles
* SDE Roles
* College Placements

---

# 📌 1. What is Object-Oriented Programming (OOP)?

A programming paradigm based on objects containing data (fields) and behavior (methods).

### Main Concepts

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

---

# 📌 2. Class and Object

## Class

A blueprint used to create objects.

```java
class Car {
    String brand;
    int speed;

    void showDetails() {
        System.out.println(brand + " runs at " + speed + " km/h");
    }
}
```

## Object

Instance of a class.

```java
Car c1 = new Car();
```

---

# 📌 3. Encapsulation

Wrapping data and methods together and restricting access.

```java
class Person {
    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
```

---

# 📌 4. Inheritance

Child class acquires properties of parent class.

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
```

---

# 📌 5. Polymorphism

One entity → many forms.

### Types

* Compile-time → Method Overloading
* Runtime → Method Overriding

---

# 📌 6. Abstraction

Hiding implementation details and showing functionality.

Ways:

* Abstract Class
* Interface

---

# 📌 7. IS-A vs HAS-A

| Relationship | Example          |
| ------------ | ---------------- |
| IS-A         | Dog IS-A Animal  |
| HAS-A        | Car HAS-A Engine |

---

# 📌 8. Constructor

Special method used to initialize objects.

Types:

* Default
* Parameterized
* Copy
* Private

---

# 📌 9. Static vs Instance Method

| Static           | Instance          |
| ---------------- | ----------------- |
| Belongs to class | Belongs to object |
| No `this`        | Uses `this`       |

---

# 🎯 Interview MCQs

## MCQ 1

Which OOP principle hides implementation details?

A. Inheritance
B. Encapsulation
C. Abstraction
D. Polymorphism

✅ **Answer:** C. Abstraction

---

## MCQ 2

Which keyword is used for inheritance?

A. implement
B. extends
C. inherits
D. super

✅ **Answer:** B. extends

---

## MCQ 3

Can constructors be overridden?

A. Yes
B. No

✅ **Answer:** B. No

---

## MCQ 4

Which supports multiple inheritance in Java?

A. Classes
B. Interfaces
C. Both
D. None

✅ **Answer:** B. Interfaces

---

## MCQ 5

Method Overloading occurs at:

A. Runtime
B. Compile-time
C. Both
D. Never

✅ **Answer:** B. Compile-time

---

## MCQ 6

Default value of object reference?

A. 0
B. null
C. undefined
D. garbage

✅ **Answer:** B. null

---

## MCQ 7

Which cannot be overridden?

A. Static Method
B. Instance Method
C. Abstract Method
D. Interface Method

✅ **Answer:** A. Static Method

---

## MCQ 8

Which concept represents HAS-A relationship?

A. Inheritance
B. Aggregation
C. Polymorphism
D. Abstraction

✅ **Answer:** B. Aggregation

---

## MCQ 9

Which access modifier is most restrictive?

A. public
B. protected
C. default
D. private

✅ **Answer:** D. private

---

## MCQ 10

Which is runtime polymorphism?

A. Overloading
B. Overriding
C. Constructors
D. Interfaces

✅ **Answer:** B. Overriding

---

# 🚀 Advanced OOP Scenarios (Important for Interviews)

These are **real interview-level concepts** asked in product companies.

---

# 🔥 1. Singleton Design Pattern

Only one object allowed.

```java
class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
```

Used in:

* Logging
* Configuration
* Database connections

---

# 🔥 2. Dependency Injection (Loose Coupling)

Instead of creating objects inside class, inject them.

```java
class Engine {}

class Car {

    private Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }
}
```

Used in:

* Spring Framework
* Enterprise Applications

---

# 🔥 3. Composition Over Inheritance

Preferred design principle.

Example:

Car HAS-A Engine instead of Car IS-A Engine.

Advantages:

* Flexible
* Maintainable
* Less coupling

---

# 🔥 4. Immutable Class

Object state cannot change after creation.

Steps:

1. Make class final
2. Make fields private final
3. No setters
4. Provide constructor

```java
final class Student {

    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

Example:

* String class

---

# 🔥 5. Method Overriding Rules

Important interview rules:

* Same method signature
* Return type same or covariant
* Access modifier cannot be more restrictive
* Cannot override static methods
* Cannot override private methods

---

# 🔥 6. Diamond Problem in Java

Java avoids multiple inheritance of classes to prevent ambiguity.

Solution:

Use Interfaces.

---

# 🔥 7. Abstract Class vs Interface (Interview Favorite)

| Abstract Class        | Interface                |
| --------------------- | ------------------------ |
| Can have constructors | Cannot have constructors |
| Supports state        | No instance state        |
| Single inheritance    | Multiple inheritance     |

---

# 🔥 8. Real World Scenario Question

### Question:

Design a Payment System supporting:

* Credit Card
* UPI
* PayPal

### Solution:

Use Interface Polymorphism.

```java
interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Paid using Credit Card");
    }
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}
```

---

# 🔥 9. Favor Composition Interview Question

Why composition better than inheritance?

Answer:

* Reduces tight coupling
* More flexible
* Runtime behavior change possible

---

# 🎯 Common Interview Questions

* Difference between abstraction and encapsulation?
* Why Java doesn’t support multiple inheritance?
* Can we override private method?
* Difference between overloading and overriding?
* What is marker interface?
* What is immutable class?
* What is singleton class?

---

# ✅ Conclusion

Mastering OOP is essential for:

* Java Developer Roles
* Backend Engineering
* System Design Basics
* Product Companies Interviews

---

# ⭐ Author

**Harsh Singh**
CSE (Cyber Security) — 2026
AWS Certified Solutions Architect – Associate

---
