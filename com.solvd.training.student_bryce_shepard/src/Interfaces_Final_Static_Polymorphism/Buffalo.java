package Interfaces_Final_Static_Polymorphism;

public class Buffalo extends Animal implements IHerbivore, ILand {
    public Buffalo(){
        super(
                "Buffalo",
                4,
                true,
                false,
                EFoodSource.herbivore,
                EHabitat.plains,
                new EMeat[]{},
                new EPlants[]{ EPlants.grass }
        );
    }

    @Override
    public void eatPlants() {
        System.out.printf("The %s grazes %s on the %s.%n", this.name, this.plantOptions[0], this.hab);
    }

    @Override
    public void eat() {
        eatPlants();
    }

    @Override
    public void run() {
        System.out.printf("The %s runs through a field.%n", this.name);
    }
}
