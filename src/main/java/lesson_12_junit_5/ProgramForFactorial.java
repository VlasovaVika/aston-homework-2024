package lesson_12_junit_5;

public class ProgramForFactorial {
    public static int calculateFactorial(int number) throws FactorialException {
        int result = 1;
        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        } else {
            throw new FactorialException("Недопустимое значение");
        }
        return result;
    }
}

