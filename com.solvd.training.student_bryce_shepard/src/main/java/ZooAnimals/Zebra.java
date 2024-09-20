package ZooAnimals;

import java.util.Arrays;

public class Zebra extends Animal implements ILand, IHerbivore{
    public Zebra(String name){
        super(
                name,
                EAnimalType.ZEBRA,
                4,
                false,
                false,
                EFoodSource.HERBIVORE,
                EHabitat.SAVANNAH,
                new EMeat[]{},
                new EPlants[]{ EPlants.GRASS}
        );
    }

    @Override
    public void eatPlants() {
        System.out.printf("%s found some %s to eat.%n", this.name, this.plantOptions[0]);
    }

    @Override
    public void eat(){
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
        System.out.printf("%s gallops gracefully through the %s.%n", this.name, this.hab);
    }
}