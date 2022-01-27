package com.sparta.shapes;

public class Square extends Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double calcArea() {
        return width * width;
    }
}
