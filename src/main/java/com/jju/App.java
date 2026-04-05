package com.jju;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Polymorphic List: Holds different types of devices under one parent type
        List<SmartDevice> home = new ArrayList<>();

        home.add(new SmartLight("Living Room Lamp"));
        home.add(new SmartThermostat("Hallway Nest"));

        System.out.println("--- Activating Smart Home ---");

        // Polymorphic Loop: The 'device' variable takes many forms
        for (SmartDevice device : home) {
            device.activate(); 
        }
    }
}
