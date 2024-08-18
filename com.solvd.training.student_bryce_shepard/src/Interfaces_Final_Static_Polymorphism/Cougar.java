package Interfaces_Final_Static_Polymorphism;

import java.util.Random;

public class Cougar extends Animal implements ICarnivore, ILand{
    public Cougar(){
        super(
                4,
                true,
                true,
                new EMeat[]{ EMeat.carrion, EMeat.deer },
                new EPlants[]{}
        );
        this.name = "Cougar";
        this.foodSource = EFoodSource.carnivore;
        this.hab = EHabitat.mountain;
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
