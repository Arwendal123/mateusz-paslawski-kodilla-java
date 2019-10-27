package com.kodilla.testing.shape;

public class Square implements Shape {

    String shapeName;
    double field;

    public Square(double side) {
        this.shapeName = "Square";
        this.field = side*side;
    }
    public String getShapeName() {
        return this.shapeName;
    }
    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
