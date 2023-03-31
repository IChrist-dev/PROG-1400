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

    public void drawShape(Graphics pen) {
        //Establish the visual style of the ball
        pen.setColor(this.getShapeColor());
        pen.fillOval(this.getxPosition(), this.getyPosition(), this.size, this.size);

    }

    public void moveBall() {
        //Define how the ball shifts for each key-frame
        this.setxPosition(this.getxPosition() + this.xSpeed);
        //game only deals with x axis for now

    }
}
