package ZooAnimals;

import java.util.Arrays;
import java.util.Random;

final public class Orca extends Whale implements ICarnivore{
    public Orca(String name){
        super(
                name,
                EAnimalType.ORCA,
                EFoodSource.CARNIVORE,
                new EMeat[]{ EMeat.SEAL, EMeat.FISH, EMeat.SQUID},
                new EPlants[]{}
        );
    }

    @Override
    public void hunt() {
        System.out.printf("%s begins chasing some prey.%n", this.name);
    }

    @Override
    public void eatMeat() {
        Random rand = new Random();
        EMeat menu = meatOptions[rand.nextInt(meatOptions.length)];
        System.out.printf("%s is eating some %s%n", this.name, menu.toString());
    }

    @Override
    public void eat(){
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
}
