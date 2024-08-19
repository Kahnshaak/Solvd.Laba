package OOPApproach;

public class OOPApproach {
    public static void main(String[] args){
        int count = 0;
        Animal[] animals = new Animal[10];
        Zebra z = new Zebra();
        animals[count] = z;
        count++;
        Bear b = new Bear();
        animals[count] = b;
        count++;
        Toucan t = new Toucan();
        animals[count] = t;
        count++;
        Cougar c = new Cougar();
        animals[count] = c;
        count++;
        Orca o = new Orca();
        animals[count] = o;
        count++;
        BlueWhale bl = new BlueWhale();
        animals[count] = bl;
        count++;
        Buffalo bu = new Buffalo();
        animals[count] = bu;
        count++;
        Camel ca = new Camel();
        animals[count] = ca;
        count++;
        Penguin p = new Penguin();
        animals[count] = p;
        count++;
        Walrus w = new Walrus();
        animals[count] = w;

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        Orca oTwo = new Orca();
        System.out.println(o.equals(oTwo));
        System.out.println(c.equals(oTwo));
    }
}
