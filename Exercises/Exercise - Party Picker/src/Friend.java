/*
 * Ian Christian
 * PROG 1400
 * w0480449
 * */
public class Friend extends Person{
    private String foodToBring;

    //Constructor
    public Friend(String firstName, String lastName, boolean isInvited, String foodToBring) {
        super(firstName, lastName, isInvited);
        this.foodToBring = foodToBring;
    }

    //Getter
    public String getFoodToBring() {
        return foodToBring;
    }

    //Custom toString method to output a guest's relevant information
    @Override
    public String toString() {
        if(isInvited()) {
            return getFullName() + " is bringing " + this.foodToBring.toLowerCase() + ". They are invited to the party.";
        } else if (!isInvited()){
            return getFullName() + " is bringing nothing because they are not invited to the party.";
        } else {
            return "Invite status is undetermined";
        }
    }
}
