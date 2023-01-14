package com.anshul.design_pattern.creational.prototype;

/**
 *
 * @author anshul
 */
public class FourWheeler extends Vehicle {
    
    private boolean automatic;
    private boolean isDiesel;
    
    public FourWheeler(int engine, String model, float price, boolean automatic, boolean isDiesel) {
        super(engine, model, price);
        this.automatic = automatic;
        this.isDiesel = isDiesel;
    }
    
    protected FourWheeler clone() throws CloneNotSupportedException {
        return (FourWheeler) super.clone();
    }

    @Override
    public String toString() {
        return "FourWheeler{" + super.toString() + "automatic=" + automatic + ", isDiesel=" + isDiesel + '}';
    }
    
}
