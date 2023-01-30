/*
 * PROG 1400
 * Exercise: Disks are Loading
 * Ian Christian
 */

import java.lang.Math;

public class Circle {
    private double radius;
    private String colour;

    //region Constructors
    public Circle() {
        this.radius = 2;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.colour = color;
    }
    //endregion

    //region Getters
    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    //toString is a default method so makeString was used
    public String makeString() {
        return "Radius = " + this.radius + ", Colour = " + this.colour;
    }
    //endregion
}
