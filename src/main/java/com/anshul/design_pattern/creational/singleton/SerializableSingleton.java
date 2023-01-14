package com.anshul.design_pattern.creational.singleton;

import java.io.Serializable;

/**
 * Let's say your singleton has implemented serialization. Now what will happen if you serialize object and de-serialize.
 * During de-serialization it will create the new object every time if we go in traditional way.
 * To resolve it add readResolve method which will ensure that during de-serialize we return same instance.
 * 
 * @author anshul
 */
class SerializableSingleton implements Serializable {
    
    private static SerializableSingleton instance;
    
    private SerializableSingleton() {}
    
    public static SerializableSingleton getInstance() {
        if (instance == null) {
            instance = new SerializableSingleton();
        }
        return instance;
    }
    
    /**
     * This is the key method which is responsible during de-serialization process,
     * this method get invoked and we are simply returning already created object.
     * @return
     */
    protected Object readResolve() {
        return instance;
    }
    
}
