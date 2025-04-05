## Memento Pattern Notes

### Overview

The Memento pattern is a behavioral design pattern that allows an object to store its internal state in a separate object, called a Memento, so that it can be restored to a previous state later.

### Key Components

*   **Originator**: The object that needs to store its internal state. It creates and manages the Memento objects.
*   **Memento**: The object that holds the internal state of the Originator. It is used to restore the Originator to a previous state.
*   **Caretaker**: The object that manages the Memento objects. It is responsible for storing and retrieving the Memento objects.

### How it Works


1.  The Originator creates a Memento object when it needs to save its internal state.
2.  The Memento object is passed to the Caretaker, which stores it in a list.
3.  When the Originator needs to restore its internal state, it requests the last Memento object from the Caretaker.
4.  The Caretaker retrieves the last Memento object from the list and passes it to the Originator.
5.  The Originator uses the Memento object to restore its internal state.

### Benefits

*   The Memento pattern allows an object to store its internal state in a separate object, making it easier to manage and restore the state.
*   It provides a way to implement undo and redo functionality without exposing the internal implementation of the object.

### Example

In the video, an example is provided using a `Configuration` class as the Originator and a `ConfigurationMemento` class as the Memento. The `Caretaker` class is used to manage the Memento objects.

*   The `Configuration` class creates a `ConfigurationMemento` object when it needs to save its internal state (height and width).
*   The `Caretaker` class stores the `ConfigurationMemento` object in a list.
*   When the `Configuration` class needs to restore its internal state, it requests the last `ConfigurationMemento` object from the `Caretaker`.
*   The `Caretaker` retrieves the last `ConfigurationMemento` object from the list and passes it to the `Configuration` class.
*   The `Configuration` class uses the `ConfigurationMemento` object to restore its internal state (height and width).