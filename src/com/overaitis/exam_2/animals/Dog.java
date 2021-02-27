package com.overaitis.exam_2.animals;

import com.overaitis.exam_2.Animal;

public class Dog extends Animal {

    public Dog() {
        super("Dog");
    }

    @Override
    protected String getInternalOutput() {
        return "woof";
    }
}
