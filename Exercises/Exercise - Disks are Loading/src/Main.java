/*
 * PROG 1400
 * Exercise: Disks are Loading
 * Ian Christian
 */

public class Main {
    public static void main(String[] args) {
        Circle circleA = new Circle();                       //default constructor
        Circle circleB = new Circle(5.2);              //secondary constructor
        Circle circleC = new Circle(42, "Blue");  //tertiary constructor

        System.out.printf("Circle A area: %.2f\n", circleA.getArea());
        System.out.println("Circle B radius: " + circleB.getRadius());
        System.out.println(circleC.makeString());
    }
}