package com.iamhusrev._10_visitor_pattern;

public class AnimalSoundVisitor implements AnimalVisitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("Meow! Meow!");
    }

    @Override
    public void visit(Horse horse) {
        System.out.println("Neigh! Neigh!");
    }
}
