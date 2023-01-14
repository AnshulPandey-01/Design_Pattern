package com.anshul.design_pattern.creational.abstract_factory.os.win;

import com.anshul.design_pattern.creational.abstract_factory.ui_factory.ui.Button;

/**
 *
 * @author anshul
 */
public class WinButton implements Button {
    @Override
    public void clicked() {
        System.out.println("Windows Button Clicked!");
    }
}
