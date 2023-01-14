package com.anshul.design_pattern.creational.builder;

/**
 * Client will interact with this director which helps to provide the meal.
 * Note that we can have this as per our choice there is no standard way, we can also have two different method getVegMeal and getNonVegMeal
 * Which will use the builders directly inside the method, in this example we are taking input which builder which type of builder needing.
 * 
 * @author anshul
 */
public class MealDirector {
    
    private MealBuilder mealBuilder;
    
    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }
    
    public Meal prepareMeal() {
        mealBuilder.addBread();
        mealBuilder.addCurry();
        mealBuilder.addBiryani();
        mealBuilder.addColdDrink();
        return mealBuilder.build();
    }
    
}
