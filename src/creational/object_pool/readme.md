## Object Pool Design Pattern Notes

### Category: 
Creational Design Pattern

### Description: 
Manages a pool of reusable objects, such as DB connections, to improve performance and reduce resource creation overhead.

### Key Components:

1. **Resource**: The object that needs to be managed, e.g., DB connection.
2. **Resource Pool Manager**: Manages the pool of resources, including free and in-use resources.
3. **Free List**: A list of available resources that can be used.
4. **In-Use List**: A list of resources currently being used.
5. **Initial Pool Size**: The number of resources initially created in the pool.
6. **Maximum Pool Size**: The maximum number of resources that can be created in the pool.

### Resource Pool Manager Methods:

1. **Get Resource**: Returns a resource from the free list if available, or creates a new one if the free list is empty and the in-use list is below the maximum pool size.
2. **Release Resource**: Returns a resource from the in-use list to the free list.

### Example Code:

* Create a resource pool manager with an initial pool size and maximum pool size.
* Create a resource (e.g., DB connection).
* Expose a `Get DB Connection` method that returns a resource from the free list if available, or creates a new one if the free list is empty and the in-use list is below the maximum pool size.
* Expose a `Release DB Connection` method that returns a resource from the in-use list to the free list.

### Common Mistake:

* Not considering the scenario where the in-use list is at maximum capacity, and a new resource cannot be created. In this case, the `Get Resource` method should return null.