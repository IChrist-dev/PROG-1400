public class Rhombus extends Shape {
    private double diagonalA;
    private double diagonalB;
    private double area;

    public Rhombus(String shapeName, int numOfSides, double rhombSideLength, double diagonalA,
                   double diagonalB) {
        super(shapeName, numOfSides, (rhombSideLength * 4));    //last passed argument is the circumference
        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
        this.area = (diagonalA * diagonalB) / 2;
    }

    @Override
    public double getArea() {
        return area;
    }

    //Method to split the rhombus into two equal triangles along the given diagonal axis
    public String splitRhombus(double diagonal) {
        double newTriCirc = ((this.getCircumference()) / 2) + diagonal;
        double newTriArea = this.getArea() / 2;
        return String.format("*SLICE*\nYou've cut this rhombus into two equal triangles. Each triangle " +
                "has a circumference of %.2f and an area of %.2f.", newTriCirc, newTriArea);
    }
}