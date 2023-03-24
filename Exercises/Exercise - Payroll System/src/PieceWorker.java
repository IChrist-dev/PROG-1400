/*
Exercise 10
PROG 1400
Ian Christian
w0480449
*/

public class PieceWorker extends Employee {
    private final int unitsProcuded;

    public PieceWorker(String firstName, String lastName, int unitsProcuded) {
        super(firstName, lastName);
        this.unitsProcuded = unitsProcuded;
    }

    //Implement abstract method
    @Override
    double calculateMonthlyPay() {
        return unitsProcuded;
    }

    public int getUnitsProcuded() {
        return unitsProcuded;
    }
}
