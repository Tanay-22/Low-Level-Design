**Chain of Responsibility Design Pattern**
=============================================

The Chain of Responsibility design pattern is a behavioral design pattern that allows passing a request to one of a series of potential handlers, without having to specify the receiver explicitly.

**Key Components**
-------------------

*   **Handler**: The interface or abstract class that defines the behavior of the handlers in the chain.
*   **Concrete Handler**: A concrete class that implements the Handler interface and handles the request.
*   **Client**: The object that creates the chain of handlers and sends the request.

**How it Works**
----------------

1.  **Client**: The client creates a chain of handlers by linking them together.
2.  **Request**: The client sends a request to the first handler in the chain.
3.  **Handler**: Each handler in the chain receives the request and checks if it can handle it. If it can, it processes the request and returns a response.
4.  **Passing**: If a handler cannot handle the request, it passes it to the next handler in the chain.
5.  **Response**: The response is returned to the client.

**Example**
------------

*   **ATM**: The client is the ATM, which creates a chain of handlers (e.g., cash dispenser, card reader).
*   **Request**: The client sends a request to withdraw money.
*   **Handler**: Each handler in the chain (e.g., cash dispenser, card reader) receives the request and checks if it can handle it. If it can, it processes the request and returns a response.

**Benefits**
------------

*   **Decoupling**: The client is decoupled from the specific handler that will process the request.
*   **Flexibility**: New handlers can be added to the chain without modifying the client code.
*   **Scalability**: The chain of handlers can be extended to handle complex requests.