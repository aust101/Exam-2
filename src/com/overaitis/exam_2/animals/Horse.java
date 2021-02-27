package com.overaitis.exam_2.animals;

import com.overaitis.exam_2.Animal;

public class Horse extends Animal {

    public Horse() {
        super("Horse");
    }

    @Override
    protected String getInternalOutput() {
        return "Nay";
    }
}
