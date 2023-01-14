package com.anshul.design_pattern.creational.factory.factories;

/**
 *
 * @author anshul
 */
public class WindowsOS extends OperatingSystem {

    public WindowsOS(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println(dir);
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("deleted");
    }
    
}