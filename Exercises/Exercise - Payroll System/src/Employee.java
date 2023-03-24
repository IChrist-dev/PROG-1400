/*
Exercise 10
PROG 1400
Ian Christian
w0480449
*/

public abstract class Employee {
    private final String firstName;
    private final String lastName;

    //Constructor
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //region Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    //endregion

    //Abstract method to be implemented in child-classes
    abstract double calculateMonthlyPay();
}
