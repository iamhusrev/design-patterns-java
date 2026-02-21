package com.iamhusrev._6_command_pattern.editor;

public interface UndoableCommand extends Command {
    void unExecute();
}
