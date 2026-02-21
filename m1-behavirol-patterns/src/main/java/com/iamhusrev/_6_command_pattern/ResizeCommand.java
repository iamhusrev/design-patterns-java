package com.iamhusrev._6_command_pattern;

import com.iamhusrev._6_command_pattern.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
