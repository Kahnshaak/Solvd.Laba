package ZooAnimals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Objects;

public abstract class Animal {
    protected static final Logger logger = LogManager.getLogger(Animal.class);
    final protected String name;
    final protected EAnimalType animalType;
    final protected int legs;
    final protected boolean fur;
    final protected boolean claws;
    final protected EFoodSource foodSource;
    final protected EHabitat hab;
    final protected EMeat[] meatOptions;
    final protected EPlants[] plantOptions;
    protected boolean hibernating;

    protected Animal(String name, EAnimalType animalType, int legs, boolean fur, boolean claws, EFoodSource foodSource, EHabitat hab, EMeat[] meatOptions, EPlants[] plantOptions) {
        this.name = toCapitalize(name);
        this.animalType = animalType;
        this.legs = legs;
        this.fur = fur;
        this.claws = claws;
        this.foodSource = foodSource;
        this.hab = hab;
        this.meatOptions = meatOptions;
        this.plantOptions = plantOptions;
    }

    private String toCapitalize(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public abstract void eat(EMeat meat) throws InvalidFoodException;
    public abstract void eat(EPlants plant) throws InvalidFoodException;
    public abstract void eat();

    @Override
    final public String toString(){
        return String.format("This is %s, and they are a(n) %s. They are a %s, and live in the %s. It has %d legs.", this.name, this.animalType, this.foodSource, this.hab, this.legs);
    }

    @Override
    final public boolean equals(Object obj) {
        return getClass() == obj.getClass();
    }

    @Override
    final public int hashCode() {
        return Objects.hash(name, legs, fur, claws, foodSource, hab);
    }

    final public EHabitat getHabitat() {
        return this.hab;
    }
}
