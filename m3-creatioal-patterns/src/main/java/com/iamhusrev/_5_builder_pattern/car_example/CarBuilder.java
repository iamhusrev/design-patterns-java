package com.iamhusrev._5_builder_pattern.car_example;

public class CarBuilder {
        protected String color;
        protected String engine;
        protected int seats;

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

