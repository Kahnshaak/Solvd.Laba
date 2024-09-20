package ZooAnimals;

import java.util.Arrays;

final public class BlueWhale extends Whale implements ICarnivore, IHerbivore{
    public BlueWhale(String name) {
        super(
                name,
                EAnimalType.BLUE_WHALE,
            EFoodSource.OMNIVORE,
            new EMeat[] { EMeat.ZOOPLANKTON},
            new EPlants[] { EPlants.PHYTOPLANKTON}
        );
    }

    @Override
    public void hunt() {
        System.out.printf("%s prowls for some food.%n", this.name);
    }

    @Override
    public void eatMeat() {
        System.out.printf("%s scoops up some %s%n", this.name, this.meatOptions[0]);
    }

    @Override
    public void eatPlants() {
        System.out.printf("%s scoops up some %s%n", this.name, this.plantOptions[0]);

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

    public void eat() {
        hunt();
        eatMeat();
        eatPlants();
    }
}
