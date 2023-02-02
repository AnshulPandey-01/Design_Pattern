package com.anshul.design_pattern.solid.dependency_inversion.bad;

/**
 * 
 * @author anshul
 */
public class BadMySQLDatabase {
    public void findAll(){
        System.out.println("Inside BadMYSQL findAll");
        // find all records in db
    }

    public void save(){
        System.out.println("Inside BadMYSQL save");
        // inserts into db
    }

    public void update(){
        // update some values in db
    }

    public void delete(){
        // delete some records in db
    }
}
