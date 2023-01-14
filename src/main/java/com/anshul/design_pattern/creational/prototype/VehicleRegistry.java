package com.anshul.design_pattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author anshul
 */
public class VehicleRegistry {
    
    private static final Map<String, Vehicle> VEHICLES_MAP = new HashMap<>();
    static {
        VEHICLES_MAP.put("TWO", new TwoWheeler(80, "Activa", 99999.99f, false));
        VEHICLES_MAP.put("FOUR", new FourWheeler(200, "SUV", 1599499.49f, true, true));
    }
    
    public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException {
        return VEHICLES_MAP.get(vehicle).clone();
    }
 }
