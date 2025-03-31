## Facade Design Pattern Notes

**What is Facade?**

* A design pattern used to hide the complexity of a system from the client.
* Facade provides a simple interface to the client, making it easier to use the system.

**When to Use Facade?**

* When you want to hide the system complexity from the client.
* When the client only needs to interact with a subset of the system's functionality.

**Characteristics of Facade:**

* Facade is a layer between the client and the system.
* Facade exposes only the necessary methods to the client.
* Facade takes the responsibility of creating and initializing objects of the components it interacts with.
* Facade is not mandatory; the client can interact directly with the system if needed.

**Scenarios where Facade can be used:**

1. **Scenario 1: Exposing certain methods to the client**
    * When the client only needs to interact with a subset of the system's functionality.
    * Example: Creating an employee facade to expose only the `insert` and `get employee detail` methods.
2. **Scenario 2: Complex system with multiple classes**
    * When the system has multiple classes that interact with each other.
    * Example: Creating a facade to simplify the interaction between the product, payment, invoice, and notification classes.