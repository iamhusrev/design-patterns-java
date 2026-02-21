package com.iamhusrev._1_prototype_pattern;

public class Circle implements Component {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Rendering Circle with radius: " + radius);
    }

    @Override
    public Component clone() {
        Circle clone = new Circle();
        clone.setRadius(this.radius);
        return clone;
    }
}
