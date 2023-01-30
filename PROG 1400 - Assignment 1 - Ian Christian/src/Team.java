/*
PROG 1400
Assignment 1
Ian Christian
w0480449
*/

import java.lang.Math;
import java.util.ArrayList;

public class Team {
    //Team Properties
    private String teamName;
    private double budget;
    private ArrayList<Player> playersList = new ArrayList<>();


    //Constructor
    public Team(String teamName) {
        this.teamName = teamName;

        //Random number 0-100,000 cannot be accessed except when creating Team object
        this.budget = 100000 * Math.random();
    }

    //region "Getters and Setters"
    public String getTeamName() {return teamName;}
    public double getBudget() {return budget;}
    public ArrayList<Player> getTeamArray() {return playersList;}

    //Setter to add a player to the team list
    public void addToPlayersList(Player tempPlayer) {this.playersList.add(tempPlayer);}
    //endregion

    //region "Reports Methods"

    //Method to display stats of the team (report 1)
    public void reportTeamStats() {
        int goalTotal = 0;
        int assistTotal = 0;
        int overallTotal;

        for (int i=0; i<this.playersList.size(); i++) {
            //Fetch player object from the list to temporary variable
            Player tempPlayer = this.playersList.get(i);

            //Sum of all goals scored on this team
            goalTotal += tempPlayer.getGoalsNum();
            //Sum of all assists made on this team
            assistTotal += tempPlayer.getAssistsNum();
        }

        //Goals and assists combined
        overallTotal = goalTotal + assistTotal;

        //Reformat all variables for proper column spacing
        String formatTeamName = String.format("%-20s", this.teamName + ":");
        String formatGoalTotal = String.format("%-10s", "G - " + goalTotal);
        String formatAssistTotal = String.format("%-10s", "A - " + assistTotal);
        String formatOverallTotal = String.format("%s %-7s","Total -", overallTotal);
        String formatBudget = String.format("Budget - $%.2f", + this.budget);
        System.out.println(formatTeamName + formatGoalTotal + formatAssistTotal + formatOverallTotal + formatBudget);

        //Determine and display the team rating
        System.out.print("Rating: ");
        if (overallTotal > 20) {
            System.out.println("*** stars");
        } else if (overallTotal >= 10) {
            System.out.println("** stars");
        } else if (overallTotal > 0) {
            System.out.println("* star");
        } else {
            System.out.println("0 stars");
        }
    }

    //Method to display stats of every player on the team (report 2)
    public void reportStatsPerPlayer() {
        for (Player eachPlayer : playersList) {
            System.out.println(this.teamName);
            eachPlayer.outputPlayerDetails();
        }
    }
    //endregion
}