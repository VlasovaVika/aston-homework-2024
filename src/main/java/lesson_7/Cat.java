package lesson_7;

public class Cat extends Animal {
    private static int amountOfCats;

    public Cat(String name) {
        super(name);
        amountOfCats++;
    }

    public static void printAmountOfCats() {
        System.out.println("Amount of cats = " + amountOfCats);
    }

    @Override
    public void run(int length) {
        if (length <= 200) {
            super.run(length);
        } else {
            System.out.println("Cat can't run distance more than 200 m");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Cat can't swim");
    }
}
