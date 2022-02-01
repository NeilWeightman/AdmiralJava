package com.sparta.factory.model;

public class Motorbike implements Vehicle{

    @Override
    public String drive() {
        return "Do a wheelie";
    }
}
