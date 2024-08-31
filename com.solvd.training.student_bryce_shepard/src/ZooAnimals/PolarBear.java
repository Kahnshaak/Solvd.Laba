package ZooAnimals;

// Example of polymorphism
final public class PolarBear extends Bear implements ICarnivore, ISwimmer, ILand{
    public PolarBear(String name) {
        super(
                name,
                EAnimalType.POLAR_BEAR,
                EFoodSource.CARNIVORE,
                EHabitat.TUNDRA,
                new EMeat[] {EMeat.SEAL, EMeat.FISH},
                new EPlants[] {}
        );
    }

    @Override
    public void eatPlants() {
        System.out.printf("The %s does not eat plants.%n", this.name);
    }

    @Override
    public void eat(){
        System.out.printf("The %s is gonna go get some meat.%n", this.name);
        hunt();
        eatMeat();
    }

    @Override
    public void swim() {
        System.out.printf("See the %s swim between patches of ice.%n", this.name);
    }

    @Override
    public void breach() {
        System.out.printf("The %s fiercely charges out of the water.%n", this.name);
    }
}
