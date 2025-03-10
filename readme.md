## 1. **Creational Patterns**
Focus on object creation mechanisms, trying to create objects in a manner suitable to the situation.

| Pattern                  | Purpose                                                   | Example Use Case                                      |
|-------------------------|-----------------------------------------------------------|------------------------------------------------------|
| **Singleton**            | Ensures a class has only one instance and provides a global point of access. | Logger, Configuration class                          |
| **Factory Method**      | Defines an interface for creating an object but lets subclasses alter the type of objects that will be created. | ShapeFactory, VehicleFactory                        |
| **Abstract Factory**    | Produces families of related objects without specifying their concrete classes. | GUI toolkits supporting multiple themes             |
| **Builder**             | Separates the construction of a complex object from its representation. | Building complex documents or objects (e.g., House) |
| **Prototype**           | Creates new objects by copying an existing object (clone). | Game characters cloning                             |

---

## 2. **Structural Patterns**
Deal with object composition, creating relationships between objects to form larger structures.

| Pattern                  | Purpose                                                   | Example Use Case                                      |
|-------------------------|-----------------------------------------------------------|------------------------------------------------------|
| **Adapter**             | Converts one interface to another that a client expects. | Integrating old system with a new interface          |
| **Decorator**          | Adds new functionality to an object dynamically.          | Adding scrollbars to a window at runtime            |
| **Composite**          | Composes objects into tree structures to represent part-whole hierarchies. | GUI components like buttons inside panels          |
| **Proxy**              | Provides a surrogate or placeholder for another object to control access. | Virtual Proxy, Protection Proxy                    |
| **Facade**             | Provides a simplified interface to a complex subsystem.  | Unified API for multiple subsystems (e.g., Home Theater Facade) |
| **Flyweight**          | Reduces the cost of creating and manipulating a large number of similar objects. | Text editors for character objects                 |
| **Bridge**             | Separates abstraction from implementation, allowing both to vary independently. | Remote control with multiple devices               |

---

## 3. **Behavioral Patterns**
Focus on communication between objects, making them work together smoothly.

| Pattern                  | Purpose                                                   | Example Use Case                                      |
|-------------------------|-----------------------------------------------------------|------------------------------------------------------|
| **Strategy**           | Defines a family of algorithms, encapsulates each one, and makes them interchangeable. | Payment methods (CreditCard, PayPal)                |
| **Observer**           | Notifies dependent objects automatically when one object changes. | Event handling systems, UI listeners                |
| **Command**            | Encapsulates a request as an object, thereby allowing parameterization and queuing of requests. | Undo operations in editors                          |
| **Mediator**           | Defines an object that encapsulates how a set of objects interact. | Chat room where all users communicate through a mediator |
| **Iterator**           | Provides a way to access elements of a collection sequentially without exposing the underlying representation. | Looping over a list or collection                   |
| **Chain of Responsibility** | Passes a request along a chain of handlers. | Logging framework with multiple log levels         |
| **Template Method**    | Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. | Algorithm steps like authentication process        |
| **State**              | Allows an object to alter its behavior when its internal state changes. | Vending machine with different states              |
| **Visitor**            | Separates an algorithm from the object structure it operates on. | Operations on object structures like AST           |
| **Interpreter**        | Defines a grammatical representation for a language and an interpreter to interpret sentences. | SQL parsing, Expression evaluation                  |
| **Memento**            | Captures and restores an object's internal state without violating encapsulation. | Saving game states                                  |
