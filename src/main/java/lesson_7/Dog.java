package lesson_7;

public class Dog extends Animal {
    private static int amountOfDogs;

    public Dog(String name) {
        super(name);
        amountOfDogs++;
    }

    public static void printAmountOfDogs() {
        System.out.println("Amount of dogs = " + amountOfDogs);
    }

    @Override
    public void run(int length) {
        if (length <= 500) {
            super.run(length);
        } else {
            System.out.println("Dog can't run distance more than 500 m");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            super.swim(length);
        } else {
            System.out.println("Dog can't swim distance more than 10 m");
        }
    }
}
