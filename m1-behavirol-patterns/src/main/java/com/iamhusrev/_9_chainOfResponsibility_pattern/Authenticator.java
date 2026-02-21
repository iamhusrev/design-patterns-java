package com.iamhusrev._9_chainOfResponsibility_pattern;

import java.util.Objects;

public class Authenticator extends Handler {


    public Authenticator(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        boolean isValid = (Objects.equals(request.getUsername(), "admin") && Objects.equals(request.getPassword(), "1234"));
        System.out.println("Authentication");
        return !isValid;
    }
}
