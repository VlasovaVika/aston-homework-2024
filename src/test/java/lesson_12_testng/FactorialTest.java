package lesson_12_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test(description = "test for factorial of positive number")
    public void testCalculateFactorial1() throws FactorialException {
        Assert.assertEquals(ProgramForFactorial.calculateFactorial(5), 120);
    }

    @Test(description = "test for factorial with value of number = 0")
    public void testCalculateFactorial2() throws FactorialException {
        Assert.assertEquals(ProgramForFactorial.calculateFactorial(0), 1);
    }

    @Test(description = "test for factorial with value of number = -1")
    public void testCalculateFactorial3() {
        try {
            ProgramForFactorial.calculateFactorial(-1);
        } catch (FactorialException e) {
            Assert.assertEquals(e.getMessage(), "Недопустимое значение");
        }
    }
}
