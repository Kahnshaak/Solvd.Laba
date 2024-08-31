package ZooAnimals;

// Polymorphism
public abstract class Whale extends Animal implements ISwimmer {
    public Whale(String name, EAnimalType animalType, EFoodSource fs, EMeat[] meats, EPlants[] plants){
        super(
                name,
                animalType,
                0,
                false,
                false,
                fs,
                EHabitat.OCEAN,
                meats,
                plants
        );
        // child classes establish food type
    }

    @Override
    public void breach(){
        System.out.printf("The %s majestically breaches, soaring into the air before splashing down.%n", this.name);
    }

    @Override
    public void swim(){
        System.out.printf("See the %s gracefully charge through the water.%n", this.name);
    }
}
