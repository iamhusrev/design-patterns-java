package com.iamhusrev._1_momento_pattern;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TextEditor {
    private String content;

    public EditorState save() {
        return new EditorState(content);
    }

    public void restore(EditorState editorState) {
        this.content = editorState.getState();
    }
}