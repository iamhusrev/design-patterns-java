package com.iamhusrev._5_builder_pattern.presentation_example.pdf;

import com.iamhusrev._5_builder_pattern.presentation_example.PresentationBuilder;
import com.iamhusrev._5_builder_pattern.presentation_example.Slide;

public class PdfDocumentBuilder implements PresentationBuilder {
    private final PdfDocument document = new PdfDocument();

    @Override
    public void addSlide(Slide slide) {
        document.addPage(slide.getText());
    }

    public PdfDocument getPdfDocument() {
        return document;
    }
}
