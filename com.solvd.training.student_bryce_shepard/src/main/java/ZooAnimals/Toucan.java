package ZooAnimals;

import java.util.Arrays;
import java.util.Random;

public class Toucan extends Animal implements IFlyer, IHerbivore, ICarnivore {
    public Toucan(String name){
        super(
                name,
                EAnimalType.TOUCAN,
                2,
                false,
                true,
                EFoodSource.OMNIVORE,
                EHabitat.RAIN_FOREST,
                new EMeat[]{ EMeat.INSECTS},
                new EPlants[]{ EPlants.FRUIT}
        );
    }

    @Override
    public void eatPlants() {
        System.out.printf("%s eats some delicious %s.%n", this.name, this.plantOptions[0]);

    }

    @Override
    public void eatMeat() {
        System.out.printf("%s finds some %s to eat.%n", this.name, this.meatOptions[0]);
    }

    @Override
    public void hunt() {}

    @Override
    public void eat() {
        Random rand = new Random();
        int selector = rand.nextInt(6);
        if (selector < 5) {
            eatPlants();
            return;
        }
        System.out.printf("%s is gonna eat INSECTS today.%n", this.name);
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
    public void fly() {
        System.out.printf("%s soars above the tree canopy.%n", this.name);
    }

    @Override
    public void roost() {
        System.out.printf("%s roosts in a tree high above the ground.%n", this.name);
    }
}