package com.iamhusrev._10_visitor_pattern;

public interface AnimalVisitor {
    void visit(Dog dog);

    void visit(Cat cat);

    void visit(Horse horse);
}
