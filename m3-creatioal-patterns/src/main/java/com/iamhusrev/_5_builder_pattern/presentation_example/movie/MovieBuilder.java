package com.iamhusrev._5_builder_pattern.presentation_example.movie;

import com.iamhusrev._5_builder_pattern.presentation_example.PresentationBuilder;
import com.iamhusrev._5_builder_pattern.presentation_example.Slide;

public class MovieBuilder implements PresentationBuilder {
    private final Movie movie = new Movie();

    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(), 3);
    }

    public Movie getMovie() {
        return movie;
    }
}
