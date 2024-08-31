package ZooAnimals;

public interface IHibernator {
    boolean storeFood(boolean extraFood);
    void hibernate();
    void wakeUp();
    boolean isHibernating();
}
