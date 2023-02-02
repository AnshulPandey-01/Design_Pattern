package com.anshul.design_pattern.solid.liskov.good;

/**
 * 
 * @author anshul
 */
public interface SecureLoan extends LoanPayment {
    public void foreCloseLoan();
    public void doEmipayment(int amount);
}
