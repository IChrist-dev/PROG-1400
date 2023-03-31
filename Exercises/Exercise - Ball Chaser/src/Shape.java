import java.awt.*;

public abstract class Shape {
    //Common Shape properties
    private int xPosition;
    private int yPosition;
    private Color shapeColor;

    //Constructor

    public Shape(int xPosition, int yPosition, Color shapeColor) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.shapeColor = shapeColor;
    }

    //Getters/Setters

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public Color getShapeColor() {
        return shapeColor;
    }

    //Abstract method declaration
    public abstract void drawShape(Graphics pen);
}
