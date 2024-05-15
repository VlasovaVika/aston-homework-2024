package lesson_8;

public class MainForArray {
    public static void main(String[] args) {
        String[][] array = {{"3", "4", "5", "6"}, {"3", "4", "5", "6"}, {"3", "4", "5", "6"}, {"3", "4", "5", "6"}};
        MethodForArray methodForArray = new MethodForArray();
        try {
            System.out.println(methodForArray.sumElementsFromArray(array));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.toString());
        }
    }
}
