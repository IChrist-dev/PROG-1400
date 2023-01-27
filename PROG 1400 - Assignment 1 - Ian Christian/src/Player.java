/*
PROG 1400
Assignment 1
Ian Christian
w0480449
*/

public class Player {
    //Player Properties
    private String playerName;
    private int goals;
    private int assists;

    //Constructor
    public Player(String playerName, int goalsNum, int assistsNum) {
        this.playerName = playerName;
        this.goals = goalsNum;
        this.assists = assistsNum;
    }

    //Getters
    public String getPlayerName() {return playerName;}
    public int getGoalsNum() {return goals;}
    public int getAssistsNum() {return assists;}

    //Method to display team member stats
    public void outputPlayerDetails() {
        int playerTotal = this.goals + this.assists;

        //Reformat all variables for proper column spacing
        String formatPlayerName = String.format("%-20s", this.playerName + ":");
        String formatGoalTotal = String.format("%-10s", "G - " + this.goals);
        String formatAssistTotal = String.format("%-10s", "A - " + this.assists);
        String formatPlayerTotal = String.format("%s %-10s","Total -", playerTotal);


        System.out.println(formatPlayerName + formatGoalTotal + formatAssistTotal +
                formatPlayerTotal);
        //System.out.println(this.playerName + ": " + "G - " + this.goals + " A - " + this.assists);
    }
}
