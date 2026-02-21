package com.iamhusrev._5_template_pattern;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Çayı demliyorum...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Limon ekliyorum...");
    }
}