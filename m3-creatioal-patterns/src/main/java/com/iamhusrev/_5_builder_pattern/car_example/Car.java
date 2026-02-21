package com.iamhusrev._5_builder_pattern.car_example;

public class Car {
    private final String color;
    private final String engine;
    private final int seats;

    public Car(CarBuilder builder) {
        this.color = builder.color;
        this.engine = builder.engine;
        this.seats = builder.seats;
    }

    @Override
    public String toString() {
        return "Car [color=" + color + ", engine=" + engine + ", seats=" + seats + "]";
    }


}
