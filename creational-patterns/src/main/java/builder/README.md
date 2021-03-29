# Builder Pattern

Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.


## Concepts

- Handles complex constructors
- Large number of parameters
- Immutability
- Example:
  - StringBuilder
  - DocumentBuilder
  - Locale.Builder

## Design

- Flexibility over telescoping  constructors
- Static inner class
- Calls appropriate constructor
- Negates the need to exposed setts
- Java 1.5+ can take advantages of Generics

### Everyday Example - String Builder

```java
StringBuilder builder = new StringBuilder();
      builder.append("This is an example ");
      builder.append("of the builder pattern. ");
      builder.append("It has methods to append ");
      builder.append("almost anything we want to a String. ");
      builder.append(42);
```

### Pros

- You can construct objects step-by-step, defer construction steps or run steps recursively.
- You can reuse the same construction code when building various representations of products.
- *Single Responsibility Principle*. You can isolate complex construction code from the business logic of the product.

### Cons

- The overall complexity of the code increases since the pattern requires creating multiple new classes.cult to unit test the client code of the Singleton because many test frameworks rely on inheritance when producing mock objects. Since the constructor of the singleton class is private and overriding static methods is impossible in most languages, you will need to think of a creative way to mock the singleton. Or just don’t write the tests. Or don’t use the Singleton pattern.