package com.anshul.design_pattern.solid.single_responsibility;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author anshul
 */
class Account {

    private final Long accountNumber;
    private final String name;
    private BigDecimal balance;
    private final List<BigDecimal> transactions;

    public Account(Long accountNumber, String name, BigDecimal balance, List<BigDecimal> transactions) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.transactions = transactions;
    }
    
    public Long getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<BigDecimal> getTransactions() {
        return transactions;
    }

}
