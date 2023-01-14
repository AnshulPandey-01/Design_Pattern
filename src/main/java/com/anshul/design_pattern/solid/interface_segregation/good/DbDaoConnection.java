package com.anshul.design_pattern.solid.interface_segregation.good;

/** 
 * Implemented method what is actual being operated by this.
 * We don't had to bother about file operation as interface segregated.
 * 
 * @author anshul
 */
public class DbDaoConnection implements DaoInterface, DbInterface{
    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }

    @Override
    public void openConnection() {

    }
}
