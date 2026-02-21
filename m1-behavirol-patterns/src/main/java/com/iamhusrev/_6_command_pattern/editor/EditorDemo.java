package com.iamhusrev._6_command_pattern.editor;

public class EditorDemo {

    public static void main(String[] args) {

        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println("After Bold: " + document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("After Undo: " + document.getContent());
    }
}
