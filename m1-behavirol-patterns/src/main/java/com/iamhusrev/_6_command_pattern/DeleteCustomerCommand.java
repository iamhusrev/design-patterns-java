package com.iamhusrev._6_command_pattern;

import com.iamhusrev._6_command_pattern.fx.Command;

public class DeleteCustomerCommand implements Command {

    private final CustomerService customerService;

    public DeleteCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.deleteCustomer();

    }
}
