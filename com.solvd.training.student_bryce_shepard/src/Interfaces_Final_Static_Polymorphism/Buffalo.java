package Interfaces_Final_Static_Polymorphism;

public class Buffalo extends Animal implements IHerbivore, ILand {
    public Buffalo(){
        super(
                4,
                true,
                false,
                new EMeat[]{},
                new EPlants[]{ EPlants.grass }
        );
        this.name = "Buffalo";
        this.hab = EHabitat.plains;
        this.foodSource = EFoodSource.herbivore;
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
