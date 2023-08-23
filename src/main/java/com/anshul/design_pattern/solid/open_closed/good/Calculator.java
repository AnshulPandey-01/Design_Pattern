package com.anshul.design_pattern.solid.open_closed.good;

/**
 * No modifications in our calculator functionality 
 * We can keep adding extension by create new operations
 * 
 * @author anshul
 */
class Calculator {
    public int calculateNumber(int number1 , int number2 , Operation operation){
        return operation.perform(number1 , number2);
    }
}
