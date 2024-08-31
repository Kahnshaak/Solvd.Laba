package ZooAnimals;

final public class BlueWhale extends Whale implements ICarnivore, IHerbivore{
    public BlueWhale(String name) {
        super(
                name,
                EAnimalType.BLUE_WHALE,
            EFoodSource.OMNIVORE,
            new EMeat[] { EMeat.ZOOPLANKTON},
            new EPlants[] { EPlants.PHYTOPLANKTON}
        );
    }

    @Override
    public void hunt() {
        System.out.printf("The %s prowls for some food.%n", this.name);
    }

    @Override
    public void eatMeat() {
        System.out.printf("The %s scoops up some %s%n", this.name, this.meatOptions[0]);
    }

    @Override
    public void eatPlants() {
        System.out.printf("The %s scoops up some %s%n", this.name, this.plantOptions[0]);

    }

    public void eat(){
        hunt();
        eatMeat();
        eatPlants();
    }
}
