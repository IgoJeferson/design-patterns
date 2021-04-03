# Factory Method Pattern

**Factory Method** is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

### Concepts

- Doesn't expose instantiation logic
- Defer to subclasses
- Common interface
- Specified by architecture, implemented by user
- Examples:
  - Calendar
  - ResourceBundle
  - NumberFormat

### Everyday Example - Calendar

```java
Calendar instance = Calendar.getInstance();
System.out.println(instance);
System.out.println(instance.get(Calendar.DAY_OF_MONTH));
```

### Pros

- You avoid tight coupling between the creator and the concrete products.
- *Single Responsibility Principle*. You can move the product creation code into one place in the program, making the code easier to support.
- *Open/Closed Principle*. You can introduce new types of products into the program without breaking existing client code.

### Cons

- The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.

### Factory Summary

- Parameter Driven
- Solves complex creation
- A little complex
- Opposite of a Singleton