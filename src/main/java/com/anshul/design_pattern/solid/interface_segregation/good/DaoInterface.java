package com.anshul.design_pattern.solid.interface_segregation.good;

//This is good we will only include the dao operation
// And segregate connection part so consumer can implement required interfaces.
public interface DaoInterface {
    public void createRecord();
    public void deleteRecord();
}
