package ZooAnimals;

public enum EPlants {
    BERRIES,
    LEAVES,
    KELP,
    GRASS,
    PHYTOPLANKTON,
    SEEDS,
    FRUIT;

    @Override
    public String toString() {
        return name().toLowerCase().replace('_', ' ');
    }
}
