package com.overaitis.exam_2;

import com.overaitis.exam_2.animals.Dog;
import com.overaitis.exam_2.animals.Horse;
import com.overaitis.exam_2.animals.Lollero;
import com.overaitis.exam_2.animals.Pig;

public class Main {

    public static void main(String[] args) {
	    Animal[] animals = {
	            new Dog(),
                new Horse(),
                new Pig(),
                new Lollero()
        };
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
