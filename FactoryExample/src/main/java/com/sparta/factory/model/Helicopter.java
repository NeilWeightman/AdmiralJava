package com.sparta.factory.model;

public class Helicopter implements Vehicle {
    @Override
    public String drive() {
        return "Start the engine and increase rotor speed";
    }
}
