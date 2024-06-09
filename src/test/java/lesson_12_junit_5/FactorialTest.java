package lesson_12_junit_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    @DisplayName("test for factorial of positive number")
    public void testCalculateFactorial1() throws FactorialException {
        Assertions.assertEquals(120, ProgramForFactorial.calculateFactorial(5));
    }

    @Test
    @DisplayName("test for factorial with value of number = 0")
    public void testCalculateFactorial2() throws FactorialException {
        Assertions.assertEquals(1, ProgramForFactorial.calculateFactorial(0));
    }

    @Test
    @DisplayName("test for factorial with value of number = -1")
    public void testCalculateFactorial3() {
        try {
            ProgramForFactorial.calculateFactorial(-1);
        } catch (FactorialException e) {
            Assertions.assertEquals("Недопустимое значение", e.getMessage());
        }
    }
}
