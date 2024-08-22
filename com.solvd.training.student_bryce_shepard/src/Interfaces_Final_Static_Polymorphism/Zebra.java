package Interfaces_Final_Static_Polymorphism;

public class Zebra extends Animal implements ILand, IHerbivore{
    public Zebra(){
        super(
                "Zebra",
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
        System.out.printf("The %s found some %s to eat.%n", this.name, this.plantOptions[0]);
    }

    @Override
    public void eat() {
        eatPlants();
    }

    @Override
    public void run() {
        System.out.printf("The %s gallops gracefully through the %s.%n", this.name, this.hab);
    }
}