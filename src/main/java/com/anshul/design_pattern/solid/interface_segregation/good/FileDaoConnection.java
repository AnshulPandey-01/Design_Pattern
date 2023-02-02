package com.anshul.design_pattern.solid.interface_segregation.good;

/** 
 * Here don't need to bother about db part.
 * 
 * @author anshul
 */
public class FileDaoConnection implements DaoInterface, FileInterface {
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
