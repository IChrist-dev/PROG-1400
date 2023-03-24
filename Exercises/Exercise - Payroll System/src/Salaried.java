/*
Exercise 10
PROG 1400
Ian Christian
w0480449
*/

public class Salaried extends Employee {
    private final int yearsOfService;

    public Salaried(String firstName, String lastName, int yearsOfService) {
        super(firstName, lastName);
        this.yearsOfService = yearsOfService;
    }

    //Implement abstract method
    @Override
    double calculateMonthlyPay() {
        //The formula in the instructions was slightly unclear
        return (50000.0 / 12) + (0.001 * yearsOfService);
    }

    public int getYearsOfService() {
        return yearsOfService;
    }
}
