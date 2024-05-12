package lesson_7.task_2;

public interface Figure {
    public double calculatePerimeter();

    public double calculateArea();

    public default double calculatePerimeterOfCircle(double radius) {
        return 2 * radius * Math.PI;
    }

    public default double calculateAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public default double calculatePerimeterOfRectangle(double sideA, double sideB) {
        return 2 * (sideA + sideB);
    }

    public default double calculateAreaOfRectangle(double sideA, double sideB) {
        return sideA * sideB;
    }

    public default double calculatePerimeterOfTriangle(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    public default double calculateAreaOfTriangle(double sideA, double sideB, double sideC) {
        double polyperimeter = calculatePerimeter() / 2;
        return Math.sqrt(polyperimeter * (polyperimeter - sideA) * (polyperimeter - sideB) * (polyperimeter - sideC));
    }
}
