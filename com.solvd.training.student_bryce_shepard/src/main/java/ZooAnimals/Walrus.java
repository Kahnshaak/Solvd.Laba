package ZooAnimals;

import java.util.Arrays;
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
        System.out.printf("%s trolls around the water for something to eat...%n", this.name);
    }

    @Override
    public void eatMeat() {
        Random rand = new Random();
        EMeat menu = meatOptions[rand.nextInt(meatOptions.length)];
        System.out.printf("%s found some %s to eat.%n", this.name, menu.toString());
    }

    @Override
    public void eat() {
        hunt();
        eatMeat();
    }

    @Override
    public void eat(EMeat meat) throws InvalidFoodException {
        try {
            if (Arrays.asList(meatOptions).contains(meat)) {
                System.out.printf("You feed %s some %s.%n", this.name, meat.toString());
            } else {
                throw new InvalidFoodException("Invalid food source: " + meat);
            }
        } catch (InvalidFoodException e) {
            logger.error("Invalid food source", e);
        }
    }

    @Override
    public void eat(EPlants plant) throws InvalidFoodException {
        try {
            if (Arrays.asList(plantOptions).contains(plant)) {
                System.out.printf("You feed %s some %s.%n", this.name, plant.toString());
            } else {
                throw new InvalidFoodException("Invalid food source: " + plant);
            }
        } catch (InvalidFoodException e) {
            logger.error("Invalid food source", e);
        }
    }

    @Override
    public void swim() {
        System.out.printf("%s lazily swims down to the OCEAN floor.%n", this.name);
    }

    @Override
    public void breach() {
        System.out.printf("%s pulls itself from the water to nap on an ice shelf.%n", this.name);
    }
}
