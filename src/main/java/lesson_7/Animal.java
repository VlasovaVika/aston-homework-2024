package lesson_7;

public class Animal {
    private String name;
    private static int amountOfAnimals;

    public Animal(String name) {
        this.name = name;
        amountOfAnimals++;
    }

    public static void printAmountOfAnimals() {
        System.out.println("Amount of animals = " + amountOfAnimals);
    }

    public void run(int length) {
        System.out.println(name + " ran " + length + " m");
    }

    public void swim(int length) {
        System.out.println(name + " swam " + length + " m");
    }
}
