package Interfaces_Final_Static_Polymorphism;

import java.util.Objects;

public abstract class Animal {
    protected String name;
    final protected int legs;
    final protected boolean fur;
    final protected boolean claws;
    protected boolean hibernating;
    protected EFoodSource foodSource;
    protected EHabitat hab;
    final protected EMeat[] meatOptions;
    final protected EPlants[] plantOptions;

    protected Animal(int legs, boolean fur, boolean claws, EMeat[] meatOptions, EPlants[] plantOptions) {
        this.legs = legs;
        this.fur = fur;
        this.claws = claws;
        this.meatOptions = meatOptions;
        this.plantOptions = plantOptions;
    }

    public abstract void eat();

    @Override
    public String toString(){
        return String.format("This is a %s, it is a %s, and lives in the %s. It has %d legs.", this.name, this.foodSource, this.hab, this.legs);
    }

    @Override
    final public boolean equals(Object obj) {
        return getClass() == obj.getClass();
    }

    @Override
    final public int hashCode() {
        return Objects.hash(name, legs, fur, claws, foodSource, hab);
    }
}
