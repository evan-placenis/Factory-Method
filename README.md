# Factory-Method (Creatonal)

The Factory Method design pattern is useful when:
- A class can't anticipate the class of objects it must create
- A class wants its subclasses to specify the objects it creates
- Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate

The Creator interface relies on it subclasses to define the factory method so that it returns an instance of the appropriate ConcreteProduct. This pattern eliminates the need to bind appliation specific classes into your code. 

There are two cases for the Creator:
1. The Creator class is an abstract class and does not provide an implementation for the factory method it declares
3. When the Creator is a concrete class and provides a default implementation for the factory method

Parameterized factory methods:
- A variation of the pattern that lets the factory method create multiple kinds of products. The parameter identifies the kind of object to create and all objects share the same product interface.

**Benefits:**
- Provides hooks for subclasses / Makes createing an object more flexible.
- Connects parallel class hierarchies


