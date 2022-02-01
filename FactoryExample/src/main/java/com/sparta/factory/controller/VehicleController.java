package com.sparta.factory.controller;

import com.sparta.factory.model.*;

public class VehicleController {
    public String initiateDriving(String desiredVehicleType) {
        Vehicle v = getVehicle(desiredVehicleType);
        return v.drive();
    }
    // simple factory method
    public Vehicle getVehicle(String vehicleType){
        VehicleFactory vf = switch (vehicleType.toLowerCase()) {
            case "car" -> new CarFactory();
            case "helicopter" -> new HelicopterFactory();
            case "motorbike" -> new MotorbikeFactory();
            default -> null;
        };
        return vf.getInstance();
    }
}
