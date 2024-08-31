package ZooAnimals;

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
        System.out.printf("The %s begins chasing some prey.%n", this.name);
    }

    @Override
    public void eatMeat() {
        Random rand = new Random();
        EMeat menu = meatOptions[rand.nextInt(meatOptions.length)];
        System.out.printf("This %s is eating some %s%n", this.name, menu.toString());
    }

    @Override
    public void eat() {
        hunt();
        eatMeat();
    }
}
