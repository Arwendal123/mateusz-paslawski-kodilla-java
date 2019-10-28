package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name;
    private double field;

    public Triangle(double side, double height){
        this.name="Triangle";
        this.field=side*height*0.5;

    }
    public String getName() {
        return this.name;
    }
    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + name + '\'' +
                ", field=" + field +
                '}';
    }
}
