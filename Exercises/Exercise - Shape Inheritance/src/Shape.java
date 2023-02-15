public class Shape {
    //Common shape properties
    private String shapeName;
    private int numOfSides;
    private double circumference;
    private double area;

    //Default constructor
    public Shape() {}

    //Parameterized constructor
    public Shape(String shapeName, int numOfSides, double circumference) {
        this.shapeName = shapeName;
        this.numOfSides = numOfSides;
        this.circumference = circumference;
    }

    public double getArea() {
        return area;
    }

    public double getCircumference() {
        return circumference;
    }
}