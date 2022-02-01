package com.sparta.factory.model;

public class HelicopterFactory extends VehicleFactory{
    @Override
    public Vehicle getInstance() {
        return new Helicopter();
    }
}
