package ZooAnimals;

public enum EAnimalType {
    BEAR,
    POLAR_BEAR,
    COUGAR,
    BUFFALO,
    CAMEL,
    ZEBRA,
    ORCA,
    BLUE_WHALE,
    WALRUS,
    TOUCAN;

    @Override
    public String toString() {
        return name().toLowerCase().replace('_', ' ');
    }
}