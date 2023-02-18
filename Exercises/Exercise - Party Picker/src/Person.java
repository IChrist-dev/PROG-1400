/*
 * Ian Christian
 * PROG 1400
 * w0480449
 * */
public class Person {
    private String firstName;
    private String lastName;
    private boolean isInvited;

    //Constructor
    public Person(String firstName, String lastName, boolean isInvited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInvited = isInvited;
    }

    //region Getters

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public boolean isInvited() {
        return this.isInvited;
    }
    //endregion
}
