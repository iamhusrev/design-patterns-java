package com.iamhusrev._9_chainOfResponsibility_pattern;

public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        // Client
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));

    }
}
