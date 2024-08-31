package ZooAnimals;

public enum EHabitat {
    TUNDRA,
    DESERT,
    RAIN_FOREST,
    SAVANNAH,
    PLAINS,
    FOREST,
    MOUNTAIN,
    OCEAN;

    @Override
    public String toString() {
        return name().toLowerCase().replace('_', ' ');
    }
}
