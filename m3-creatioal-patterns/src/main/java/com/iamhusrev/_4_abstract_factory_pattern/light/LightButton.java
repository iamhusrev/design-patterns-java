package com.iamhusrev._4_abstract_factory_pattern.light;

import com.iamhusrev._4_abstract_factory_pattern.Button;

public class LightButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Light themed Button");
    }
}