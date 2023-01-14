package com.anshul.design_pattern.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author anshul
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
        serializationIssue();
        System.out.println();
        serializationIssueFixed();
        System.out.println();
        reflectionIssue();
        System.out.println();
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        System.out.println("EnumSingleton : " + singleton.hashCode());
        singleton.performTask();
    }
    
    // If we serialize the object and then de-serialize we get new object and singleton is broken.
    private static void serializationIssue() throws IOException, ClassNotFoundException {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        File file = new File("myobject.obj");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        LazySingleton lazyObject = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();
        file.delete();
        System.out.println("LazySingleton Object 1 : " + lazySingleton.hashCode());
        System.out.println("LazySingleton Object 2 : " + lazyObject.hashCode());
    }
    
    // If we add readResolve method in our singleton class then the serialization issue will be fixed.
    private static void serializationIssueFixed() throws IOException, ClassNotFoundException {      
        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        File file = new File("myobject.obj");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(serializableSingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        SerializableSingleton serializedObject = (SerializableSingleton) objectInputStream.readObject();
        objectInputStream.close();
        file.delete();
        System.out.println("SerializableSingleton Object 1 : " + serializableSingleton.hashCode());
        System.out.println("SerializableSingleton Object 2 : " + serializedObject.hashCode());
    }
    
    // With Reflections we can access the constructor and create the object
    private static void reflectionIssue() throws InstantiationException, InvocationTargetException, IllegalAccessException {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        // Knowing only one constructor taking it using index
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        LazySingleton singletonReflection = (LazySingleton) constructor.newInstance();
        System.out.println("LazySingleton Object : " + lazySingleton.hashCode());
        System.out.println("Reflection Object : " + singletonReflection.hashCode());
    }
    
}
