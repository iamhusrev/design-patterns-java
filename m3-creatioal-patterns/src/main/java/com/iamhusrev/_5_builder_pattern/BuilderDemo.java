package com.iamhusrev._5_builder_pattern;

import com.iamhusrev._5_builder_pattern.car_example.Car;
import com.iamhusrev._5_builder_pattern.car_example.SUVBuilder;
import com.iamhusrev._5_builder_pattern.car_example.SportsCarBuilder;
import com.iamhusrev._5_builder_pattern.presentation_example.Presentation;
import com.iamhusrev._5_builder_pattern.presentation_example.Slide;
import com.iamhusrev._5_builder_pattern.presentation_example.movie.MovieBuilder;

public class BuilderDemo {
    public static void main(String[] args) {

        var presentation = new Presentation();
        presentation.addSlide(new Slide("Welcome to the Presentation"));
        presentation.addSlide(new Slide("Agenda"));
        presentation.addSlide(new Slide("Conclusion"));

        var builder = new MovieBuilder();
        presentation.export(builder);

        var movie = builder.getMovie();


        ///  Car builder example

        Car sportsCar = new SportsCarBuilder().color("blue").build();
        System.out.println(sportsCar);

        Car suv = new SUVBuilder().engine("V6").build();
        System.out.println(suv);
    }
}