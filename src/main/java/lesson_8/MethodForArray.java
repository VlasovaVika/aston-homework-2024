package lesson_8;

public class MethodForArray {
    public int sumElementsFromArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Недопустимая длина массива!");
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j].length != 4) {
                throw new MyArraySizeException("Недопустимая длина массива!");
            }
            for (int k = 0; k < array[j].length; k++) {
                try {
                    sum = sum + Integer.parseInt(array[j][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(j, k);
                }
            }
        }
        return sum;
    }
}
