## Template Method Design Pattern Notes

### Category: 
Behavioral

### Why it's required: 
To ensure that all classes follow specific steps to process a task while providing flexibility for each class to have its own logic in those steps.

### Problem: 
When you want all classes to follow a specific sequence of steps to process a task, but also need to provide flexibility for each class to have its own logic in those steps.

### Solution: 
Use the Template Method design pattern.

### Key characteristics:

* All classes must follow a specific sequence of steps to process a task.
* Each class needs to have its own logic in those steps.
* The template method defines the order of steps to execute the task.

### Example:

* Task: Send money
* Steps:
    1. Validate request
    2. Debit amount
    3. Calculate fees
    4. Credit amount
* Each class (e.g. Pay to Friend, Pay to Merchant) can override the abstract methods to provide its own implementation.

### Template Method implementation:

* Create an abstract class with a template method (e.g. `sendMoney()`).
* Define the steps to be executed in the template method (e.g. `validateRequest()`, `debitAmount()`, `calculateFees()`, `creditAmount()`).
* Make the template method `final` to prevent child classes from overriding it.
* Allow child classes to override the abstract methods to provide their own implementation.

### Benefits:

* Ensures that all classes follow a specific sequence of steps to process a task.
* Provides flexibility for each class to have its own logic in those steps.
* Encapsulates the common behavior in the template method, making it easier to maintain and extend.