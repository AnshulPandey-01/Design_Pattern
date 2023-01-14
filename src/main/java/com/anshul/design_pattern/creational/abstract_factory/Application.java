package com.anshul.design_pattern.creational.abstract_factory;

import com.anshul.design_pattern.creational.abstract_factory.ui_factory.ui.*;
import com.anshul.design_pattern.creational.abstract_factory.ui_factory.UIFactory;

/**
 *
 * @author anshul
 */
public class Application {
    
    private Button button;
    private CheckBox checkBox;
    
    public Application(UIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }
    
    public void paint() {
        button.clicked();
        checkBox.checked();
    }
    
}
