package ZooAnimals;

import java.util.Arrays;
import java.util.Random;

public class Bear extends Animal implements IHibernator, ICarnivore, IHerbivore, ILand {
    Random rand = new Random();
    public Bear(String name) {
        super(
                name,
                EAnimalType.BEAR,
                4,
                true,
                true,
                EFoodSource.OMNIVORE,
                EHabitat.FOREST,
                new EMeat[]{EMeat.FISH, EMeat.DEER, EMeat.CARRION, EMeat.INSECTS},
                new EPlants[]{EPlants.BERRIES, EPlants.LEAVES}
        );
        this.hibernating = false;
    }

    public Bear(String name, EAnimalType animalType, EFoodSource fs, EHabitat hab, EMeat[] meats, EPlants[] plants) {
        super(
                name,
                animalType,
                4,
                true,
                true,
                fs,
                hab,
                meats,
                plants
        );
    }

    @Override
    public void eatMeat() {
        EMeat menu = meatOptions[rand.nextInt(meatOptions.length)];
        System.out.printf("%s is eating some %s.%n", this.name, menu.toString());
    }

    @Override
    public void eatPlants() {
        EPlants menu = plantOptions[rand.nextInt(plantOptions.length)];
        System.out.printf("%s starts to eat some %s.%n", this.name, menu.toString());
    }

    @Override
    public void eat(){
        int selector = rand.nextInt(2);
        if (selector == 1) {
            System.out.printf("%s is gonna eat meat today.%n", this.name);
            hunt();
            eatMeat();
            return;
        }
        System.out.printf("%s is gonna eat plants today.%n", this.name);
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
    public void hunt() {
        System.out.printf("%s begins stalking some prey.%n", this.name);
    }

    @Override
    public void run() {
        System.out.printf("See %s run.%n", this.name);
    }

    @Override
    public boolean storeFood(boolean extraFood) {
        if(extraFood) {
            System.out.printf("%s took the extra food and stored it away.%n", this.name);
            return true;
        }
        System.out.printf("%s could not store any extra food.%n", this.name);
        return false;
    }

    @Override
    public void hibernate() {
        if(!hibernating){
            hibernating = true;
            System.out.printf("%s is now hibernating.%n", this.name);
            return;
        }
        System.out.printf("%s is already hibernating%n", this.name);
    }

    @Override
    public boolean isHibernating() {
        return hibernating;
    }

    @Override
    public void wakeUp() {
        if(hibernating){
            hibernating = false;
            System.out.printf("%s is now awake!%n", this.name);
            return;
        }
        System.out.printf("%s was not hibernating.%n", this.name);
    }
}
