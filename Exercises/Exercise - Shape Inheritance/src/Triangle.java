public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double area;

    public Triangle(String shapeName, int numOfSides, double sideA, double sideB, double hypot, double area) {
        super(shapeName, numOfSides, (sideA + sideB + hypot));  //last passed argument is the circumference
        this.sideA = sideA;
        this.sideB = sideB;
        this.area = area;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    //Method to turn the right angle triangle into a square by doubling certain values
    public String makeMeSquare() {
        double squareCirc = (this.sideA * 2) + (this.sideB * 2);
        double squareArea = this.sideA * this.sideB;

        return String.format("You doubled me and now I'm a square with a circumference of %.2f and an area " +
                "of %.2f, thanks!", squareCirc, squareArea);
    }
}