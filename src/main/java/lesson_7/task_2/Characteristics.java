package lesson_7.task_2;

public interface Characteristics extends Color, Figure {
    public default String printAllCharacteristics() {
        return "Perimeter = " + calculatePerimeter() + ", area = " + calculateArea() +
                ", color of filling : "+ getColorOfFilling()+ " , color of border : " + getColorOfBorder();
    }
    public default String printInfoAboutPerimeterAndArea(){
        return "Perimeter = " + calculatePerimeter() + ", area = " + calculateArea();
    }
    public default String printInfoAboutColorOfFigure(){
        return "Color of filling : " + getColorOfFilling()+  ", color of border : " + getColorOfBorder();
    }
}
