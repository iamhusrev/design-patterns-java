package com.iamhusrev._1_prototype_pattern;

public class ContextMenu {
    private final Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
        var newComponent = component.clone();
        timeline.add(newComponent);
    }
}
