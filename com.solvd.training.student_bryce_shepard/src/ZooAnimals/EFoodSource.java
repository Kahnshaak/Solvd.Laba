package ZooAnimals;

public enum EFoodSource {
    CARNIVORE,
    HERBIVORE,
    OMNIVORE;

    @Override
    public String toString() {
        return name().toLowerCase().replace('_', ' ');
    }
}
