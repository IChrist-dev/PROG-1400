public class Circle extends Shape {
    private double radius;
    private double diameter;
    private double area;

    public Circle(double radius, String shapeName, int numOfSides) {
        super(shapeName, numOfSides, (2 * Math.PI * radius));
        this.radius = radius;
        this.diameter = radius * 2;
        this.area = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getArea() {
        return this.area;
    }

    //Method to turn a circle into an ellipse
    public String circleSquish(double squishFactor) {
        //The math behind this is nonsense
        double squishedDiameter = this.diameter * squishFactor;
        double squishedRadius = this.radius / squishFactor;
        return String.format("SQUISH*\nYou squished me by a factor of %.2f! My major axis is now %.2f " +
                        "and my minor axis is %.2f",
                squishFactor, squishedDiameter, squishedRadius);
    }
}