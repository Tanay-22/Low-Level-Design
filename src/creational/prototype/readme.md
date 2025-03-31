## Prototype Design Pattern Notes

### Problem

* Creating a copy (clone) of an existing object is expensive.
* The original object has many instance variables, making it difficult to copy only the necessary ones.
* The client (calling code) needs to know about the original object's fields and which ones to copy.

### Issues with Existing Cloning Approach

* Private instance variables cannot be accessed directly.
* The client needs to know about the original object's fields and which ones to copy.

### Solution - Prototype Design Pattern

* The original object class exposes a `clone()` method.
* The `clone()` method takes responsibility for copying the object's fields.
* The client can call `clone()` on the original object to create a copy.
* The `clone()` method knows about its own fields and can copy or leave out fields as needed.

### Key Benefits

* Decouples the client from the original object's implementation.
* Simplifies the cloning process by moving the logic to the original object class.
* Ensures consistency across classes that implement the `clone()` method.

### Implementation

1. Create a `Prototype` interface with a `clone()` method.
2. Have classes that need to support cloning implement the `Prototype` interface.
3. In the implementing class, override the `clone()` method to copy the object's fields.
4. In the client code, call `clone()` on the original object to create a copy.

### Example

* Original object class (`Student`) implements `Prototype` interface.
* `Student` class exposes a `clone()` method that copies its fields.
* Client code calls `clone()` on the original `Student` object to create a copy.