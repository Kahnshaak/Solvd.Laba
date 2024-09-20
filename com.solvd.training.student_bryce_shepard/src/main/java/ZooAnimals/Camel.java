package ZooAnimals;

import java.util.Arrays;

public class Camel extends Animal implements ILand, IHerbivore{
    public Camel(String name){
        super(
                name,
                EAnimalType.CAMEL,
                4,
                true,
                false,
                EFoodSource.HERBIVORE,
                EHabitat.DESERT,
                new EMeat[]{},
                new EPlants[]{ EPlants.GRASS}
        );
    }

    @Override
    public void eatPlants() {
        System.out.printf("%s finds a spot of %s to chew on.%n", this.name, this.plantOptions[0]);
    }

    @Override
    public void eat() {
        eatPlants();
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
    public void run() {
        System.out.printf("%s pads along in the sand.%n", this.name);
    }
}
