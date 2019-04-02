package animalrescue;

import animalrescue.Animal;

public class Veverita extends Animal {

    @Override
    void eat() {
        System.out.println("i am eating nuts");
    }

    @Override
    void sleep() {
        System.out.println("I am sleeping right now");

    }

    @Override
    void waking() {
        System.out.println("I am jumping from tree to tree");

    }
}
