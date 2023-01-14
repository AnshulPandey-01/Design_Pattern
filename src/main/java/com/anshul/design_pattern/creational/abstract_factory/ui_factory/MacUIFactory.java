package com.anshul.design_pattern.creational.abstract_factory.ui_factory;

import com.anshul.design_pattern.creational.abstract_factory.os.mac.*;
import com.anshul.design_pattern.creational.abstract_factory.ui_factory.ui.*;

/**
 *
 * @author anshul
 */
public class MacUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
         return new MacCheckBox();
    }
    
}