package lesson_12_junit_5;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(ProgramForFactorial.calculateFactorial(-1));
        } catch (FactorialException e) {
            System.out.println(e.getMessage());
        }
    }
}
