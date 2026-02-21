package com.iamhusrev._5_builder_pattern.car_example;

public class SportsCarBuilder extends CarBuilder {
    public SportsCarBuilder() {
        this.color = "Red";
        this.engine = "V8 Turbo";
        this.seats = 2;
    }
}
