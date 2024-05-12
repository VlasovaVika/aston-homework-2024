package lesson_7.task_2;

import lesson_7.task_1.Cat;

public class MainForFigures {
    public static void main(String[] args) {
        Circle circle1 = new Circle(33);
        System.out.println(circle1.calculatePerimeterOfCircle(33));
        System.out.println(circle1.printAllCharacteristics());
        System.out.println(circle1.printInfoAboutPerimeterAndArea());
        circle1.setColorOfBorder("Yellow");
        circle1.setColorOfFilling("Brown");
        System.out.println(circle1.printAllCharacteristics());
    }
}
