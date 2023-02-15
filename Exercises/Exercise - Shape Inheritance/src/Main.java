import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //region Triangle Object Creation
        //Collect two sides of a right-triangle
        double sideA = 0;
        double sideB = 0;

        System.out.println("Please enter two sides of a right angle triangle\n" +
                "Side A:");
        try {
            while (!scan.hasNextDouble()) {
                System.out.println("Only number values for the triangle please.");
                scan.next();
            }
            sideA = scan.nextDouble();

            System.out.println("Side B:");
            while (!scan.hasNextDouble()) {
                System.out.println("Only number values for the triangle please.");
                scan.next();
            }
            sideB = scan.nextDouble();
        } catch (InputMismatchException ignored) {
        }

        //Create a Triangle object. Inline hypotenuse calculation
        Triangle bermudaTriangle = new Triangle("Circle", 3, sideA, sideB, Math.hypot(sideA, sideB), ((sideA * sideB) / 2));

        System.out.printf("Circumference of triangle: %.2f\n", bermudaTriangle.getCircumference());
        System.out.printf("Area of triangle: %.2f\n", bermudaTriangle.getArea());
        System.out.println(bermudaTriangle.makeMeSquare());
        //endregion

        //region Circle Object Creation
        double circRad = 0;
        double circDiam = 0;

        System.out.println("\nPlease enter the radius of a circle:");
        try {
            while (!scan.hasNextDouble()) {
                System.out.println("Only number values for the circle please.");
                scan.next();
            }
            circRad = scan.nextDouble();
        } catch (InputMismatchException ignored) {
        }
        circDiam = circRad * 2;

        //Calculate circle area
        double circArea = Math.PI * Math.pow(circRad, 2);

        //Create a Circle object
        Circle myCircle = new Circle(circRad, "Circle", 1);
        System.out.printf("Circle area: %.2f\n", myCircle.getArea());
        System.out.println(myCircle.circleSquish(5));
        //endregion

        //region Rhombus Object Creation
        double diagonalA = 0;
        double diagonalB = 0;

        System.out.println("\nPlease enter the diagonals of a rhombus\n" +
                "Diagonal A:");
        try {
            while (!scan.hasNextDouble()) {
                System.out.println("Only number values for the rhombus please.");
                scan.next();
            }
            diagonalA = scan.nextDouble();

            System.out.println("Diagonal B:");
            while (!scan.hasNextDouble()) {
                System.out.println("Only number values for the triangle please.");
                scan.next();
            }
            diagonalB = scan.nextDouble();
        } catch (InputMismatchException ignored) {
        }

        //Calculate the side length based on the diagonals (all sides being equal)
        double rhombSideLength = Math.sqrt(Math.pow(diagonalA / 2, 2) + Math.pow(diagonalB / 2, 2));

        //Create a Rhombus object
        Rhombus myRhombus = new Rhombus("Rhombus", 4, rhombSideLength, diagonalA, diagonalB);
        System.out.println(rhombSideLength);
        System.out.printf("Circumference of rhombus: %.2f\n", myRhombus.getCircumference());
        System.out.printf("Area of rhombus: %.2f\n", myRhombus.getArea());
        System.out.println(myRhombus.splitRhombus(diagonalA));
        //endregion
    }
}