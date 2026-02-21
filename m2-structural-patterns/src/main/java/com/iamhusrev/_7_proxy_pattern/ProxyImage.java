package com.iamhusrev._7_proxy_pattern;

// Proxy
class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        // Lazy initialization — load image only when needed
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        System.out.println("Proxy controlling access...");
        realImage.display();
    }
}