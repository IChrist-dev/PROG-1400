/*
PROG 1400 - Exercise - 5-Year-Old Car
Ian Christian
w0480449
*/

import java.awt.*;

public class Car {

    private Color bodyColor;
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;

    //Constructor
    public Car(Color bodyColor, int height, int width, int xPosition, int yPosition) {
        this.bodyColor = bodyColor;
        this.height = height;
        this.width = width;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    //Getters
    public Color getBodyColor() {
        return bodyColor;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void drawVehicle(Graphics pen) {
        //Draw top rectangle
        pen.setColor(this.bodyColor);

        //Define sub-rectangle for top box
        int xRoofPosition = this.xPosition + 80;
        int yRoofPosition = this.yPosition;
        int roofWidth = this.xPosition - 120;
        int subHeight = this.height - 150;
        //Draw the roof box
        pen.drawRect(xRoofPosition, yRoofPosition, roofWidth, subHeight);

        //Draw the windshield
        Polygon windshield = new Polygon();
        windshield.addPoint(xRoofPosition + roofWidth, yRoofPosition);
        windshield.addPoint(xRoofPosition + roofWidth, yRoofPosition + subHeight);
        windshield.addPoint(xRoofPosition + roofWidth + 80, yRoofPosition + subHeight);
        pen.drawPolygon(windshield);

        //Draw the wheels
        pen.setColor(Color.black);
        pen.fillOval((this.xPosition + 20), (this.yPosition + (this.height - 80)), 60, 60);
        pen.fillOval(((this.xPosition + this.width) - 100), (this.yPosition + (this.height - 80)), 60, 60);

        //Draw the rear hatch
        Polygon hatch = new Polygon();
        hatch.addPoint(xRoofPosition, yRoofPosition);
        hatch.addPoint(xRoofPosition, yRoofPosition + subHeight);
        hatch.addPoint(this.xPosition, yRoofPosition + subHeight);
        pen.fillPolygon(hatch);

        //Define sub-rectangle for the car body
        pen.setColor(this.bodyColor);
        int xBodyPosition = this.xPosition;
        int yBodyPosition = this.yPosition + 50;
        int bodyHeight = subHeight + 50;
        //Draw the car body
        pen.fillRect(xBodyPosition, yBodyPosition, this.width, bodyHeight);



    }
}
