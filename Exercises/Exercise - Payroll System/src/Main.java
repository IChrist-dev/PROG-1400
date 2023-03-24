/*
Exercise 10
PROG 1400
Ian Christian
w0480449
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee theComm = new Commissioned("Bob", "Loblaw", 40000);
        Employee theSal = new Salaried("Sue", "Me", 10);
        Employee thePiece = new PieceWorker("Tina", "Zena", 1000);
        Employee theMan = new Manager("Richard", "Rich", 2000);

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(theComm);
        employeeArrayList.add(theSal);
        employeeArrayList.add(thePiece);
        employeeArrayList.add(theMan);

        for (Employee currentEmployee : employeeArrayList) {
            if (currentEmployee instanceof Commissioned) {
                Commissioned empCommissioned = (Commissioned) currentEmployee;
                System.out.printf("Name: %s %s\n" +
                        "\tPay Type: %s\n" +
                        "\tMonthly Pay: $%,.2f\n" +
                        "\n",
                        empCommissioned.getFirstName(),
                        empCommissioned.getLastName(),
                        empCommissioned.getClass().getSimpleName(),
                        empCommissioned.calculateMonthlyPay());

            } else if (currentEmployee instanceof Salaried) {
                Salaried empSalaried = (Salaried) currentEmployee;
                System.out.printf("Name: %s %s\n" +
                                "\tPay Type: %s\n" +
                                "\tMonthly Pay: $%,.2f\n" +
                                "\n",
                        empSalaried.getFirstName(),
                        empSalaried.getLastName(),
                        empSalaried.getClass().getSimpleName(),
                        empSalaried.calculateMonthlyPay());

            } else if (currentEmployee instanceof PieceWorker) {
                PieceWorker empPieceWorker = (PieceWorker) currentEmployee;
                System.out.printf("Name: %s %s\n" +
                                "\tPay Type: %s\n" +
                                "\tMonthly Pay: $%,.2f\n" +
                                "\n",
                        empPieceWorker.getFirstName(),
                        empPieceWorker.getLastName(),
                        empPieceWorker.getClass().getSimpleName(),
                        empPieceWorker.calculateMonthlyPay());

            } else if (currentEmployee instanceof Manager) {
                Manager empManager = (Manager) currentEmployee;
                System.out.printf("Name: %s %s\n" +
                                "\tPay Type: %s\n" +
                                "\tMonthly Pay: $%,.2f\n" +
                                "\n",
                        empManager.getFirstName(),
                        empManager.getLastName(),
                        empManager.getClass().getSimpleName(),
                        empManager.calculateMonthlyPay());
                //Sample Manager constructor input does not produce the same monthly pay as in the screenshot, though I am certain my formula is correct.
            }
        }
    }
}
