package com.iamhusrev._1_composite_pattern;


// Client
public class CompositeDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Square s1 = new Square();

        GraphicGroup group = new GraphicGroup();
        group.add(c1);
        group.add(s1);

        GraphicGroup mainGroup = new GraphicGroup();
        mainGroup.add(group);
        mainGroup.add(c2);

        mainGroup.draw();
    }
}
