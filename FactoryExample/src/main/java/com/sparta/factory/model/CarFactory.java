package com.sparta.factory.model;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle getInstance() {
        return new Car();
    }
}
