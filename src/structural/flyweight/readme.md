**Flyweight Design Pattern**
=====================================

### Definition

* The Flyweight design pattern is a structural design pattern that helps reduce memory usage by sharing data among multiple objects.
* Its main purpose is to reduce memory usage by sharing intrinsic data (data that doesn't change) among multiple objects.

### Characteristics

* **Intrinsic Data**: Data shared among objects, also known as instancing data.
* **Extrinsic Data**: Data that changes based on client input and differs from one object to another.

### Scenario

* Consider a game with an army of robots, each with a position (x, y), type (humanoid or robotic dog), and a bitmap image (Sprite).
* Creating 10 lakh objects would require a lot of memory (approximately 31 GB).
* The Flyweight pattern can be used to reduce memory usage by sharing the intrinsic data (type and Sprite) among multiple objects.

### Hints for Using Flyweight Pattern

* **Memory is limited**: Use Flyweight when memory is limited, and objects share data.
* **Objects share data**: If objects share intrinsic data, Flyweight can be used.
* **Creation of object is expensive**: Use Flyweight when creating objects is expensive, as it reduces the number of objects created.

### Key Takeaways

* The Flyweight pattern helps reduce memory usage by sharing intrinsic data among multiple objects.
* Identify when to use the Flyweight pattern by looking for scenarios where memory is limited, objects share data, and object creation is expensive.