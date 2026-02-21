package com.iamhusrev._5_template_pattern;

abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Suyu kaynatıyorum...");
    }

    private void pourInCup() {
        System.out.println("Bardak içine döküyorum...");
    }

    protected abstract void brew();

    protected abstract void addCondiments();
}