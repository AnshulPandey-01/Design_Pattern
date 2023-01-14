package com.anshul.design_pattern.creational.prototype;

/**
 *
 * @author anshul
 */
public class TwoWheeler extends Vehicle {
    
    private boolean isElectric;

    public TwoWheeler(int engine, String model, float price, boolean isElectric) {
        super(engine, model, price);
        this.isElectric = isElectric;
    }
    
    protected TwoWheeler clone() throws CloneNotSupportedException {
        return (TwoWheeler) super.clone();
    }
    
    @Override
    public String toString() {
        return "TwoWheeler{" + super.toString() + "isElectric=" + isElectric + '}';
    }
    
}
