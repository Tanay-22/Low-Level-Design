## Iterator Design Pattern

### Overview

* The iterator pattern is a behavioral design pattern that provides a way to access elements of a collection sequentially.
* It helps to access elements of a collection without exposing the underlying representation of the collection.

### Key Components

* **Iterator**: An interface that exposes two methods: `hasNext()` and `next()`.
    + `hasNext()`: Returns `true` if there are more elements in the collection, `false` otherwise.
    + `next()`: Returns the next element in the collection.
* **Concrete Iterator**: A class that implements the `Iterator` interface and provides the implementation of `hasNext()` and `next()` methods.
* **Aggregate**: An interface that exposes a method `createIterator()`, which returns an object of a concrete iterator.
* **Concrete Aggregate**: A class that implements the `Aggregate` interface and provides the implementation of `createIterator()` method.

### How it Works

1. The `Aggregate` interface exposes a method `createIterator()`, which returns an object of a concrete iterator.
2. The concrete aggregate provides the implementation of `createIterator()` method, which returns an object of a concrete iterator.
3. The client uses the `createIterator()` method to get an iterator object.
4. The iterator object provides a way to access elements of the collection sequentially using `hasNext()` and `next()` methods.

### Example

* Consider a `Library` class that maintains a collection of `Book` objects.
* The `Library` class implements the `Aggregate` interface and provides the implementation of `createIterator()` method, which returns an object of a concrete iterator.
* The client uses the `createIterator()` method to get an iterator object, which provides a way to access elements of the collection sequentially.

### Benefits

* Hides the underlying representation of the collection from the client.
* Provides a unified way to access elements of different types of collections.
* Allows for easy extension of the collection type without affecting the client code.