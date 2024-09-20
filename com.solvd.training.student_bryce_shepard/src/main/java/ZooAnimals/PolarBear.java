package ZooAnimals;

import java.util.Arrays;

// Example of polymorphism
final public class PolarBear extends Bear implements ICarnivore, ISwimmer, ILand{
    public PolarBear(String name) {
        super(
                name,
                EAnimalType.POLAR_BEAR,
                EFoodSource.CARNIVORE,
                EHabitat.TUNDRA,
                new EMeat[] {EMeat.SEAL, EMeat.FISH},
                new EPlants[] {}
        );
    }

    @Override
    public void eatPlants() {
        System.out.printf("%s does not eat plants.%n", this.name);
    }

    @Override
    public void eat() {
        System.out.printf("%s is gonna go get some meat.%n", this.name);
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
        System.out.printf("See %s swim between patches of ice.%n", this.name);
    }

    @Override
    public void breach() {
        System.out.printf("%s fiercely charges out of the water.%n", this.name);
    }
}
