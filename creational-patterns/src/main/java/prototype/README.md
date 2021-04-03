# Prototype Pattern

**Prototype** is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

**Identification:** The prototype can be easily recognized by a clone or copy methods, etc.

### Concepts

- Avoid costly creation
- Avoid subclassing
- Typically doesn't use "new"
- Often utilizes an Interface
- Usually implementy with a Registry
- Example:
  - java.lang.Object#clone()

### Design

- Clone / Cloneable
- Avoids keyword "new"
- Although a copy, each instance unique
- Costly construction not handled by client
- Can still utilize parameters for construction
- Shallow VS Deep Copy

### Pros

- You can clone objects without coupling to their concrete classes.
- You can get rid of repeated initialization code in favor of cloning pre-built prototypes.
- You can produce complex objects more conveniently.
- You get an alternative to inheritance when dealing with configuration presets for complex objects.

### Cons

- Cloning complex objects that have circular references might be very tricky.

### Pitfalls

- Sometimes not clear when to use
- Used with other Patterns
  - Registry
- Shallow VS Deep Copy# Prototype Pattern

**Prototype** is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

**Identification:** The prototype can be easily recognized by a clone or copy methods, etc.

### Concepts

- Avoid costly creation
- Avoid subclassing
- Typically doesn't use "new"
- Often utilizes an Interface
- Usually implementy with a Registry
- Example:
  - java.lang.Object#clone()

### Design

- Clone / Cloneable
- Avoids keyword "new"
- Although a copy, each instance unique
- Costly construction not handled by client
- Can still utilize parameters for construction
- Shallow VS Deep Copy

### Pros

- You can clone objects without coupling to their concrete classes.
- You can get rid of repeated initialization code in favor of cloning pre-built prototypes.
- You can produce complex objects more conveniently.
- You get an alternative to inheritance when dealing with configuration presets for complex objects.

### Cons

- Cloning complex objects that have circular references might be very tricky.

### Pitfalls

- Sometimes not clear when to use
- Used with other Patterns
  - Registry
- Shallow VS Deep Copy