package com.iamhusrev._5_flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        // Create a new one only if not existing
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating new circle of color: " + color);
        }
        return circle;
    }
}

