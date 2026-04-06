## Factory Objects

* ### Creating objects without having to specify the class
* ### An object whose role is to create “product” objects of particular types
* ### Concrete instantiation is the primary purpose of Factories. In general, a factory object is an instance of a factory class, which has a method to create product objects

## Benefits of Factory Objects

* ### much simpler to add new types of an object to the object factory without modifying the client code
* ### Factories allow client code to operate on generalizations. This is known as coding to an interface, not an implementation

#
# Factory Method Pattern

* ### A creational pattern, which describes a way to create an object.
* ### The Factory method pattern does not use a factory object to create the objects; instead, the Factory method uses a separate “method” in the same class to create objects.
