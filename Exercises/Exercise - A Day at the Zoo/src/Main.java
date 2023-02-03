public class Main {
    public static void main(String[] args) {
        Animal cowA = new Animal(); //Using the default constructor

        Animal cowB = new Animal("cow", 1400, "grasslands", false);
        Animal tiger = new Animal("tiger", 330, "rain forest and savanna", true);
        Animal chicken = new Animal("chicken", 5, "chicken coop", false);

        Animal[] zoo = {cowB, tiger, chicken};

        for (Animal i : zoo) {
            System.out.println(i.feed());        //Feed the animal
            System.out.println(i.makeSound());   //The animal makes a noise
            System.out.println(i.reportState() + "\n"); //The animal somehow speaks English
        }

        tiger.setEndangered(false);
        System.out.println("Conservationist efforts have paid off. Tigers populations are increasing! \n" +
                tiger.reportState());
    }
}
