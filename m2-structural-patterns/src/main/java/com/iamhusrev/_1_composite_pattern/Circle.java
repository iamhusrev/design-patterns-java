package com.iamhusrev._1_composite_pattern;

// Leaf
class Circle implements Graphic {
    @Override
    public void draw() {
        System.out.println("Circle çiziliyor.");
    }
}
