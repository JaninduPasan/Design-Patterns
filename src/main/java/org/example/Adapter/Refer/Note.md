# Adapter Pattern

* ### A structural design pattern
* ### Facilitates communication between two existing systems by providing a compatible interface.


## Requirements for an Adapter

### The output of one system may not conform to the expected input of another system
### Happens when a pre-existing system needs to incorporate third-party libraries or need to connect to other system\


## Main Parts of a Adapter Design Pattern

* ### A client class -> system that want to use a third-party library or external system
* ### An adaptee class -> The third-party library or external system that is to be used
* ### An Adapter class -> Sits between the client and the adaptee. It conforms to what the client is expecting to see, by implementing a target interface. Also translates the client request into a message that the adaptee will understand, and returns the translated request to the adaptee. It's a kind of wrapper class.
* ### A target interface -> Used by the client to send a request to the adapter


## Adapter design pattern steps

### 1. Design the target interface
### 2. Implement the target interface with the adapter class
### 3. Send the request from the client to the adapter using the target interface.


## UML Diagram for Adapter Example

### Pre-existing web client that want to interact with another web service, that only support JSON objects.

![img.png](../Adapter%20Diagram.png)