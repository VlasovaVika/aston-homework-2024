package lesson_7.task_2;

public interface Figure {
    double calculatePerimeter();

    double calculateArea();

    default double calculatePerimeterOfCircle(double radius) {
        return 2 * radius * Math.PI;
    }

    default double calculateAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    default double calculatePerimeterOfRectangle(double sideA, double sideB) {
        return 2 * (sideA + sideB);
    }

    default double calculateAreaOfRectangle(double sideA, double sideB) {
        return sideA * sideB;
    }

    default double calculatePerimeterOfTriangle(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    default double calculateAreaOfTriangle(double sideA, double sideB, double sideC) {
        double polyperimeter = calculatePerimeter() / 2;
        return Math.sqrt(polyperimeter * (polyperimeter - sideA) * (polyperimeter - sideB) * (polyperimeter - sideC));
    }
}
