# Adapter Pattern

**Adapter** is a structural design pattern that allows objects with incompatible interfaces to collaborate.

### Concepts

- Plug adaptor
- Convert interface into another interface
- Legacy
- Translates requests
- Client, Adapter, Adaptee
- Examples:
  - Arrays → Lists
  - Streams

### Applicability

- **Use the Adapter class when you want to use some existing class, but its interface isn’t compatible with the rest of your code.**

  The Adapter pattern lets you create a middle-layer class that serves as a translator between your code and a legacy class, a 3rd-party class or any other class with a weird interface.


- **Use the pattern when you want to reuse several existing subclasses that lack some common functionality that can’t be added to the superclass.**

  You could extend each subclass and put the missing functionality into new child classes. However, you’ll need to duplicate the code across all of these new classes, which **[smells really bad](https://refactoring.guru/smells/duplicate-code)**.

  The much more elegant solution would be to put the missing functionality into an adapter class. Then you would wrap objects with missing features inside the adapter, gaining needed features dynamically. For this to work, the target classes must have a common interface, and the adapter’s field should follow that interface. This approach looks very similar to the **[Decorator](https://refactoring.guru/design-patterns/decorator)** pattern.

### Pros

- *Single Responsibility Principle*. You can separate the interface or data conversion code from the primary business logic of the program.
- *Open/Closed Principle*. You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface.

### Cons

- The overall complexity of the code increases because you need to introduce a set of new interfaces and classes. Sometimes it’s simpler just to change the service class so that it matches the rest of your code.

### Adapter Summary

- Simple solution
- Easy to implement
- Integrate with Legacy
- Can provide multiple adapters