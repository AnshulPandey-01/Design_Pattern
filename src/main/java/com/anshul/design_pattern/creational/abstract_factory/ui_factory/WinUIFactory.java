package com.anshul.design_pattern.creational.abstract_factory.ui_factory;

import com.anshul.design_pattern.creational.abstract_factory.os.win.*;
import com.anshul.design_pattern.creational.abstract_factory.ui_factory.ui.*;

/**
 *
 * @author anshul
 */
public class WinUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
         return new WinCheckBox();
    }
    
}
