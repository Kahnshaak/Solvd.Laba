package ZooAnimals;

import java.util.Random;

public class Cougar extends Animal implements ICarnivore, ILand{
    public Cougar(String name) {
        super(
                name,
                EAnimalType.COUGAR,
                4,
                true,
                true,
                EFoodSource.CARNIVORE,
                EHabitat.MOUNTAIN,
                new EMeat[]{ EMeat.CARRION, EMeat.DEER},
                new EPlants[]{}
        );
    }

    @Override
    public void hunt() {
        System.out.printf("You see the %s prowl after its prey...%n", this.name);
    }

    @Override
    public void eatMeat() {
        Random rand = new Random();
        EMeat menu = meatOptions[rand.nextInt(meatOptions.length)];
        System.out.printf("This %s enjoys some delicious %s%n", this.name, menu.toString());
    }

    @Override
    public void eat() {
        hunt();
        eatMeat();
    }

    @Override
    public void run() {
        System.out.printf("The %s springs out and charges off.%n", this.name);
    }
}
