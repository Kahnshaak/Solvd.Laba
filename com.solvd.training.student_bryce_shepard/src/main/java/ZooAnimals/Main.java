package ZooAnimals;

public class Main {
    public static void main(String[] args){
        Zoo zoo = Zoo.getInstance();

        zoo.addAnimal("Yogi", new Bear("Yogi"));
        zoo.addAnimal("Polar", new PolarBear("Polar"));
        zoo.addAnimal("Cosmo", new Cougar("Cosmo"));
        zoo.addAnimal("Bessie", new Buffalo("Bessie"));
        zoo.addAnimal("Dromedary", new Camel("Dromedary"));
        zoo.addAnimal("Marty", new Zebra("Marty"));
        zoo.addAnimal("Willy", new Orca("Willy"));
        zoo.addAnimal("Baleen", new BlueWhale("Baleen"));
        zoo.addAnimal("Wally", new Walrus("Wally"));
        zoo.addAnimal("Sam", new Toucan("Sam"));

        System.out.println(zoo);

        try {
            zoo.getAnimal("Yogi").eat();
        } catch (InvalidFoodException e) {
            throw new RuntimeException(e);
        }
        try {
            zoo.getAnimal("Yogi").eat();
        } catch (InvalidFoodException e) {
            throw new RuntimeException(e);
        }
        try {
            zoo.getAnimal("Yogi").eat();
        } catch (InvalidFoodException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        String name = "Zonko's Zany Zoo";

        System.out.printf("Welcome to %s! We have all sorts of animals! Like:%n", name);
        for (EAnimalType animal : EAnimalType.values()) {
            System.out.println(animal);
        }
        System.out.printf("Enjoy your time here at %s!%n", name);
    }
}
