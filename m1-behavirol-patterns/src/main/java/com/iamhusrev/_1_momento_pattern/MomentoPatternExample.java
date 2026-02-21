package com.iamhusrev._1_momento_pattern;

public class MomentoPatternExample {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setContent("Version 1");
        history.push(editor.save());

        editor.setContent("Version 2");
        history.push(editor.save());

        editor.setContent("Version 3");

        System.out.println("Content: " + editor.getContent());

        editor.restore(history.pop());
        System.out.println("Undo Content To: " + editor.getContent());
    }
}
