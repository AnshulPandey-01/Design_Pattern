package com.anshul.design_pattern.solid.dependency_inversion.good;

/**
 * Good code for Dependency Inversion will be same as in Open Closed Principle.
 * 
 * @author anshul
 */
public class Main {
    public static void main(String[] args) {
        Database database = new MySQLDatabase();
        MyService service = new MyService(database);
        service.performOperationA();
    }
}
