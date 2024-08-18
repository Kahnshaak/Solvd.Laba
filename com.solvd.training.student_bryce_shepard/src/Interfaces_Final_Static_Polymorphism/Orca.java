package Interfaces_Final_Static_Polymorphism;

import java.util.Random;

// Polymorphism and Final
final public class Orca extends Whale implements ICarnivore{
    public Orca(){
        super(
                new EMeat[]{ EMeat.seal, EMeat.fish, EMeat.squid},
                new EPlants[]{}
        );
        this.name = "Orca Whale";
        this.foodSource = EFoodSource.carnivore;
    }

    @Override
    public void hunt() {
        System.out.printf("The %s begins chasing some prey.%n", this.name);
    }

    @Override
    public void eatMeat() {
        Random rand = new Random();
        EMeat menu = meatOptions[rand.nextInt(meatOptions.length)];
        System.out.printf("This %s is eating some %s%n", this.name, menu.toString());
    }

    @Override
    public void eat() {
        hunt();
        eatMeat();
    }
}
