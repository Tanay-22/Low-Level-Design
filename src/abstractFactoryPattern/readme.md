
## **Abstract Factory Design Pattern**
✅ **What it is?**
- A pattern that provides an interface for creating **families of related objects** without specifying their concrete classes.
- Also known as a **"Factory of Factories"**.

✅ **How it works?**
- There is a **super factory** that creates multiple factories.
- Each factory is responsible for creating a group of related products.

✅ **Example Use Case:**
- A `LuxuryVehicleFactory` that produces both **Luxury Cars** and **Luxury Bikes**.
- An `EconomyVehicleFactory` that produces **Economy Cars** and **Economy Bikes**.
- An `OSFactory` that can create UI elements for **Windows** and **Mac**.

✅ **When to use?**
- When you need to create **multiple related objects** together.
- When enforcing consistency among products in a family.
---

### **Comparison Table**
| Feature                | Factory Pattern                                    | Abstract Factory Pattern                          |
|------------------------|---------------------------------------------------|--------------------------------------------------|
| **Purpose**           | Creates objects of a single type.                 | Creates families of related objects.            |
| **Number of Factories** | One factory class.                                | Multiple factories (Factory of Factories).      |
| **Flexibility**       | Decides the object type at runtime.               | Ensures consistent creation of related objects. |
| **Complexity**        | Simple and easy to implement.                     | More complex due to multiple layers.            |

---