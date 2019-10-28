package com.kodilla.testing.shape;

public class Square implements Shape {

    private String name;
    private double field;

    public Square(double side) {
        this.name = "Square";
        this.field = side*side;
    }
    public String getName() {
        return this.name;
    }
    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + name + '\'' +
                ", field=" + field +
                '}';
    }
}
