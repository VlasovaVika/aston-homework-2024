package lesson_7.task_2;

public interface Characteristics extends Color, Figure {
    default String printAllCharacteristics() {
        return "Perimeter = " + calculatePerimeter() + ", area = " + calculateArea() +
                ", color of filling : "+ getColorOfFilling()+ " , color of border : " + getColorOfBorder();
    }
    default String printInfoAboutPerimeterAndArea(){
        return "Perimeter = " + calculatePerimeter() + ", area = " + calculateArea();
    }
    default String printInfoAboutColorOfFigure(){
        return "Color of filling : " + getColorOfFilling()+  ", color of border : " + getColorOfBorder();
    }
}
