/*
Exercise 10
PROG 1400
Ian Christian
w0480449
*/

public class Manager extends Employee {
    private final double monthlyBonusAmount;

    public Manager(String firstName, String lastName, double monthlyBonusAmount) {
        super(firstName, lastName);
        this.monthlyBonusAmount = monthlyBonusAmount;
    }

    //Implement abstract method
    @Override
    double calculateMonthlyPay() {
        return (100000.0 / 12) + monthlyBonusAmount;
    }

    public double getMonthlyBonusAmount() {
        return monthlyBonusAmount;
    }
}
