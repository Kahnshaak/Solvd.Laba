package Interfaces_Final_Static_Polymorphism;

final public class BlueWhale extends Whale implements ICarnivore, IHerbivore{
    public BlueWhale(){
        super(
            new EMeat[] { EMeat.zooplankton },
            new EPlants[] { EPlants.phytoplankton }
        );
        this.name = "Blue Whale";
        this.foodSource = EFoodSource.omnivore;
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
