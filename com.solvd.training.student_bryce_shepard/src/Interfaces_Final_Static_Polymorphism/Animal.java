package Interfaces_Final_Static_Polymorphism;

import java.util.Objects;

public abstract class Animal {
    final protected String name;
    final protected int legs;
    final protected boolean fur;
    final protected boolean claws;
    final protected EFoodSource foodSource;
    final protected EHabitat hab;
    final protected EMeat[] meatOptions;
    final protected EPlants[] plantOptions;
    protected boolean hibernating;

    protected Animal(String name, int legs, boolean fur, boolean claws, EFoodSource foodSource, EHabitat hab, EMeat[] meatOptions, EPlants[] plantOptions) {
        this.name = name;
        this.legs = legs;
        this.fur = fur;
        this.claws = claws;
        this.foodSource = foodSource;
        this.hab = hab;
        this.meatOptions = meatOptions;
        this.plantOptions = plantOptions;
    }

    public abstract void eat();

    @Override
    final public String toString(){
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
