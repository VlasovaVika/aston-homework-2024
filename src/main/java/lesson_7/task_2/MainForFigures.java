package lesson_7.task_2;

import lesson_7.task_1.Cat;

public class MainForFigures {
    public static void main(String[] args) {
        Circle circle = new Circle(2.3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        circle.setColorOfFilling("Red");
        circle.setColorOfBorder("Green");
        System.out.println(circle.printAllCharacteristics());
        System.out.println(circle.calculateAreaOfCircle(2.3));
    }
}
