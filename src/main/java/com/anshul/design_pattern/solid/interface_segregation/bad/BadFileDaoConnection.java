package com.anshul.design_pattern.solid.interface_segregation.bad;

public class BadFileDaoConnection implements BadDaoInterface{
    @Override
    public void openConnection() {
        // We can't open connection in file system
        throw new UnsupportedOperationException("Open connect Not supported");
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {

    }

    @Override
    public void deleteRecord() {

    }
}
