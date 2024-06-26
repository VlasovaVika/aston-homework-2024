package lesson_7.task_1;

public class MainForAnimals {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik");
        cats[1] = new Cat("Murka");
        cats[2] = new Cat("Leya");
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
