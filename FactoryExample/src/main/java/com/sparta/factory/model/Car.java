package com.sparta.factory.model;

public class Car implements Vehicle {
    @Override
    public String drive() {
        return "Start the car and put it in gear";
    }
}
