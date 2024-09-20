package ZooAnimals;

public enum EMeat {
    FISH,
    DEER,
    SQUID,
    ZOOPLANKTON,
    INSECTS,
    CARRION,
    SEAL,
    SHRIMP,
    CRAB;

    @Override
    public String toString() {
        return name().toLowerCase().replace('_', ' ');
    }
}
