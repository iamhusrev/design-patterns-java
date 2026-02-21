package com.iamhusrev._4_abstract_factory_pattern.dark;

import com.iamhusrev._4_abstract_factory_pattern.Button;
import com.iamhusrev._4_abstract_factory_pattern.Checkbox;
import com.iamhusrev._4_abstract_factory_pattern.UIFactory;

public class DarkThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}