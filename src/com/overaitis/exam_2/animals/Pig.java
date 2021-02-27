package com.overaitis.exam_2.animals;

import com.overaitis.exam_2.Animal;

public class Pig extends Animal {

    public Pig() {
        super("Pig");
    }

    @Override
    protected String getInternalOutput() {
        return "oink";
    }
}
