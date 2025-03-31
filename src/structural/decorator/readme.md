# **Decorator Design Pattern**

## **Definition**
The **Decorator Design Pattern** is a structural pattern that allows adding new functionalities to objects dynamically without modifying their existing code. It provides an alternative to subclassing by enabling flexible and reusable enhancements.

## **Key Characteristics**
- **Composition Over Inheritance** – Instead of creating multiple subclasses, behavior is added through object composition.
- **Open/Closed Principle** – New functionalities can be added without modifying existing classes.
- **Extensibility** – Multiple decorators can be combined to enhance an object.
- **Transparent Wrapping** – The decorated object still behaves like the original type, allowing seamless integration.

## **Concepts in Example**
1. **Base Component**: Defines the core functionality (e.g., base pizza).
2. **Concrete Components**: Implements the base functionality (e.g., specific pizza types).
3. **Decorator (Abstract Class)**: Acts as an interface to ensure all decorators behave like the base component.
4. **Concrete Decorators**: Extend functionalities dynamically (e.g., adding extra cheese or mushrooms).

## **Workflow in the Example**
- A pizza type (e.g., Margherita) is created as the base object.
- A decorator (e.g., Extra Cheese) wraps the base object, adding its own functionality while keeping the original behavior.
- Multiple decorators can be stacked to provide additional enhancements (e.g., Extra Cheese + Mushrooms).
- Each decorator modifies the behavior dynamically without altering the base class.

## **Advantages**
- **Enhances Functionality Dynamically** – Behaviors can be changed at runtime.
- **Avoids Subclass Explosion** – Reduces the need for creating multiple subclasses for each variation.
- **Encapsulated Behavior** – Each decorator has a single responsibility, keeping the system modular.

## **Use Cases**
- **Graphical User Interfaces** – Adding scrollbars, borders, or themes dynamically.
- **Logging Frameworks** – Adding different logging levels like file logging, console logging, etc.
- **Java I/O Streams** – Wrapping streams to add buffering, compression, or encryption.
- **Text Processing** – Applying filters like bold, italics, or underline dynamically.

## **When to Use**
- When adding functionality dynamically without modifying the base class.
- When avoiding a complex hierarchy of subclasses.
- When needing multiple independent modifications that can be combined flexibly.

---