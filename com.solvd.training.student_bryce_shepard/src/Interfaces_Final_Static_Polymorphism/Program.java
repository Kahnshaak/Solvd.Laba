package Interfaces_Final_Static_Polymorphism;

public class Program {
    public static void main(String[] args){
        Zoo.ZooInfo();

        int count = 0;
        Animal[] animals = new Animal[10];
        animals[count] = new Bear();
        count++;
        animals[count] = new PolarBear();
        count++;
        animals[count] = new Cougar();
        count++;
        animals[count] = new Buffalo();
        count++;
        animals[count] = new Camel();
        count++;
        animals[count] = new Zebra();
        count++;
        animals[count] = new Orca();
        count++;
        animals[count] = new BlueWhale();
        count++;
        animals[count] = new Walrus();
        count++;
        animals[count] = new Toucan();

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
                ((IHibernator) animal).wakeUp();
            }
            animal.eat();
        }
    }
}
