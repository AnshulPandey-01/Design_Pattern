package com.anshul.design_pattern.solid.single_responsibility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * This class is only responsible for operations related to account.
 *
 * @author anshul
 */
class AccountOperations {

    private static final Map<Long, Account> ACCOUNT_MAP = new HashMap<>();
    private static final Random RAND = new Random();
    private static final TransactionOperations TRXN_OP = new TransactionOperations();
    
    public Account createAccount(String name, BigDecimal balance) {
        Account account = new Account(Math.abs(RAND.nextLong()), name, BigDecimal.ZERO, new ArrayList<>());
        addAccount(account);
        TRXN_OP.deposit(balance, account.getAccountNumber());
        return account;
    }

    public void addAccount(Account account) {
        ACCOUNT_MAP.put(account.getAccountNumber(), account);
    }

    public Account getAccount(Long accountNumber) {
        return ACCOUNT_MAP.get(accountNumber);
    }
    
    public void printBalance(Long accountNumber) {
        System.out.println("Balance of account " + accountNumber + " is " + ACCOUNT_MAP.get(accountNumber).getBalance());
        System.out.println();
    }
    
    public void printDetails(Long accountNumber) {
        Account account = getAccount(accountNumber);
        System.out.println("Account No: " +account.getAccountNumber());
        System.out.println("Owner Name: " + account.getName());
        System.out.println("Balance: " + account.getBalance());
        System.out.println();
    }

    /**
     * This method should not be the part of AccountOperations class.
     * As deposit is something called as transaction which eventually not responsible by account.
     * 
     * Adding this method violates Single Responsibility principle.
     * Create new class which handles the Transactions Operations.
     */
    public void deposit(BigDecimal amount, Long accountNumber) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("This method should not be in AccountOperations class");
    }
    
}
