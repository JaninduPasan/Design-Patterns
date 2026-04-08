package org.example.Composite.Example;

import java.util.ArrayList;

public class Housing implements IStructure {

    private ArrayList<IStructure> structure;
    private String address;

    public Housing(String address) {
        this.structure = new ArrayList<IStructure>();
        this.address = address;
    }

    public String getName() {
        return this.address;
    }

    public int addStructure(IStructure component) {
        this.structure.add(component);
        return this.structure.size() - 1;
    }

    public IStructure getStructure(int componentNumber) {
        return this.structure.get(componentNumber);
    }

    public void location() {
        System.out.println("You are currently in " + this.getName() + ". It has ");
        for (IStructure structure : this.structure) {
            System.out.println(structure.getName());
        }
    }

    public void enter() {
        System.out.println("You have entered the " + this.getName());
    }

    public void exit() {
        System.out.println("You have left the " + this.getName());
    }
}
