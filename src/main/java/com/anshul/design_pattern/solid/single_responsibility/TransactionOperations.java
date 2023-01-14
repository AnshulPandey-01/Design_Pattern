package com.anshul.design_pattern.solid.single_responsibility;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anshul
 */
public class TransactionOperations {
    
    private static final AccountOperations ACC_OP = new AccountOperations();
    
    public void deposit(BigDecimal amount, Long accountNumber) {
        amount = amount.abs();
        performTransaction(amount, accountNumber);
    }
    
    public void withdraw(BigDecimal amount, Long accountNumber) {
        amount = amount.abs().negate();
        performTransaction(amount, accountNumber);
    }
    
    private void performTransaction(BigDecimal amount, Long accountNumber) {
        try {
            Account account = ACC_OP.getAccount(accountNumber);
            BigDecimal finalBalance = account.getBalance().add(amount);
            if (finalBalance.compareTo(BigDecimal.ZERO) >= 0) {
                account.getTransactions().add(amount);
                account.setBalance(finalBalance);
            } else {
                throw new Exception("Insufficent balance");
            } 
        } catch (Exception ex) {
            System.out.println("Error occurred: " + ex.getMessage());
        }
    }
    
    public void printTransactions(Long accountNumber) {
        Account account = ACC_OP.getAccount(accountNumber);
        System.out.println("Transactions in account " + account.getAccountNumber() + " are:");
        for (BigDecimal txn : account.getTransactions()) {
            String operation = txn.compareTo(BigDecimal.ZERO) > 0 ? "Deposit" : "Withdrawn";
            System.out.println(operation + " | " + txn);
        }
        System.out.println();
    }
    
}
