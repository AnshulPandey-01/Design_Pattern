package com.anshul.design_pattern.solid.open_closed.good;

/**
 * This is good we keep adding new operation implementation
 * and our calculator get extensions without modifying it main task that is performing calculation
 * 
 * @author anshul
 */
interface Operation {
    public int perform(int number1, int number2);
}
