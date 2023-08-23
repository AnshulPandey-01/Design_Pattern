package com.anshul.design_pattern.solid.open_closed.good;

/**
 *
 * @author anshul
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.calculateNumber(5, 2, new SubstractOperation());
        System.out.println("Operation Result: " + result);
    }
}
