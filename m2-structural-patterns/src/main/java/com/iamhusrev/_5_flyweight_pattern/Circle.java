package com.iamhusrev._5_flyweight_pattern;

// ConcreteFlyweight
class Circle implements Shape {
    private String color; // intrinsic state

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " circle at (" + x + ", " + y + ")");
    }
}