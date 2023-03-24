/*
Exercise 10
PROG 1400
Ian Christian
w0480449
*/

public class Commissioned extends Employee {
    private final double grossSales;

    public Commissioned(String firstName, String lastName, double grossSales) {
        super(firstName, lastName);
        this.grossSales = grossSales;
    }

    //Implement abstract method
    @Override
    double calculateMonthlyPay() {
        return 2000 + (grossSales * 0.1);
    }

    public double getGrossSales() {
        return grossSales;
    }
}
