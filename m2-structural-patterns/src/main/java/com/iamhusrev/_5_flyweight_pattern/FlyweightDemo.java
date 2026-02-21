package com.iamhusrev._5_flyweight_pattern;

// Client
public class FlyweightDemo {
    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String color = colors[i % colors.length];
            Circle circle = (Circle) ShapeFactory.getCircle(color);
            circle.draw((int) (Math.random() * 100), (int) (Math.random() * 100));
        }
    }
}