package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String shapeName;
    double field;

    public Triangle(double side, double height){
        this.shapeName="Triangle";
        this.field=side*height*0.5;

    }
    public String getShapeName() {
        return this.shapeName;
    }
    public double getField() {
        return this.field;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
