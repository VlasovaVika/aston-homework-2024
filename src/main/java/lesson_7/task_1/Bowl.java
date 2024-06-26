package lesson_7.task_1;

public class Bowl {
    private int foodInBowl;

    public Bowl(int foodInBowl) {
        this.foodInBowl = foodInBowl;
    }

    public int getFoodInBowl() {
        return foodInBowl;
    }

    public void setFoodInBowl(int foodInBowl) {
        this.foodInBowl = foodInBowl;
    }

    public void addFoodInBowl(Bowl bowl, int extraFood) {
        bowl.setFoodInBowl(bowl.getFoodInBowl() + extraFood);
        System.out.println("Food was added. Now in bowl there are " + bowl.getFoodInBowl() + " food");
    }
}
