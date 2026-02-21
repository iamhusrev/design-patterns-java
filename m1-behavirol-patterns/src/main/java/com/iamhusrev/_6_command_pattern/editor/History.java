package com.iamhusrev._6_command_pattern.editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private final Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        commands.add(command);
    }

    public UndoableCommand pop() {
        var lastCommand = commands.getLast();
        commands.remove(lastCommand);
        return lastCommand;
    }

}
