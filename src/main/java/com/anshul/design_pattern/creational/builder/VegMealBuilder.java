package com.anshul.design_pattern.creational.builder;

/**
 *
 * @author anshul
 */
public class VegMealBuilder implements MealBuilder {
    
    private Meal meal;
    
    public VegMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void addBiryani() {
        this.meal.setBriyani("Panner");
    }

    @Override
    public void addBread() {
        this.meal.setBread("Roti");
    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("Coke");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
    
}
