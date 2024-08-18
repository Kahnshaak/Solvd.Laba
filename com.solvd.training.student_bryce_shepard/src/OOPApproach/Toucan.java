package OOPApproach;

import java.util.Objects;

public class Toucan extends Animal{
    public Toucan(){
        this.name = "Toucan";
        this.legs = 2;
        this.fur = false;
        this.claws = false;
        this.hab = Habitat.rainForest;
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
