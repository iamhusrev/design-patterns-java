package com.iamhusrev._1_composite_pattern;// Composite

import java.util.ArrayList;
import java.util.List;

class GraphicGroup implements Graphic {
    private List<Graphic> children = new ArrayList<>();

    public void add(Graphic g) {
        children.add(g);
    }

    public void remove(Graphic g) {
        children.remove(g);
    }

    @Override
    public void draw() {
        for (Graphic g : children) {
            g.draw();
        }
    }
}