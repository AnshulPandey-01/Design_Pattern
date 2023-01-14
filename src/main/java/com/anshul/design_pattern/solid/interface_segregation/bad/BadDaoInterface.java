package com.anshul.design_pattern.solid.interface_segregation.bad;


/** This dao interface defined to support data access using file system or database system.
 *  So we have added openConnection and openFile for it.
 *  This is bad because we have accommodated all operation in single interface.
 * 
 *  @author anshul
 */ 
public interface BadDaoInterface {
    public void openConnection();
    public void createRecord();
    public void openFile();
    public void deleteRecord();
}
