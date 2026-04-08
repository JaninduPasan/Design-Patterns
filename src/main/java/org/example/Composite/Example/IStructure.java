package org.example.Composite.Example;

/**
 * Interface that support polymorphism for the component and leaf classes
 * **/

public interface IStructure {
    public void enter();
    public void exit();
    public void location();
    public String getName();
}
