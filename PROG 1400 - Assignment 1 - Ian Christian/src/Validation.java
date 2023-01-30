/*
PROG 1400
Assignment 1
Ian Christian
w0480449
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validation {

    //Method to ensure goal and assist inputs are valid
    public static int getValidInput() {
        Scanner scan = new Scanner(System.in);
        int userInput = 0;

        //Continuously check for both proper datatype and that input is positive
        do {
            try {
                //Datatype validation
                while (!scan.hasNextInt()) {
                    System.out.println("That's not an integer. Please try again:");
                    scan.nextLine();
                }

                //Non-negative input validation
                userInput = scan.nextInt();
                scan.nextLine(); //Prevents accepting multiple negative numbers on 1 line
                while (userInput < 0) {
                    System.out.println("Negative numbers aren't allowed. Please try again:");
                    userInput = scan.nextInt();
                    scan.nextLine();
                }
            } catch (InputMismatchException e) {}
        } while (userInput < 0);

        return userInput; //Only reached if the user input passes both checks
    }

    //Method to ensure team name is less than 20 characters
    public static String getValidTeamName() {
        Scanner scan = new Scanner(System.in);
        String teamName;
        String potentialName = scan.nextLine();
        while (potentialName.length() > 20) {
            System.out.println("Name must be under 20 characters. Please try again:");
            potentialName = scan.nextLine();
        }
        teamName = potentialName;
        return teamName;
    }
}