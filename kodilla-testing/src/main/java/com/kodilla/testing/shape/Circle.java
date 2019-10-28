package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String name;
    private double field;

    public Circle(double radius) {
        this.name = "circle";
        this.field = Math.PI*radius*radius;
    }

    public String getName() {
        return this.name;
    }
    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + name + '\'' +
                ", field=" + field +
                '}';
    }
}
