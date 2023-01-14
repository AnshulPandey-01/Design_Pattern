package com.anshul.design_pattern.creational.factory;

import com.anshul.design_pattern.creational.factory.factories.*;

/**
 * Factory : As name suggest it is factory where we can create objects.
 * Since it creates object it falls in creational design pattern
 * Factory pattern has  two important element in its design.
 *
 * 1. Interface/Abstract class : This is base element for which we are making factory i.e. we are going to get object of this type
 * In this case it is "OperatingSystem" which has type available Windows and Linux.
 *
 * 2. Factory : This will have nothing but Object creation logic. Let's say as a library you introduce one more subtype that is
 * MacOperatingSystem. Now your caller is automatically extended this facility of third type , also we have taken responsibility of
 * creating of object.
 *
 * In java this pattern is heavily used:
 * 1. Calendar.getInstance : Calendar is abstract class and based on Locale and Timezone we provided it is giving calendar instance.
 * Note in this case we really don't know what type of calendar we got.
 * 2. In reflection Class.forname : the type of class you pass it gets loaded.
 * 
 * @author anshul
 */
public class OperatingSystemFactory {
    
    private OperatingSystemFactory(){}
    
    /*
    One more advantage , tomorrow you planned to change OS here , you can simply change this and everything works as is.
    
    Example creation of object.
    OperatingSystem operatingSystem = OperatingSystemFactory.getInstance("WINDOWS" , "WIN7" ,"x64");
    OperatingSystem operatingSystem2 = OperatingSystemFactory.getInstance("LINUX" , "DEB" ,"x64");
    */
    
    public static void main(String[] args) {
        OperatingSystem os = OperatingSystemFactory.getInstance("LINUX", "MINT", "x86");
        System.out.println(os.toString());
    }
    
    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type){
            case "WINDOWS":
                return new WindowsOS(version, architecture);
            case "LINUX":
                return new LinuxOS(version, architecture);
            default:
                throw new IllegalArgumentException("OS Not supported");
        }
    }
    
}
