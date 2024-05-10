package lesson_7;

public class MainForAnimals {
    public static void main(String[] args) {
        Cat catMurka = new Cat("Murka", false);
        catMurka.run(201);
        catMurka.swim(300);
        Dog dogSharik = new Dog("Sharik");
        dogSharik.run(501);
        dogSharik.swim(502);
        Cat cat2 = new Cat("cat2", false);
        Cat.printAmountOfAnimals();
        Cat.printAmountOfCats();
        Dog.printAmountOfAnimals();
        Dog.printAmountOfDogs();
        Cat cat3 = new Cat("cat3", false);
        cat3.eatFromBowl(10,20, cat3);
        System.out.println(cat3.toString());
        cat3.eatFromBowl(10,10, cat3);
        System.out.println(cat3.toString());
        System.out.println(cat3.isFull());

    }
}
