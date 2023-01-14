package com.anshul.design_pattern.creational.abstract_factory.os.win;

import com.anshul.design_pattern.creational.abstract_factory.ui_factory.ui.CheckBox;

/**
 *
 * @author anshul
 */
public class WinCheckBox implements CheckBox {
    @Override
    public void checked() {
        System.out.println("Windows CheckBox Checked!");
    }
}
