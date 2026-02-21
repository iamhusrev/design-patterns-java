package com.iamhusrev._6_command_pattern.fx;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Button {
    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}
