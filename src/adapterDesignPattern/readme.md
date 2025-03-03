**Adapter Design Pattern**

The adapter design pattern is a bridge between two incompatible interfaces. It allows a client to use an existing interface that is not compatible with the required interface.

**Key Components**

*   **Client**: The entity that wants to use the existing interface.
*   **Existing Interface**: The interface that is not compatible with the required interface.
*   **Adapter Interface**: The interface that the client wants to use.
*   **Concrete Adapter Class**: The class that implements the adapter interface and adapts the existing interface.

**Relationship between Components**

*   The client implements the adapter interface.
*   The concrete adapter class implements the adapter interface and adapts the existing interface.
*   The existing interface is adapted by the concrete adapter class.

**Benefits of Adapter Design Pattern**

*   It allows a client to use an existing interface that is not compatible with the required interface.
*   It provides a way to change an existing interface without changing the client code.
*   It provides a way to add new functionality to an existing interface without changing the client code.

**Real-World Examples**

*   Power adapter and socket: An adapter is used to convert the shape of the power adapter to match the socket.
*   XML to JSON parser: An adapter is used to convert XML data to JSON data.
*   Weight machine: An adapter is used to convert the weight from pounds to kilograms.

**Use Cases**

*   When a client wants to use an existing interface that is not compatible with the required interface.
*   When a new interface is added to an existing system and the client code needs to be modified to use the new interface.
*   When an existing interface needs to be changed without changing the client code.

**Interview Questions**

*   How do you handle cases where the request or response is different from what is expected?
*   How do you design an adapter to convert between incompatible interfaces?
*   How do you use the adapter design pattern to add new functionality to an existing interface?