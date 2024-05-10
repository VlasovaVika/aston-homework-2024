package lesson_7;

public class MainForAnimals {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", false);
        cats[1] = new Cat("Murka", false);
        cats[2] = new Cat("Leya", false);
        Bowl bowl = new Bowl(40);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eatFromBowl(bowl.getFoodInBowl(), 15, cats[i], bowl);
            System.out.println(cats[i].toString());
        }
        bowl.addFoodInBowl(bowl, 60);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eatFromBowl(bowl.getFoodInBowl(), 15, cats[i], bowl);
            System.out.println(cats[i].toString());
        }
    }
}
