package com.iamhusrev._1_momento_pattern;

import java.util.ArrayList;
import java.util.List;

class History {
    private final List<EditorState> states = new ArrayList<>();

    public void push(EditorState editorState) {
        states.add(editorState);
    }

    public EditorState pop() {
        var lastState = states.get(states.size() - 1);
        states.remove(lastState);
        return lastState;
    }
}