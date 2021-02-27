package com.overaitis.exam_2;

public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    protected abstract String getInternalOutput();

    public void speak() {
        System.out.println("A " + getName() + " says \"" + getInternalOutput()+ "\"");
    }

    public String getName() {
        return name;
    }
}
