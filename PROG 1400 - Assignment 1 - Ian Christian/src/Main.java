/*
PROG 1400
Assignment 1
Ian Christian
w0480449
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Master list where all teams will be held
        ArrayList<Team> teamsObjectsList = new ArrayList<Team>();

        System.out.println("FANTASY HOCKEY APPLICATION \n" +
                "TEAM ENTRY \n" +
                "================================");

        //Loop to receive each team's details from the user then add to the list
        for (int i=1; i<=3; i++) {
            System.out.println("Enter name for team #" + i + ":");
            String tempTeamName = scan.nextLine();
            Team tempTeam = new Team(tempTeamName);
            teamsObjectsList.add(tempTeam);
        }

        System.out.println("PLAYER ENTRY \n" +
                "================================");

        //Add each player's info to each team using nested loop
        for (Team tempTeam : teamsObjectsList) {
            System.out.println("Enter players for " + tempTeam.getTeamName() + ":");
            for (int j=1; j<=3; j++) {
                //Collecting individual info
                System.out.println("Enter name for player #" + j + ":");
                String tempPlayerName = scan.nextLine();

                System.out.println("Enter number of goals for " + tempPlayerName + ":");
                int tempGoals = scan.nextInt();

                System.out.println("Enter number of assists for " + tempPlayerName + ":");
                int tempAssists = scan.nextInt();
                scan.nextLine(); //catch trailing blank-space

                //Create a player object with previous inputs
                Player tempPlayer = new Player(tempPlayerName, tempGoals, tempAssists);

                //Add the player to the team list
                tempTeam.addToPlayersList(tempPlayer);

                //Visual break for readability
                System.out.println("");
            }
        }

        //Print stats per team
        System.out.println("REPORT: Stats per Team\n" +
                "================================");
        for (Team tempTeam : teamsObjectsList) {
            tempTeam.reportTeamStats();
        }

        //Print stats per player
        System.out.println("\nREPORT: Stats per Player\n" +
                "================================");
        for (Team tempTeam : teamsObjectsList) {
            tempTeam.reportStatsPerPlayer();
        }
    }
}