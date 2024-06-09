package lesson_12_junit_5;

public class Main {
    public static void main(String[] args) throws FactorialException {
        try {
            System.out.println(ProgramForFactorial.calculateFactorial(0));
        } catch (FactorialException e) {
            System.out.println("Введено некорректное значение для расчета факториала, " +
                    "вводимое значение должно быть положительным и целочисленным");
        }
    }
}
