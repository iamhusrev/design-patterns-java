package com.iamhusrev._4_abstract_factory_pattern.light;

import com.iamhusrev._4_abstract_factory_pattern.Checkbox;

public class LightCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Light themed Checkbox");
    }
}
