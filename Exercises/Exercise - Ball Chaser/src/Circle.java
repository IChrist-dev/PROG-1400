/*
PROG 1400 - Exercise - Ball Chaser
Ian Christian
w0480449
*/

import java.awt.*;

public class Circle extends Shape {
    //Circle specific properties
    private int size;
    private int xSpeed;

    public Circle(int xPosition, int yPosition, int size, int xSpeed, Color shapeColor) {
        super(xPosition, yPosition, shapeColor);
        this.size = size;
        this.xSpeed = xSpeed;
    }

    public int getSize() {
        return size;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void drawShape(Graphics pen) {
        //Establish the visual style of the ball
        pen.setColor(this.getShapeColor());
        pen.fillOval(this.getxPosition(), this.getyPosition(), this.size, this.size);
    }

    public void moveShape() {
        //Define how the ball shifts for each key-frame
        this.setxPosition(this.getxPosition() + this.xSpeed);
        //game only deals with x-axis for now
    }

    public int increaseSpeed(int direction) {
        //Speed is adjusted on every button/mouse click
        //Left travel must decrease
        if (direction == 0) {
            this.setxSpeed(this.getxSpeed() + 2);
            return 1;
        } else {
            this.setxSpeed(this.getxSpeed() - 2);
            return 0;
        }
    }
}
