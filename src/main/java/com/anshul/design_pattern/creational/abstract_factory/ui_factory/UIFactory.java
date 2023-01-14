package com.anshul.design_pattern.creational.abstract_factory.ui_factory;

import com.anshul.design_pattern.creational.abstract_factory.ui_factory.ui.Button;
import com.anshul.design_pattern.creational.abstract_factory.ui_factory.ui.CheckBox;

/**
 *
 * @author anshul
 */
public interface UIFactory {
    
    Button createButton();
    CheckBox createCheckBox();
    
}
