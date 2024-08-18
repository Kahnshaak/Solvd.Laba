package OOPApproach;

import java.util.Objects;

public class Zebra extends Animal{
    public Zebra(){
        this.name = "Zebra";
        this.claws = false;
        this.eats = Food.herbivore;
        this.hab = Habitat.savannah;
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
