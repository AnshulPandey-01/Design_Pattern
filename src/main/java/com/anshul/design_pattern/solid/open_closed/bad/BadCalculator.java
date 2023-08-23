package com.anshul.design_pattern.solid.open_closed.bad;

/**
 * This is a bad design where we are taking type and for each type we are having cases
 * now if we want to introduce multiplication or division operations as well,
 * then we have to modify calculator
 * 
 * @author anshul
 */
class BadCalculator {
    public int calculateNumber(int number1 , int number2 , String type){
        int result=0;
        switch (type){
            case "sum":
                result = number1 + number2;
                break;
            case "sub":
                result = number1 - number2;
                break;
        }
        return  result;
    }
}
