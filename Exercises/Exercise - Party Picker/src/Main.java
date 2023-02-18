/*
* Ian Christian
* PROG 1400
* w0480449
* */
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Friend> friendList = new ArrayList<Friend>();

        //Initial program description
        JOptionPane.showMessageDialog(null, "Welcome to the Party Picker.\n\n" +
                "Enter each person's name and the type of food they're likely to bring,\n" +
                "then indicate whether they are actually invited to the party or not.");

        //Guest variables pre-declaration
        String firstName;
        String lastName;
        String foodToBring;
        boolean isInvited;

        //region Pop-up inputs
        do {
            firstName = JOptionPane.showInputDialog(null, "Enter first name:", "Party Picker", JOptionPane.QUESTION_MESSAGE);;
            //If statement to stop loop if the first person has no info at all. Avoids NullPointerException
            if (firstName == null) {
                break;
            }

            lastName = JOptionPane.showInputDialog(null, "Enter last name:", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            if (lastName == null) {
                break;
            }

            foodToBring = JOptionPane.showInputDialog(null, "Enter the food they will likely bring:", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            if (foodToBring == null) {
                break;
            }

            String[] inviteOptions = {"Invited", "Not Invited"};

            int invitationChoice = JOptionPane.showOptionDialog(null, "Choose if this guest is " +
                    "is invited or not.", "Party Picker", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, inviteOptions, inviteOptions[0]);

            if(invitationChoice == 0) isInvited = true;
            else if(invitationChoice == 1) isInvited = false;
            //Only remaining possibility is hitting the exit button
            else break;

            //Create the friend with this cycle's inputs
            Friend tempFriend = new Friend(firstName, lastName, isInvited, foodToBring);

            //Add the new friend to the guest list
            friendList.add(tempFriend);
        } while (!firstName.isEmpty());
        //endregion

        //region Guest Report
        StringBuilder guestReport = new StringBuilder();

        //Build a message block containing info on all party guests
        for (Friend currentFriend : friendList) {
            guestReport.append(currentFriend.toString()).append("\n");
        }

        //Display the final report
        JOptionPane.showMessageDialog(null, "Guests: \n\n" + guestReport, "Guest List",
                JOptionPane.INFORMATION_MESSAGE);
        //endregion
    }
}