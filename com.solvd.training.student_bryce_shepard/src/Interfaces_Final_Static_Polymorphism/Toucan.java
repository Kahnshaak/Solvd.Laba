package Interfaces_Final_Static_Polymorphism;

import java.util.Random;

public class Toucan extends Animal implements IFlyer, IHerbivore, ICarnivore {
    public Toucan(){
        super(
                2,
                false,
                true,
                new EMeat[]{ EMeat.insects },
                new EPlants[]{ EPlants.fruit }
        );
        this.name = "Toucan";
        this.hab = EHabitat.rainForest;
        this.foodSource = EFoodSource.omnivore;
    }

    @Override
    public void eatPlants() {
        System.out.printf("The %s eats some delicious %s.%n", this.name, this.plantOptions[0]);

    }

    @Override
    public void eatMeat() {
        System.out.printf("The %s finds some %s to eat.%n", this.name, this.meatOptions[0]);
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
        System.out.printf("The %s is gonna eat insects today.%n", this.name);
        eatMeat();
    }

    @Override
    public void fly() {
        System.out.printf("The %s soars above the tree canopy.%n", this.name);
    }

    @Override
    public void roost() {
        System.out.printf("The %s roosts in a tree high above the ground.%n", this.name);
    }
}