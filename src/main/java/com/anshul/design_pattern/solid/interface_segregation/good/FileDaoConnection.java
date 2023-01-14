package com.anshul.design_pattern.solid.interface_segregation.good;

/** 
 * Here don't need to bother about db part.
 * 
 * @author anshul
 */
public class FileDaoConnection implements FileInterface, DaoInterface{
    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }

    @Override
    public void openFile() {

    }
}
