package Interfaces_Final_Static_Polymorphism;

public class Interfaces_Final_Static_Polymorphism {
    public static void main(String[] args){
        Animal[] animals = new Animal[10];
        animals[0] = new Bear();
        animals[1] = new PolarBear();
        animals[2] = new Cougar();
        animals[3] = new Buffalo();
        animals[4] = new Camel();
        animals[5] = new Zebra();
        animals[6] = new Orca();
        animals[7] = new BlueWhale();
        animals[8] = new Walrus();
        animals[9] = new Toucan();

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
            animal.eat();
            if(animal instanceof ILand){
                ((ILand) animal).run();
            } if (animal instanceof ISwimmer){
                ((ISwimmer) animal).swim();
                ((ISwimmer) animal).breach();
            } if (animal instanceof IFlyer){
                ((IFlyer) animal).fly();
                ((IFlyer) animal).roost();
            } if (animal instanceof IHibernator){
                ((IHibernator) animal).storeFood(true);
                ((IHibernator) animal).hibernate();
                ((IHibernator) animal).isHibernating();
                ((IHibernator) animal).wakeUp();
            }
            animal.eat();
        }
    }
    static {
        String name = "Zonko's Zany Zoo";
        String[] animals = new String[]{
                "Bears",
                "Blue Whales",
                "Buffalo",
                "Camels",
                "Cougars",
                "Orca Whales",
                "Polar Bears",
                "Toucan",
                "Walrus",
                "Zebra"
        };

        System.out.printf("Welcome to %s! We have all sorts of animals! Like:%n", name);
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.printf("Enjoy your time here at %s!%n", name);
    }
}
