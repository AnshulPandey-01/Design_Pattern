package com.anshul.design_pattern.solid.dependency_inversion.bad;

/**
 * 
 * @author anshul
 */
public class BadMyService {
    
    private BadMySQLDatabase database;

    public BadMyService(BadMySQLDatabase database) {
        this.database = database;
    }
    
    public void performOperationA(){
        // ... Some Implementation
        System.out.println("Opeation A");
        database.findAll();
        // Implementation continue ...
    }

    public void performOperationB(){
        // ... Some Implementation
        System.out.println("Opeation B");
        database.update();
        // Implementation continue ...
    }
    
}
