package lesson_8;

public class MyArrayDataException extends Exception {
    private int j;
    private int k;

    public MyArrayDataException(int j, int k) {
        this.j = j;
        this.k = k;
    }

    @Override
    public String toString() {
        return "Неверный формат данных в ячейке : [" + j + "][" + k + "]";
    }
}
