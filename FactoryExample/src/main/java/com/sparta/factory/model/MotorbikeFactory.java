package com.sparta.factory.model;

public class MotorbikeFactory extends VehicleFactory{
    @Override
    public Vehicle getInstance() {
        return new Motorbike();
    }
}
