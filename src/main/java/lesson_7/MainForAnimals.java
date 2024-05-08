package lesson_7;

public class MainForAnimals {
    public static void main(String[] args) {
        Cat catMurka = new Cat("Murka");
        catMurka.run(201);
        catMurka.swim(300);
        Dog dogSharik = new Dog("Sharik");
        dogSharik.run(501);
        dogSharik.swim(502);
        Cat cat2 = new Cat("cat2");
        Cat.printAmountOfAnimals();
        Cat.printAmountOfCats();
        Dog.printAmountOfAnimals();
        Dog.printAmountOfDogs();

    }
}
