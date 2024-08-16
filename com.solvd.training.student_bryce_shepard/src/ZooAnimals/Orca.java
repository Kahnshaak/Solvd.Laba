package ZooAnimals;

import java.util.Objects;

public class Orca extends Animal{
    public Orca(){
        this.name = "Orca Whale";
        this.eats = Food.carnivore;
        this.hab = Habitat.ocean;
        this.claws = false;
        this.legs = 0;
        this.fur = false;
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
