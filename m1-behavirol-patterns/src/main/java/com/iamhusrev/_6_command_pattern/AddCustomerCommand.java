package com.iamhusrev._6_command_pattern;


import com.iamhusrev._6_command_pattern.fx.Command;

public class AddCustomerCommand implements Command {

    private final CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.addCustomer();

    }
}
