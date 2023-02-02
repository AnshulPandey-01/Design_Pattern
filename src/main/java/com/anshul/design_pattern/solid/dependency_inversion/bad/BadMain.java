package com.anshul.design_pattern.solid.dependency_inversion.bad;

/**
 * 
 * @author anshul
 */
public class BadMain {
    public static void main(String[] args) {
        BadMySQLDatabase database = new BadMySQLDatabase();
        BadMyService service = new BadMyService(database);
        service.performOperationA();
    }
}
