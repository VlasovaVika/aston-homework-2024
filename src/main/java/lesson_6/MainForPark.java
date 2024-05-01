package lesson_6;

public class MainForPark {
    public static void main(String[] args) {
        Park.Attraction attraction1 = new Park.Attraction("CircleOfView", "7 am",
                "9 pm", 30);
        Park.Attraction attraction2 = new Park.Attraction("MiniHorse", "8 am",
                "10 pm", 10);
        System.out.println(attraction1);
        System.out.println(attraction2);
    }
}
