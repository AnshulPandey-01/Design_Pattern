package com.anshul.design_pattern.creational.builder;

/**
 *
 * @author anshul
 */
public class NonVegMealBuilder implements MealBuilder {
    
    private Meal meal;
    
    public NonVegMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void addBiryani() {
        this.meal.setBriyani("Chicken");
    }

    @Override
    public void addBread() {
        this.meal.setBread("Roti");
    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("Fanta");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Non-Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
    
}
