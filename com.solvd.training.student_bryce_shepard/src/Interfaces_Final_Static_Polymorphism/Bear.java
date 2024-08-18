package Interfaces_Final_Static_Polymorphism;

import java.util.Random;

public class Bear extends Animal implements IHibernator, ICarnivore, IHerbivore, ILand {
    public Bear(){
        super(
                4,
                true,
                true,
                new EMeat[]{EMeat.fish, EMeat.deer, EMeat.carrion, EMeat.insects},
                new EPlants[]{EPlants.berries, EPlants.leaves}
        );
        this.name = "Bear";
        this.hibernating = false;
        this.foodSource = EFoodSource.omnivore;
        this.hab = EHabitat.forest;
    }

    public Bear(EMeat[] meats, EPlants[] plants) {
        super(
                4,
                true,
                true,
                meats,
                plants
        );
    }

    @Override
    public void eatMeat() {
        Random rand = new Random();
        EMeat menu = meatOptions[rand.nextInt(meatOptions.length)];
        System.out.printf("This %s is eating some %s%n", this.name, menu.toString());
    }

    @Override
    public void eatPlants() {
        Random rand = new Random();
        EPlants menu = plantOptions[rand.nextInt(plantOptions.length)];
        System.out.printf("The %s starts to eat some %s%n", this.name, menu.toString());
    }


    public void eat(){
        Random rand = new Random();
        int selector = rand.nextInt(2);
        if (selector == 1) {
            System.out.printf("The %s is gonna eat meat today.%n", this.name);
            hunt();
            eatMeat();
            return;
        }
        System.out.printf("The %s is gonna eat plants today.%n", this.name);
        eatPlants();
    }

    @Override
    public void hunt() {
        System.out.printf("The %s begins stalking some prey%n", this.name);
    }

    @Override
    public void run() {
        System.out.printf("See the %s run%n", this.name);
    }

    @Override
    public boolean storeFood(boolean extraFood) {
        if(extraFood) {
            System.out.printf("The %s took the extra food and stored it away%n", this.name);
            return true;
        }
        System.out.printf("The %s could not store any extra food%n", this.name);
        return false;
    }

    @Override
    public void hibernate() {
        if(!hibernating){
            hibernating = true;
            System.out.printf("This %s is now hibernating%n", this.name);
            return;
        }
        System.out.printf("This %s is already hibernating%n", this.name);
    }

    @Override
    public boolean isHibernating() {
        return hibernating;
    }

    @Override
    public void wakeUp() {
        if(hibernating){
            hibernating = false;
            System.out.printf("This %s is now awake!%n", this.name);
            return;
        }
        System.out.printf("This %s was not hibernating.%n", this.name);
    }
}
