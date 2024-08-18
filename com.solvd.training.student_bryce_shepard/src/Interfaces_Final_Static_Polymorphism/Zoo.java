package Interfaces_Final_Static_Polymorphism;

public class Zoo {
    static String name = "Zonko's Zany Zoo";
    static String[] animals = new String []{
            "Bears",
            "Blue Whales",
            "Cougars",
            "Orca Whales",
            "Polar Bears",
            "Toucan"
    };

    // Static method block and using static variables
    public static void ZooInfo(){
        System.out.printf("Welcome to %s! We have all sorts of animals! Like:%n", name);
        for (String animal: animals){
            System.out.println(animal);
        }
        System.out.printf("Enjoy your time here at %s!%n", name);
    }
}
