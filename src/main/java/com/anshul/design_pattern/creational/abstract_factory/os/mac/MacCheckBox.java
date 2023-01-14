package com.anshul.design_pattern.creational.abstract_factory.os.mac;

import com.anshul.design_pattern.creational.abstract_factory.ui_factory.ui.CheckBox;

/**
 *
 * @author anshul
 */
public class MacCheckBox implements CheckBox {
    @Override
    public void checked() {
        System.out.println("Mac CheckBox Checked!");
    }
}