package com.anshul.design_pattern.solid.dependency_inversion.good;

/**
 *
 * @author anshul
 */
public interface Database {
    void findAll();

    void save();

    void update();

    void delete();
}
