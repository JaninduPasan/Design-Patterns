# Facade Pattern

* ### A structural design pattern
* ### Provide a single, simplified interface to client classes to interact with a subsystem.
* ### Facade -> a wrapper that encapsulates a subsystem in order to hide the subsystem’s complexity; it acts as a point of entry into a subsystem without adding more functionality in itself. The wrapper class allows a client class to interact with the subsystem through the façade.

## Facade Design pattern steps

### 1. Design the interface.
### 2. Implement the interface with one or more classes.
### 3. Create the façade class and wrap the classes that implement the interface.
### 4. Use the façade class to access the subsystem.

## Summary

* ### Hides the complexity of a subsystem by encapsulating it behind a unifying wrapper called a façade class.
* ### Removes the need for client classes to manage a  subsystem on their own, which results in less coupling between the subsystem and the client classes.
* ### Handles instantiation and redirection of tasks to the appropriate class within the subsystem.
* ### Provides client classes with a simplified interface for the subsystem.
* ### Acts simply as a point of entry to a subsystem and does not add more functional subsystems.


## Example diagram

![img.png](../Facade%20diagram.png)