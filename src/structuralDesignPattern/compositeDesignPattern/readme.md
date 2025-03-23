# Composite Design Pattern Theory

The composite design pattern is a structural design pattern that allows clients to treat individual objects and compositions of objects uniformly. This pattern is used when a group of objects should be treated as a single unit.

**Key Concepts**

* **Composite**: An object that contains other objects, either individual or composite, and provides a way to interact with them as a single unit.
* **Leaf**: An individual object that cannot be further decomposed.
* **Client**: The object that uses the composite object.

**Problem Statement**

The problem statement is designing a file system. The file system can have files or directories, and directories can have files or subdirectories. This creates a tree-like structure, where a directory can contain multiple files or subdirectories.

**Solution**

The composite design pattern solves this problem by introducing an interface called `FileSystem`. This interface has a `LS` method that can be implemented by both individual objects (files) and composite objects (directories).

* **Leaf Node**: The file class implements the `FileSystem` interface and has a `LS` method that prints the file name.
* **Composite Node**: The directory class implements the `FileSystem` interface and has a `LS` method that iterates over the list of `FileSystem` objects it contains and calls their `LS` methods.

**Benefits**

* **Uniform Treatment**: Clients can treat individual objects and compositions of objects uniformly.
* **Reduced Complexity**: The composite design pattern reduces the complexity of the code by avoiding multiple if-else conditions to determine the type of object.

**Real-World Examples**

* Employee hierarchy: An employee can have a manager, who can have a team, who can have individual employees.
* File system: A directory can contain files or subdirectories.
* Delivery box: A box can contain a product or another box.

**Key Takeaways**

* The composite design pattern is used to treat individual objects and compositions of objects uniformly.
* It introduces an interface that can be implemented by both individual objects and composite objects.
* It reduces complexity by avoiding multiple if-else conditions to determine the type of object.