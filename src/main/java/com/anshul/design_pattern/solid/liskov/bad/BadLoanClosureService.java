package com.anshul.design_pattern.solid.liskov.bad;

/**
 * This is loan closure service which is responsible
 * to close the loan before its actual due date.
 * Now since credit card is not supporting foreclosure
 * it will throw exception which is wrong in design where
 * we are unable to substitue subtype with super type.That is violation of
 * Liksov Substituation rule.
 * Solution to this lets segregate the method in different super types
 * and make supertype substituable at any given time.
 */
public class BadLoanClosureService {
    private BadLoanPayment loanPayment;

    public BadLoanClosureService(BadLoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }
    public void foreCloseLoan() {
        loanPayment.foreCloseLoan();;
    }
}