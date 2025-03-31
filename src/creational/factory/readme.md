## **Factory Design Pattern**

✅ **What it is?**
- A pattern that provides an interface for creating objects but allows subclasses to decide which class to instantiate.
- Hides object creation logic from the client.

✅ **How it works?**
- A single **factory class** contains a method that returns objects based on input parameters.
- The client does not directly use the `new` keyword; instead, it calls the factory method.

✅ **Example Use Case:**
- Creating different types of vehicles (`Car`, `Bike`) from a `VehicleFactory`.
- Choosing different payment methods (`CreditCard`, `PayPal`) dynamically.

✅ **When to use?**
- When a class needs to delegate object creation.
- When you want to centralize and simplify object instantiation.
- Use **Factory Pattern** if you need a **single point of object creation**.

---