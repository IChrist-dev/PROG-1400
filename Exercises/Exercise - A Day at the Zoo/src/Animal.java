/*PROG 1400
Exercise - A Day at the Zoo
Ian Christian*/

public class Animal {
    private String  species;
    private int maxWeight;
    private String habitat;
    private boolean isEndangered;

    //region Constructors
    //Default constructor
    public Animal() {
        this.species = "Not yet specified";
        this.habitat = "Not yet specified";
        this.isEndangered = false;
    }

    //Parameterized constructor
    public Animal(String species, int maxWeight, String habitat, boolean isEndangered) {
        this.species = species;
        this.maxWeight = maxWeight;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }
    //endregion

    //region Getters
    public String getSpecies() {
        return species;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public String getHabitat() {
        return habitat;
    }

    public boolean isEndangered() {
        return isEndangered;
    }
    //endregion

    //region Setters
    //Cannot reset species type after instantiation. All other properties may change over time
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    //region Behaviours
    //Method to show the animal has been fed
    public String feed() {
        return this.species + " goes yum!";
    }

    //Method for the animal to make a sound
    public String makeSound() {
        if (this.species.equalsIgnoreCase("cow")) {
            return "moo";
        } else if (this.species.equalsIgnoreCase("tiger")) {
            return "purr";
        } else if (this.species.equalsIgnoreCase("chicken")) {
            return "cluck-cluck";
        } else {
            return "Sorry, this species isn't in the zoo.";
        }
    }

    //Method for the animal to report its state
    @Override
    public String toString() {
        String output = "I am a " + this.maxWeight + "lb " + this.species +
                " that lives in the " + this.habitat + ". I ";
        String am = "am";

        if (!this.isEndangered) {
            am += " not";
        }
        output += am + " an endangered species.";

        return output;
    }
}
