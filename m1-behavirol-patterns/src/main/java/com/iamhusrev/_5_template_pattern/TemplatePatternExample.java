package com.iamhusrev._5_template_pattern;


public class TemplatePatternExample {

    public static void main(String[] args) {
        System.out.println("☕ Kahve hazırlanıyor:");
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("\n🍵 Çay hazırlanıyor:");
        Beverage tea = new Tea();
        tea.prepareRecipe();
    }
}