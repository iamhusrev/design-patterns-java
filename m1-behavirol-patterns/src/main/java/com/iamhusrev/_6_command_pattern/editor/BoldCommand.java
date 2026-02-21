package com.iamhusrev._6_command_pattern.editor;

public class BoldCommand implements UndoableCommand {
    private final HtmlDocument document;
    private final History history;
    private String prevContent;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unExecute() {
        document.setContent(prevContent);
    }

    public int size() {
        return document.getContent().length();
    }

}
