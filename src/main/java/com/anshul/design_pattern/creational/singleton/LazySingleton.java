package com.anshul.design_pattern.creational.singleton;

import java.io.Serializable;

/**
 * Lazy initialization mean application will create instance when it is requested.
 * However this can be used when you have non-thread-safe application. If used in multi threading it might break,
 * Why? because your getInstance method if invoked by two thread at same time then!!!!
 *
 * When to use?  Non thread safe and creating common resource like db connection.
 * 
 * @author anshul
 */
class LazySingleton implements Serializable {
    
    private static LazySingleton instance;
    
    private LazySingleton() {}
    
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
    
}
