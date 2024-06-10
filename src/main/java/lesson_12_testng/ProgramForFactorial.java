package lesson_12_testng;

public class ProgramForFactorial {
    public static int calculateFactorial(int number) throws FactorialException {
        int result = 1;
        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        } else if (number == 0) {
            result = 1;
        } else {
            throw new FactorialException("Недопустимое значение");
        }
        return result;
    }
}
