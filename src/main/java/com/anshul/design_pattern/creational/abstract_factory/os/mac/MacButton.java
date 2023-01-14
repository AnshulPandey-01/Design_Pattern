package com.anshul.design_pattern.creational.abstract_factory.os.mac;

import com.anshul.design_pattern.creational.abstract_factory.ui_factory.ui.Button;

/**
 *
 * @author anshul
 */
public class MacButton implements Button {
    @Override
    public void clicked() {
        System.out.println("Mac Button Clicked!");
    }
}
