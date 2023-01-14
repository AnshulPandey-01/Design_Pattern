package com.anshul.design_pattern.solid.liskov.bad;

public class BadHomeLoan implements BadLoanPayment{
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void foreCloseLoan() {

    }

    @Override
    public void doRepayment(int amount) {

    }
}
