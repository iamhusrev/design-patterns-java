package com.iamhusrev._10_visitor_pattern;


public interface Animal {
    void accept(AnimalVisitor visitor);
}
