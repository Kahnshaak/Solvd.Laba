package ZooAnimals;

import java.util.Random;

public class Walrus extends Animal implements ISwimmer, ICarnivore{
    public Walrus(String name){
        super(
                name,
                EAnimalType.WALRUS,
                0,
                false,
                false,
                EFoodSource.CARNIVORE,
                EHabitat.OCEAN,
                new EMeat[]{ EMeat.FISH, EMeat.SQUID, EMeat.SHRIMP, EMeat.CRAB},
                new EPlants[]{}
        );
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
        System.out.printf("The %s lazily swims down to the OCEAN floor.%n", this.name);
    }

    @Override
    public void breach() {
        System.out.printf("The %s pulls itself from the water to nap on an ice shelf.%n", this.name);
    }
}
