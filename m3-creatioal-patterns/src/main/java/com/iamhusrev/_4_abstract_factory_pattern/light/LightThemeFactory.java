package com.iamhusrev._4_abstract_factory_pattern.light;


import com.iamhusrev._4_abstract_factory_pattern.Button;
import com.iamhusrev._4_abstract_factory_pattern.Checkbox;
import com.iamhusrev._4_abstract_factory_pattern.UIFactory;


public class LightThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}