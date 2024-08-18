package Interfaces_Final_Static_Polymorphism;

import java.util.Random;

public class Walrus extends Animal implements ISwimmer, ICarnivore{
    public Walrus(){
        super(
                0,
                false,
                false,
                new EMeat[]{ EMeat.fish, EMeat.squid, EMeat.shrimp, EMeat.crab },
                new EPlants[]{}
        );
        this.name = "Walrus";
        this.foodSource = EFoodSource.carnivore;
        this.hab = EHabitat.tundra;
    }

    @Override
    public void hunt() {
        System.out.printf("The %s trolls around the water for something to eat...%n", this.name);
    }

    @Override
    public void eatMeat() {
        Random rand = new Random();
        EMeat menu = meatOptions[rand.nextInt(meatOptions.length)];
        System.out.printf("This %s found some %s to eat.%n", this.name, menu.toString());
    }

    @Override
    public void eat() {
        hunt();
        eatMeat();
    }

    @Override
    public void swim() {
        System.out.printf("The %s lazily swims down to the ocean floor.%n", this.name);
    }

    @Override
    public void breach() {
        System.out.printf("The %s pulls itself from the water to nap on an ice shelf.%n", this.name);
    }
}
