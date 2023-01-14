package com.anshul.design_pattern.creational.prototype;

/**
 * This is abstract prototype.
 * 
 * @author anshul
 */
public abstract class Vehicle implements Cloneable {
    
    private int engine;
    private String model;
    private float price;
    
    public Vehicle(int engine, String model, float price) {
        this.engine = engine;
        this.model = model;
        this.price = price;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    protected Vehicle clone() throws CloneNotSupportedException {
        return (Vehicle) super.clone();
    }

    @Override
    public String toString() {
        return "engine=" + engine + ", model=" + model + ", price=" + price + ", ";
    }
    
}
