# SOLID Principle

The SOLID principles were introduced by Robert C. Martin in his 2000 paper “Design Principles and Design Patterns.” 

SOLID principle stands for 

#### 1. Single Responsibility
#### 2. Open and closed 
#### 3. Liskov Substitution 
#### 4. Interface Segregation 
#### 5. Dependency Inversion


### 1. Single Responsibility
This principle states that a class should only have one responsibility. Furthermore, it should only have one reason to change.


### 2. Open and closed
Classes should be open for extension but closed for modification. In doing so, we stop ourselves from modifying existing code and causing potential new bugs in an otherwise happy application.

### 3. Liskov Substitution
The Liskov Substitution Principle (LSP) was introduced by Barbara Liskov. It applies to inheritance in such a way that the derived classes must be completely substitutable for their base classes. In other words, if class A is a subtype of class B, then we should be able to replace B with A without interrupting the behavior of the program.

### 4. Interface Segregation
The principle states that the larger interfaces split into smaller ones. Because the implementation classes use only the methods that are required. We should not force the client to use the methods that they do not want to use.

### 5. Dependency Inversion
The principle states that we must use abstraction (abstract classes and interfaces) instead of concrete implementations. High-level modules should not depend on the low-level module but both should depend on the abstraction. Because the abstraction does not depend on detail but the detail depends on abstraction. It decouples the software.