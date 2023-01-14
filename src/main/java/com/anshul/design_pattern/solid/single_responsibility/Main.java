package com.anshul.design_pattern.solid.single_responsibility;

import java.math.BigDecimal;

/**
 *
 * @author anshul
 */
public class Main {

    public static void main(String[] args) {
        AccountOperations accountOperations = new AccountOperations();
        TransactionOperations transactionOperations = new TransactionOperations();

        Account account = accountOperations.createAccount("Anshul", BigDecimal.valueOf(1000));
        accountOperations.printDetails(account.getAccountNumber());
        transactionOperations.deposit(BigDecimal.valueOf(250), account.getAccountNumber());
        transactionOperations.withdraw(BigDecimal.valueOf(700.25), account.getAccountNumber());
        accountOperations.printBalance(account.getAccountNumber());
        transactionOperations.withdraw(BigDecimal.valueOf(900), account.getAccountNumber());
        transactionOperations.printTransactions(account.getAccountNumber());
        accountOperations.printBalance(account.getAccountNumber());
    }
}
