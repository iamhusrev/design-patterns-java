package com.iamhusrev._5_template_pattern;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Kahveyi demliyorum...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Şeker ve süt ekliyorum...");
    }
}
