package com.iamhusrev._1_prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class Timeline {
    private final List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }
}
