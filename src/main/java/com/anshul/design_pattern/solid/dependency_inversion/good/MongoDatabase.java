package com.anshul.design_pattern.solid.dependency_inversion.good;

/**
 * 
 * @author anshul
 */
public class MongoDatabase implements Database {
    
    @Override
    public void findAll(){
        System.out.println("Inside Mongo findAll");
        // find all records in db
    }

    @Override
    public void save(){
        System.out.println("Inside Mongo save");
        // inserts into db
    }

    @Override
    public void update(){
        // update some values in db
    }

    @Override
    public void delete(){
        // delete some records in db
    }
    
}
