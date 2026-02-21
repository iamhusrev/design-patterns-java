package com.iamhusrev._6_command_pattern;


import com.iamhusrev._6_command_pattern.fx.Button;

public class CommandPatternExample {

    public static void main(String[] args) {

        // Command Pattern
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);

        button.click();


        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();


        // Undoable Command Pattern
    }
}
