package ZooAnimals;

public class Buffalo extends Animal implements IHerbivore, ILand {
    public Buffalo(String name){
        super(
                name,
                EAnimalType.BUFFALO,
                4,
                true,
                false,
                EFoodSource.HERBIVORE,
                EHabitat.PLAINS,
                new EMeat[]{},
                new EPlants[]{ EPlants.GRASS}
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
