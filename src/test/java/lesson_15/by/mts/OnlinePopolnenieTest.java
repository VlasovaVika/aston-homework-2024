package lesson_15.by.mts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OnlinePopolnenieTest extends BaseTest {
    OnlinePopolnenieObject onlinePopolnenieObject = new OnlinePopolnenieObject(driver);
    @Test
    @DisplayName("name of block")
    public void checkNameOfBlock() {
        OnlinePopolnenieObject onlinePopolnenieObject = new OnlinePopolnenieObject(driver);
        Assertions.assertEquals("Онлайн пополнение\n" + "без комиссии",
                onlinePopolnenieObject.getNameOfBlock());
    }

    @Test
    @DisplayName("visibility of logos")
    public void checkVisibilityOfLogos() {
        OnlinePopolnenieObject onlinePopolnenieObject = new OnlinePopolnenieObject(driver);
        assertAll(
                () -> assertTrue(onlinePopolnenieObject.checkVisibilityOfVisa()),
                () -> assertTrue(onlinePopolnenieObject.checkVisibilityOfVerifiedByVisa()),
                () -> assertTrue(onlinePopolnenieObject.checkVisibilityOfMastercard()),
                () -> assertTrue(onlinePopolnenieObject.checkVisibilityOfMastercardSecureCode()),
                () -> assertTrue(onlinePopolnenieObject.checkVisibilityOfBelcard())
        );
    }
}
