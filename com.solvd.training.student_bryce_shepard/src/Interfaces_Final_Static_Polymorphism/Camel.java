package Interfaces_Final_Static_Polymorphism;

public class Camel extends Animal implements ILand, IHerbivore{
    public Camel(){
        super(
                "Camel",
                4,
                true,
                false,
                EFoodSource.herbivore,
                EHabitat.desert,
                new EMeat[]{},
                new EPlants[]{ EPlants.grass }
        );
    }

    @Override
    public void eatPlants() {
        System.out.printf("The %s finds a spot of %s to chew on.%n", this.name, this.plantOptions[0]);
    }

    @Override
    public void eat() {
        eatPlants();
    }

    @Override
    public void run() {
        System.out.printf("The %s pads along in the sand.%n", this.name);
    }
}
