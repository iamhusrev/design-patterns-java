package com.iamhusrev._9_chainOfResponsibility_pattern;

public class WebServer {

    private final Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request) {
        handler.hande(request);
    }
}
