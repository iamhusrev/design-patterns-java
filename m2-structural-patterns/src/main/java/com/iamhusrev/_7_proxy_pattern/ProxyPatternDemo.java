package com.iamhusrev._7_proxy_pattern;

// Client
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.png");

        // Images are loaded only when displayed
        image1.display();
        System.out.println("----------------");
        image1.display(); // No loading again
        System.out.println("----------------");
        image2.display();
    }
}