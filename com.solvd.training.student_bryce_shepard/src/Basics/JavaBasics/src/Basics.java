package Basics.JavaBasics.src;

public class Basics {
    public static void main(String[] args) {
        if (args.length < 1) {System.out.println("Please enter a name as an argument");}
        System.out.printf("Hello, %s!\n", args[0]);
    }
}