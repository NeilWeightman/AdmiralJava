package com.sparta.shapes;

public abstract class Shape {
    public abstract double calcArea();

    @Override
    public String toString() {
        return "This shape has an area of " + calcArea();
    }
}
