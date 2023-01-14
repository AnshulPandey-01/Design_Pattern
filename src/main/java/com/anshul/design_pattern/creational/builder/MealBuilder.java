package com.anshul.design_pattern.creational.builder;

/**
 * 
 * @author anshul
 */
public interface MealBuilder {
    void addBiryani();
    void addBread();
    void addColdDrink();
    void addCurry();
    Meal build();
}
