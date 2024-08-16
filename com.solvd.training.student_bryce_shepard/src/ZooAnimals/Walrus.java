package ZooAnimals;

import java.util.Objects;

public class Walrus extends Animal{
    public Walrus(){
        this.name = "Walrus";
        this.claws = false;
        this.eats = Food.carnivore;
        this.fur = false;
        this.hab = Habitat.tundra;
        this.hibernates = true;
        this.legs = 0;
    }

    @Override
    public String toString(){
        return String.format("This is a %s, it is a %s, and lives in the %s. It has %d legs.", this.name, this.eats, this.hab, this.legs);
    }

    @Override
    public boolean equals(Object obj) {
        return getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, legs, fur, claws, hibernates, eats, hab);
    }
}
