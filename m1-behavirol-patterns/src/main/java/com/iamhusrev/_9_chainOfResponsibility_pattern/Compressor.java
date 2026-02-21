package com.iamhusrev._9_chainOfResponsibility_pattern;

public class Compressor extends Handler {

    public Compressor(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compress");
        return false;
    }
}
