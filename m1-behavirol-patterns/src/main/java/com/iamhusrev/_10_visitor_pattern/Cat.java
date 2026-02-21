package com.iamhusrev._10_visitor_pattern;

public class Cat implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
