package ZooAnimals;

public abstract class Animal {
    protected String name;
    protected int legs;
    protected boolean fur;
    protected boolean claws;
    protected boolean hibernates;
    protected Food eats;
    protected Habitat hab;

    public Animal() {
        this.name = "Animal";
        this.legs = 4;
        this.fur = true;
        this.claws = true;
        this.hibernates = false;
        this.eats = Food.omnivore;
        this.hab = Habitat.forest;
    }

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract int hashCode();
}
