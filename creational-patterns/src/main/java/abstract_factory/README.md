# AbstractFactory Pattern

**Abstract Factory** is a creational design pattern that lets you produce families of related objects without specifying their concrete classes

**Identification:** The pattern is easy to recognize by methods, which return a factory object. Then, the factory is used for creating specific sub-components.

### Concepts

- Factory of Factories
- Factory of related objects
- Common Interface
- Defer to Subclasses
- Examples:
  - DocumentBuilderFactory#newInstance()
  - TransformerFactory#newInstance()
  - Frameworks

### Pros

- You can be sure that the products you’re getting from a factory are compatible with each other.
- You avoid tight coupling between concrete products and client code.
- *Single Responsibility Principle*. You can extract the product creation code into one place, making the code easier to support.
- *Open/Closed Principle*. You can introduce new variants of products without breaking existing client code.

### Cons

- The code may become more complicated than it should be, since a lot of new interfaces and classes are introduced along with the pattern.

### Relations with Other Patterns

- Many designs start by using **[Factory Method](https://refactoring.guru/design-patterns/factory-method)** (less complicated and more customizable via subclasses) and evolve toward **[Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory)**, **[Prototype](https://refactoring.guru/design-patterns/prototype)**, or **[Builder](https://refactoring.guru/design-patterns/builder)** (more flexible, but more complicated).
- **[Builder](https://refactoring.guru/design-patterns/builder)** focuses on constructing complex objects step by step. **[Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory)** specializes in creating families of related objects. *Abstract Factory* returns the product immediately, whereas *Builder* lets you run some additional construction steps before fetching the product.
- **[Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory)** classes are often based on a set of **[Factory Methods](https://refactoring.guru/design-patterns/factory-method)**, but you can also use **[Prototype](https://refactoring.guru/design-patterns/prototype)** to compose the methods on these classes.
- **[Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory)** can serve as an alternative to **[Facade](https://refactoring.guru/design-patterns/facade)** when you only want to hide the way the subsystem objects are created from the client code.
- You can use **[Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory)** along with **[Bridge](https://refactoring.guru/design-patterns/bridge)**. This pairing is useful when some abstractions defined by *Bridge* can only work with specific implementations. In this case, *Abstract Factory* can encapsulate these relations and hide the complexity from the client code.
- **[Abstract Factories](https://refactoring.guru/design-patterns/abstract-factory)**, **[Builders](https://refactoring.guru/design-patterns/builder)** and **[Prototypes](https://refactoring.guru/design-patterns/prototype)** can all be implemented as **[Singletons](https://refactoring.guru/design-patterns/singleton)**.

## AbstractFactory Summary

- Group of similar Factories
- Complex
- Heavy abstraction
- Framework pattern