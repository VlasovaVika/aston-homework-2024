package lesson_7.task_1;

public class Cat extends Animal {
    private static int amountOfCats;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false;
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

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public void eatFromBowl(int foodInBowl, int foodWichCatWantsToEat, Cat cat, Bowl bowl) {
        if (foodInBowl >= foodWichCatWantsToEat) {
            cat.setFull(true);
            bowl.setFoodInBowl(foodInBowl - foodWichCatWantsToEat);
            System.out.println("Cat is eating");
        } else {
            System.out.println("There isn't enough food in bowl");
            cat.setFull(false);
        }
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() +
                "isFull = " + isFull +
                '}';
    }
}
